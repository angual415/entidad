package com.entidad.entidadAPI.Dto;

import java.util.Date;

public class EmpleadoDto {
	
private Long id;
	
	private String dependencia;
	
	private Date fechaIngreso;
	
	private PersonaDto persona;
	
	public EmpleadoDto() {
		super();
	}

	public EmpleadoDto(Long id, String dependencia, Date fechaIngreso, PersonaDto persona) {
		super();
		this.id = id;
		this.dependencia = dependencia;
		this.fechaIngreso = fechaIngreso;
		this.persona = persona;
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
	 * @return the dependencia
	 */
	public String getDependencia() {
		return dependencia;
	}

	/**
	 * @param dependencia the dependencia to set
	 */
	public void setDependencia(String dependencia) {
		this.dependencia = dependencia;
	}

	/**
	 * @return the fechaIngreso
	 */
	public Date getFechaIngreso() {
		return fechaIngreso;
	}

	/**
	 * @param fechaIngreso the fechaIngreso to set
	 */
	public void setFechaIngreso(Date fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
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
	
	
}
