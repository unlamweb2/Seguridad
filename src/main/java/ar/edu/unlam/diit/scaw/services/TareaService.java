package ar.edu.unlam.diit.scaw.services;

import java.util.List;

import ar.edu.unlam.diit.scaw.entities.Tarea;;

public interface TareaService {

	public void guardarTarea(Tarea tarea);

	public List<Tarea> listarTareas();
	
	public void eliminarTarea(Integer tareaId);

}
