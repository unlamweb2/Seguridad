package ar.edu.unlam.diit.scaw.services;

import java.util.List;

import ar.edu.unlam.diit.scaw.entities.Tarea;;

public interface TareaService {

	public void guardarTarea(Tarea tarea, Integer usuarioId);

	public List<Tarea> listarTareas();
	
	public void eliminarTarea(Integer tareaId);
	
	public void actualizarTarea(String tareaId, String titulo, String descripcion, Integer privacidad, Integer tipoTarea, Integer estadoId);

	public List<Tarea> listarTareasAnonimo();

}