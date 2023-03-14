package com.entidad.entidadAPI.excepciones;

public class PersonaException extends RuntimeException {

    private String mensaje;

    public PersonaException(String mensaje) {
        this.mensaje = mensaje;
    }

    public String getMensaje() {
        return mensaje;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

}
