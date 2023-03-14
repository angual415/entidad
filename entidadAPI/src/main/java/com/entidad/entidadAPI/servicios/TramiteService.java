package com.entidad.entidadAPI.servicios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.entidad.entidadAPI.modelos.TramiteModel;
import com.entidad.entidadAPI.repositorios.TramiteRepository;

@Service
public class TramiteService implements ITramiteService{

	TramiteRepository tramiteRepo;
	
	public TramiteService(@Autowired TramiteRepository tramiteRepos) {
		this.tramiteRepo = tramiteRepos;
	}

	public void guardarTramite(TramiteModel tramite) {

			tramiteRepo.save(tramite);
	}

}


