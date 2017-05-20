package ar.edu.unlam.diit.scaw.entities;

import java.io.Serializable;
import java.util.Date;

public class Usuario implements Serializable {

	private static final long serialVersionUID = 1L;

	private Integer usuarioId;
	private String nombre;
	private String apellido;
	private String email;
	private String password;
	private Integer rolId;
	private Boolean activo;	 	
	private Date fechaAlta = new Date();
	private Boolean aprobado;

	public Usuario(String nombre, String apellido, String email, String password, Integer rolId, Boolean activo, Date fechaAlta, Boolean aprobado){
		this.nombre = nombre;
		this.apellido = apellido;
		this.email = email;
		this.password = password;
		this.rolId = rolId;
		this.activo = activo;
		this.fechaAlta = fechaAlta;
		this.aprobado= aprobado;
	}
	
	public Usuario() {
	}

	public Integer getUsuarioId() {
		return usuarioId;
	}

	public void setUsuarioId(Integer usuarioId) {
		this.usuarioId = usuarioId;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido() {
		return apellido;
	}

	public void setApellido(String apellido) {
		this.apellido = apellido;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Integer getRolId() {
		return rolId;
	}
	
	public void setRolId(Integer rolId) {
		this.rolId = rolId;
	}

	public Boolean getActivo() {
		return activo;
	}
	
	public void setActivo(Boolean activo) {
		this.activo = activo;
	}
	
	public Date getFechaAlta() {
		return fechaAlta;
	}
	
	public void setFechaAlta(Date fechaAlta) {
		this.fechaAlta = fechaAlta;
	}
	
	public Boolean getAprobado() {
		return aprobado;
	}
	
	public void setAprobado(Boolean aprobado) {
		this.aprobado = aprobado;
	}
	
}
