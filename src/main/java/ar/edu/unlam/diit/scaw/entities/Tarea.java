package ar.edu.unlam.diit.scaw.entities;

import java.util.Date;

public class Tarea {
	
	private Integer tareaId;
	private String titulo;
	private String descripcion;
	private Integer estadoId;
	private Integer tipoTarea;
	private Boolean editable;
	private Integer usuarioAlta;
	private Date fechaAlta = new Date();
	
	public Tarea(){
	}
	
	public Integer getTareaId(){
		return tareaId;
	}
	
	public void setTareaId(Integer tareaId){
		this.tareaId = tareaId;
	}
	
	public String getTitulo(){
		return titulo;
	}
	
	public void setTitulo(String titulo){
		this.titulo = titulo;
	}
	
	public String getDescripcion(){
		return descripcion;
	}
	
	public void setDescripcion(String descripcion){
		this.descripcion = descripcion;
	}
	
	public Integer getEstadoId(){
		return estadoId;
	}
	
	public void setEstadoId(Integer estadoId){
		this.estadoId = estadoId;
	}
	
	public Integer getTipoTarea(){
		return tipoTarea;
	}
	
	public void setTipoTarea(Integer tipoTarea){
		this.tipoTarea = tipoTarea;
	}
	
	public Boolean getEditable(){
		return editable;
	}
	
	public void setEditable(Boolean editable){
		this.editable = editable;
	}
	
	public Integer getUsuarioAlta(){
		return usuarioAlta;
	}
	
	public void setUsuarioAlta(Integer usuarioAlta){
		this.usuarioAlta = usuarioAlta;
	}
	
	public Date getFechaAlta(){
		return fechaAlta;
	}
	
	public void setFechaAlta(Date fechaAlta){
		this.fechaAlta = fechaAlta;
	}
}
