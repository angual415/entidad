package com.entidad.entidadAPI.servicios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.entidad.entidadAPI.modelos.EmpleadoModel;
import com.entidad.entidadAPI.repositorios.EmpleadoRepository;

@Service
public class EmpleadoService implements IEmpleadoService{

	EmpleadoRepository empleadoRepo;
	
	public EmpleadoService(@Autowired EmpleadoRepository empleadoRepos) {
		this.empleadoRepo = empleadoRepos;
	}

	public void guardarEmpleado(EmpleadoModel empleado) {
			empleadoRepo.save(empleado);
	}

}


