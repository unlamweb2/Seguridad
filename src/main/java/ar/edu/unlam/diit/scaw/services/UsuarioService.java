package ar.edu.unlam.diit.scaw.services;

import java.util.List;

import ar.edu.unlam.diit.scaw.entities.Usuario;;

public interface UsuarioService {

	public void guardarUsuario(Usuario usuario);

	public List<Usuario> listarUsuarios();
	
	public void eliminarUsuario(Integer usuarioId);
	
	public Usuario buscarUsuario(String email, String password);

}
