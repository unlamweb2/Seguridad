package ar.edu.unlam.diit.scaw.beans;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.faces.bean.RequestScoped;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;
import javax.faces.bean.ManagedBean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import ar.edu.unlam.diit.scaw.entities.Tarea;
import ar.edu.unlam.diit.scaw.services.TareaService;

@ManagedBean(name = "tareaBean", eager = true)
@RequestScoped
public class TareaBean implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Integer tareaId = null;
	private String titulo = null;
	private String descripcion = null;
	private Integer estadoId = null;
	private Integer privacidad = null;
	private Integer tipoTarea = null;
	private Integer usuarioAlta = null;
	private Date fechaAlta = new Date();
	
	//Spring Inject
	ApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"beans.xml"});
	TareaService service = (TareaService) context.getBean("tareaService");
	
	public TareaBean() {
		super();
	}
	
	public String guardarTarea(Integer usuarioId) {
		Tarea tarea = buildTarea();
		service.guardarTarea(tarea, usuarioId);
		return "tareas";
	}
	
	public List<Tarea> listarTareas() {
		List<Tarea> list = service.listarTareas();
		return list;
	}
	
	public List<Tarea> listarTareasAnonimo() {
		List<Tarea> listAno = service.listarTareasAnonimo();
		return listAno;
	}
	
	public String eliminarTarea(Integer tareaId) {
		service.eliminarTarea(tareaId);				
		return "tareas";
		}
	
	public String editarTarea(String tareaId, String titulo, String descripcion, Integer privacidad, Integer tipoTarea, Integer estadoId, Integer usuarioAlta) {		
		this.setTareaId(Integer.parseInt(tareaId));
		this.setTitulo(titulo);
		this.setDescripcion(descripcion);		
		this.setTipoTarea(tipoTarea);
		this.setEstadoId(estadoId);
		this.setUsuarioAlta(usuarioAlta);
		
		return "editarTarea";
	}
	
	public String actualizarTarea(String titulo, String descripcion, Integer privacidad, Integer tipoTarea, Integer estadoId) {	
		ExternalContext ec = FacesContext.getCurrentInstance().getExternalContext();
	    String tareaId = ec.getRequestParameterMap().get("formId:tareaId");
		service.actualizarTarea(tareaId, titulo, descripcion, privacidad, tipoTarea, estadoId);
		
		return "tareas";
	}
	
	private Tarea buildTarea() {
		Tarea tarea = new Tarea();
		tarea.setTareaId(this.tareaId);
		tarea.setTitulo(this.titulo);
		tarea.setDescripcion(this.descripcion);
		tarea.setEstadoId(this.estadoId);
		tarea.setPrivacidad(this.privacidad);
		tarea.setTipoTarea(this.tipoTarea);
		tarea.setUsuarioAlta(this.usuarioAlta);
		tarea.setFechaAlta(this.fechaAlta);
		
		return tarea;
	}

	public TareaBean(Integer tareaId, String titulo, String descripcion, Integer estadoId, Integer privacidad, Integer tipoTarea, Integer usuarioAlta, Date fechaAlta) {
		super();
		this.tareaId = tareaId;
		this.titulo = titulo;
		this.descripcion = descripcion;
		this.estadoId = estadoId;
		this.privacidad = privacidad;
		this.tipoTarea = tipoTarea;
		this.usuarioAlta = usuarioAlta;
		this.fechaAlta = fechaAlta;
	}
	
	public Integer getTareaId(){
		return tareaId;
	}
	
	public void setTareaId(Integer tareaId){
		this.tareaId = tareaId;
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
	
	public Integer getPrivacidad(){
		return privacidad;
	}
	
	public void setPrivacidad(Integer privacidad){
		this.privacidad = privacidad;
	}
	
	public Integer getTipoTarea(){
		return tipoTarea;
	}
	
	public void setTipoTarea(Integer tipoTarea){
		this.tipoTarea = tipoTarea;
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