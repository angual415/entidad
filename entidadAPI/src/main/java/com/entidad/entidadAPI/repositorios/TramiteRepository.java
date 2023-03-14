package com.entidad.entidadAPI.repositorios;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.entidad.entidadAPI.modelos.TramiteModel;

@Repository
public interface TramiteRepository extends CrudRepository<TramiteModel,Long>{
	
	

}
