package ar.edu.unlam.diit.scaw.entities;

public class TiposTarea {

	private Integer tiposTareaId;
	private String descripcion;
	
	public TiposTarea() {
	}
	
	public Integer getTiposTareaId() {
		return tiposTareaId;
	}
	
	public void setTiposTareaId(Integer tiposTareaId) {
		this.tiposTareaId = tiposTareaId;
	}
	
	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
}
