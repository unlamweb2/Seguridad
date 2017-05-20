package ar.edu.unlam.diit.scaw.services;

import java.util.List;

import ar.edu.unlam.diit.scaw.entities.Usuario;;

public interface UsuarioService {


	
	public void guardarUsuario(Usuario usuario);

	public List<Usuario> listarUsuarios();
	
	public List<Usuario> listarPendientes();
	
	public void eliminarUsuario(Integer usuarioId);
	
	public void activarUsuario(Integer usuarioId, Boolean activo);
	
	public Usuario buscarUsuario(String email, String password);
	
	public Usuario crearSesion(String email, String password);
	
	public List<Usuario> listarUsuariosInactivos();
	
	public void aprobarUsuario(Integer usuarioId);
	
}
