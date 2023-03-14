package com.entidad.entidadAPI.repositorios;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.entidad.entidadAPI.modelos.PersonaModel;

@Repository
public interface PersonaRepository extends CrudRepository<PersonaModel,Long>{
	
	 //validar si existe un registro por numero de identificacion
	 boolean existsByNumeroIdentificacion(String numeroIdentificacion);
	 
	

}
