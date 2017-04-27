package ar.edu.unlam.diit.scaw.beans;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import javax.faces.bean.ManagedBean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import ar.edu.unlam.diit.scaw.entities.Usuario;
import ar.edu.unlam.diit.scaw.services.UsuarioService;

@ManagedBean(name = "usuariosBean", eager = true)
@RequestScoped
public class UsuarioBean implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private String nombre = null;
	private String apellido = null;
	private String email = null;
	private String password = null;
	private Integer rolId = null;
	private Boolean activo = null;
	private Date fechaAlta = null;
	
	//Spring Inject
	ApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"beans.xml"});
	UsuarioService service = (UsuarioService) context.getBean("usuarioService");
	
	public UsuarioBean() {
		super();
	}
	
	public String guardarUsuario() {
		Usuario usuario = buildUsuario();
		service.guardarUsuario(usuario);
		return "usuarios";
	}
	
	public List<Usuario> listarUsuarios() {
		List<Usuario> list = service.listarUsuarios();
		return list;
	}
	
	public String eliminarUsuario(Integer usuarioId) {
		service.eliminarUsuario(usuarioId);				
		return "usuarios";
	}
	
	public String activarUsuario(Integer usuarioId, Boolean activo) {
		activo = false;
		if (activo) {
			service.activarUsuario(usuarioId, activo);				
		}
		return "usuarios";
	}

	public String crearSesion(String email, String password ) throws ServletException { 
		List<Usuario> list = service.crearSesion(email, password);
			if(list.isEmpty()) {//si el usuario ya está registrado
				FacesContext.getCurrentInstance().getExternalContext().invalidateSession();
				return "login";
			} else {//si no está registrado
				FacesContext context = FacesContext.getCurrentInstance();
				HttpServletRequest request = (HttpServletRequest) context.getExternalContext().getRequest();
				
				Usuario usuario = new Usuario();
				usuario.setUsuarioId(list.get(0).getUsuarioId());
				usuario.setEmail(list.get(0).getEmail());
				usuario.setRolId(list.get(0).getRolId());
				usuario.setActivo(list.get(0).getActivo());
				
				HttpSession session = request.getSession(true);
				session.setAttribute("id", usuario.getUsuarioId());
				session.setAttribute("usuario", usuario.getEmail());
				session.setAttribute("tipo", usuario.getRolId());
				session.setAttribute("activo", usuario.getActivo());
				
				FacesContext.getCurrentInstance().getExternalContext().getSessionMap().put("usuario", usuario);
				
				if (usuario.getRolId() == 1) { 
					return "usuarios";	//Si es admin					
				} else {
					return "tareas";	//si es usuario
				}
			}
		}
		
		public String logout() {
			FacesContext.getCurrentInstance().getExternalContext().invalidateSession();
			return "login";
		}
	
	private Usuario buildUsuario() {
		Usuario usuario = new Usuario();
		usuario.setNombre(this.nombre);
		usuario.setApellido(this.apellido);
		usuario.setEmail(this.email);
		usuario.setPassword(this.password);
		usuario.setRolId(this.rolId);
		usuario.setActivo(this.activo);
		usuario.setFechaAlta(this.fechaAlta);
		
		return usuario;
	}

	public UsuarioBean(String nombre, String apellido, String email, String password, Integer rolId, Boolean activo, Date fechaAlta) {
		super();
		this.nombre = nombre;
		this.apellido = apellido;
		this.email = email;
		this.password = password;
		this.rolId = rolId;
		this.activo = activo;
		this.fechaAlta = fechaAlta;
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
		this.email = password;
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
	
}