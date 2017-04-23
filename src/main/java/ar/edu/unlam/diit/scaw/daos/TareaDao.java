package ar.edu.unlam.diit.scaw.daos;

import java.util.List;

import ar.edu.unlam.diit.scaw.entities.Tarea;;

public interface TareaDao {

	public void guardarTarea(Tarea tarea);

	public List<Tarea> listarTareas();
	
	public void eliminarTarea(Integer tareaId);

}
