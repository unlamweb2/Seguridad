package ar.edu.unlam.diit.scaw.daos.impl;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

import ar.edu.unlam.diit.scaw.daos.UsuarioDao;
import ar.edu.unlam.diit.scaw.entities.Usuario;;

public class UsuarioDaoImpl implements UsuarioDao {

	@Autowired
	NamedParameterJdbcTemplate jdbcTemplate;

	public UsuarioDaoImpl() {
		super();
	}

	@Override
	public void guardarUsuario(Usuario usuario) {
		String sql = "INSERT INTO Usuarios (Nombre, Apellido, Email, Password, RolId, Activo, FechaAlta) VALUES (:nombre, :apellido, :email, :password, :rolId, :activo, :fechaAlta)";
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("nombre", usuario.getNombre());
		params.put("apellido", usuario.getApellido());
		params.put("email", usuario.getEmail());
		params.put("password", usuario.getPassword());
		params.put("rolId", usuario.getRolId());
		params.put("activo", usuario.getActivo());
		params.put("fechaAlta", usuario.getFechaAlta());
		jdbcTemplate.update(sql, params);
	}

	@Override
	public List<Usuario> listarUsuarios() {
		String sql = "SELECT * FROM Usuarios";
		Map<String, Object> params = new HashMap<String, Object>();
		List<Usuario> result = jdbcTemplate.query(sql, params, new UsuarioMapper());
		return result;
	}
		
	@Override
	public List<Usuario> listarUsuariosInactivos() {
		String sql = "SELECT * FROM Usuarios WHERE Activo = false";
		Map<String, Object> params = new HashMap<String, Object>();
		List<Usuario> result = jdbcTemplate.query(sql, params, new UsuarioMapper());
		return result;
	}
		
	@Override
	public void eliminarUsuario(Integer usuarioId) {
		String sql = "UPDATE Usuarios SET Activo = false WHERE usuarioId LIKE :usuarioId";
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("usuarioId", usuarioId);
		jdbcTemplate.update(sql, params);	
	}
		
	@Override
	public void activarUsuario(Integer usuarioId, Boolean activo) {	
		activo = true;
		String sql = "UPDATE Usuarios SET Activo = :activo, FechaAlta = CURDATE() WHERE UsuarioId = :usuarioId";
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("activo", activo);
		params.put("usuarioId", usuarioId);
		jdbcTemplate.update(sql, params);		
	}
	
	@Override
      public Usuario buscarUsuario(String email, String password) {
		
		try{
		String sql = "SELECT * FROM Usuarios WHERE email = " + email + " AND Password = "+ password +"";
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("email", email);
		params.put("password", password);
		List<Usuario> result = jdbcTemplate.query(sql, params, new UsuarioMapper());
		if(result.size() == 0)//no encontró usuario
			return null;
		else
			return result.get(0);
		}
		catch(Exception e) {
			return new Usuario();
		}
	}
	
	@Override
	public Usuario crearSesion(String email, String password){
	
		String sql = "SELECT * FROM Usuarios WHERE Email = '" + email + "' AND Password = '" + password + "' AND activo = :activo";
		Map<String, Object> params = new HashMap<String, Object>();
		params.put("usuario", email);
		params.put("password", password);
		params.put("activo", true);
		List<Usuario> result = jdbcTemplate.query(sql, params, new UsuarioMapper());
		if(result.size() == 0)//no encontró usuario
			return null;
		else
			return result.get(0);		
	}

	public NamedParameterJdbcTemplate getJdbcTemplate() {
		return jdbcTemplate;
	}

	public void setJdbcTemplate(NamedParameterJdbcTemplate jdbcTemplate) {
		this.jdbcTemplate = jdbcTemplate;
	}

	private static final class UsuarioMapper implements RowMapper<Usuario> {

		public Usuario mapRow(ResultSet rs, int rowNum) throws SQLException {
			Usuario usuario = new Usuario();
			usuario.setUsuarioId(rs.getInt("usuarioId"));
			usuario.setNombre(rs.getString("nombre"));
			usuario.setApellido(rs.getString("apellido"));
			usuario.setEmail(rs.getString("email"));
			usuario.setPassword(rs.getString("password"));
			usuario.setRolId(rs.getInt("rolId"));
			usuario.setActivo(rs.getBoolean("activo"));
			usuario.setFechaAlta(rs.getDate("fechaAlta"));
			return usuario;
		}
	}
}