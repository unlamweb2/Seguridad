package ar.edu.unlam.diit.scaw.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import ar.edu.unlam.diit.scaw.daos.UsuarioDao;
import ar.edu.unlam.diit.scaw.entities.Usuario;
import ar.edu.unlam.diit.scaw.services.UsuarioService;

public class UsuarioServiceImpl implements UsuarioService {

	@Autowired
	UsuarioDao usuarioDao;
	
	@Override
	public void guardarUsuario(Usuario usuario) {
		usuarioDao.guardarUsuario(usuario);
	}

	@Override
	public List<Usuario> listarUsuarios() {
		return usuarioDao.listarUsuarios();
	}

	@Override
	public void eliminarUsuario(Integer usuarioId) {
		usuarioDao.eliminarUsuario(usuarioId);
	}
	
	@Override
	public void activarUsuario(Integer usuarioId, Boolean activo) {
		usuarioDao.activarUsuario(usuarioId, activo);
	}
	
	@Override
	public Usuario buscarUsuario(String email, String password) {
		return usuarioDao.buscarUsuario(email, password);
	}
	
	public List<Usuario> crearSesion(String email, String password) {
		return usuarioDao.crearSesion(email, password);
	}
	
	public UsuarioDao getUsuarioDao() {
		return usuarioDao;
	}

	public void setUsuarioDao(UsuarioDao usuarioDao) {
		this.usuarioDao = usuarioDao;
	}
	
}
