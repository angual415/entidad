package com.entidad.entidadAPI.servicios;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.entidad.entidadAPI.modelos.PersonaModel;
import com.entidad.entidadAPI.repositorios.PersonaRepository;

@Service
public class PersonaService implements IPersonaService{

	PersonaRepository personaRepo;
	
	public PersonaService(@Autowired PersonaRepository personaRepos) {
		this.personaRepo = personaRepos;
	}

	public boolean guardarPersona(PersonaModel persona) {

		try {
			if(!personaRepo.existsByNumeroIdentificacion(persona.getNumeroIdentificacion())){
				personaRepo.save(persona);
				return true;
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return false;
	}
	
	public PersonaModel consultarPersona(String tipoIdentificacion, String numeroIdentificacion) {

		return null;
	}

}


