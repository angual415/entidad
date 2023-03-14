package com.entidad.entidadAPI.Dto;

import javax.persistence.Column;

public class TramiteDto {
	
	
private Long id;
	
	private String numeroRadicado;
	
	private String anio;
	
	private String nombre;
	
	private String descripcion;
	
	private PersonaDto persona;
	
	private EmpleadoDto empleado;
	
	

	public TramiteDto() {
		super();
	}

	public TramiteDto(Long id, String numeroRadicado, String anio, String nombre, String descripcion,
			PersonaDto persona, EmpleadoDto empleado) {
		super();
		this.id = id;
		this.numeroRadicado = numeroRadicado;
		this.anio = anio;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.persona = persona;
		this.empleado = empleado;
	}

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * @return the numeroRadicado
	 */
	public String getNumeroRadicado() {
		return numeroRadicado;
	}

	/**
	 * @param numeroRadicado the numeroRadicado to set
	 */
	public void setNumeroRadicado(String numeroRadicado) {
		this.numeroRadicado = numeroRadicado;
	}

	/**
	 * @return the anio
	 */
	public String getAnio() {
		return anio;
	}

	/**
	 * @param anio the anio to set
	 */
	public void setAnio(String anio) {
		this.anio = anio;
	}

	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * @return the descripcion
	 */
	public String getDescripcion() {
		return descripcion;
	}

	/**
	 * @param descripcion the descripcion to set
	 */
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	/**
	 * @return the persona
	 */
	public PersonaDto getPersona() {
		return persona;
	}

	/**
	 * @param persona the persona to set
	 */
	public void setPersona(PersonaDto persona) {
		this.persona = persona;
	}

	/**
	 * @return the empleado
	 */
	public EmpleadoDto getEmpleado() {
		return empleado;
	}

	/**
	 * @param empleado the empleado to set
	 */
	public void setEmpleado(EmpleadoDto empleado) {
		this.empleado = empleado;
	}
	
	

}
