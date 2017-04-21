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
	public void save(Usuario usuario) {

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
	public List<Usuario> findAll() {
		Map<String, Object> params = new HashMap<String, Object>();

		String sql = "SELECT * FROM PERSON";

		List<Usuario> result = jdbcTemplate.query(sql, params, new UsuarioMapper());

		return result;
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
