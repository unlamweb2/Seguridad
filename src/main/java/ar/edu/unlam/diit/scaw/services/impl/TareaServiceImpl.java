package ar.edu.unlam.diit.scaw.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import ar.edu.unlam.diit.scaw.daos.TareaDao;
import ar.edu.unlam.diit.scaw.entities.Tarea;
import ar.edu.unlam.diit.scaw.services.TareaService;

public class TareaServiceImpl implements TareaService {

	@Autowired
	TareaDao tareaDao;
	
	@Override
	public void guardarTarea(Tarea tarea) {
		tareaDao.guardarTarea(tarea);
	}

	@Override
	public List<Tarea> listarTareas() {
		return tareaDao.listarTareas();
	}
	
	@Override
	public void eliminarTarea(Integer tareaId) {
		tareaDao.eliminarTarea(tareaId);
	}

	public TareaDao getTareaDao() {
		return tareaDao;
	}

	public void setTareaDao(TareaDao tareaDao) {
		this.tareaDao = tareaDao;
	}
	
}
