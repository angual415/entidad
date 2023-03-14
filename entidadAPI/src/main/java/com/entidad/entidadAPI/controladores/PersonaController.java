package com.entidad.entidadAPI.controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.entidad.entidadAPI.modelos.PersonaModel;
import com.entidad.entidadAPI.servicios.PersonaService;

@RestController
@RequestMapping("/persona")
public class PersonaController {

	PersonaService personaService;
	
	
	public PersonaController(@Autowired PersonaService personaService) {
		this.personaService = personaService;
	}

	@PostMapping("")
    public  void guardarPersona(@RequestBody PersonaModel persona) {
		
		boolean guardo = personaService.guardarPersona(persona);
		   HttpStatus status = guardo ?  HttpStatus.OK : HttpStatus.FORBIDDEN;
		  // return new ResponseEntity<>(isMutant, status);
    }

//	@GetMapping(produces =  MediaType.APPLICATION_JSON_VALUE)
//	public @ResponseBody
//	 PersonaDto getPersona() {
//		return personaService.consultarPersona(null, null);
//	}
}
