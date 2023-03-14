package com.entidad.entidadAPI.modelos;

import javax.persistence.*;

@Entity
@Table(name="persona")
public class TramiteModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_tramite")
	private Long idTramite;
	
	@Column(name="numeroRadicado")
	private String numeroRadicado;
	
	@Column(name="anio")
	private String anio;
	
	@Column(name="nombre")
	private String nombre;
	
	@Column(name="descripcion")
	private String descripcion;
	

	public TramiteModel() {
		super();
	}

	/**
	 * @return the idTramite
	 */
	public Long getIdTramite() {
		return idTramite;
	}


	/**
	 * @param idTramite the idTramite to set
	 */
	public void setIdTramite(Long idTramite) {
		this.idTramite = idTramite;
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



}
