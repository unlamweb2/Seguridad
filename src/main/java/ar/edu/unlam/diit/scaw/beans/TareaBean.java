package ar.edu.unlam.diit.scaw.beans;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.faces.bean.RequestScoped;
import javax.faces.bean.ManagedBean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import ar.edu.unlam.diit.scaw.entities.Tarea;
import ar.edu.unlam.diit.scaw.services.TareaService;

@ManagedBean(name = "tareaBean", eager = true)
@RequestScoped
public class TareaBean implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String titulo = null;
	private String descripcion = null;
	private Integer estadoId = null;
	private Integer tipoTarea = null;
	private Boolean editable = null;
	private Integer usuarioAlta = null;
	private Date fechaAlta = new Date();
	
	//Spring Inject
	ApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"beans.xml"});
	TareaService service = (TareaService) context.getBean("tareaService");
	
	public TareaBean() {
		super();
	}
	
	public String guardarTarea() {
		Tarea tarea = buildTarea();
		service.guardarTarea(tarea);
		return "tareas";
	}
	
	public List<Tarea> listarTareas() {
		List<Tarea> list = service.listarTareas();
		return list;
	}
	
	public String eliminarTarea(Integer tareaId) {
		service.eliminarTarea(tareaId);				
		return "tareas";
		}
	
	private Tarea buildTarea() {
		Tarea tarea = new Tarea();
		tarea.setTitulo(this.titulo);
		tarea.setDescripcion(this.descripcion);
		tarea.setEstadoId(this.estadoId);
		tarea.setTipoTarea(this.tipoTarea);
		tarea.setEditable(this.editable);
		tarea.setUsuarioAlta(this.usuarioAlta);
		tarea.setFechaAlta(this.fechaAlta);
		
		return tarea;
	}

	public TareaBean(String titulo, String descripcion, Integer estadoId, Integer tipoTarea, Boolean editable, Integer usuarioAlta, Date fechaAlta) {
		super();
		this.titulo = titulo;
		this.descripcion = descripcion;
		this.estadoId = estadoId;
		this.tipoTarea = tipoTarea;
		this.editable = editable;
		this.usuarioAlta = usuarioAlta;
		this.fechaAlta = fechaAlta;
	}
	
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
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
	
	public Date getFechaAlta() {
		return fechaAlta;
	}
	
	public void setFechaAlta(Date fechaAlta) {
		this.fechaAlta = fechaAlta;
	}
	
}