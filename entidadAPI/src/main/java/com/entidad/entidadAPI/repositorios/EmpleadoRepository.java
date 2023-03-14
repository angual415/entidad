package com.entidad.entidadAPI.repositorios;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.entidad.entidadAPI.modelos.EmpleadoModel;

@Repository
public interface EmpleadoRepository extends CrudRepository<EmpleadoModel,Long>{
	
	
	

}
