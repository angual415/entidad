package com.entidad.entidadAPI.servicios;

import com.entidad.entidadAPI.modelos.PersonaModel;

public interface IPersonaService {

	PersonaModel consultarPersona(String tipoIdentificacion, String numeroIdentificacion);
}
