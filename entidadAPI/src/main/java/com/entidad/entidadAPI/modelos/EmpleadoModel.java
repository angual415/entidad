package com.entidad.entidadAPI.modelos;

import javax.persistence.*;

@Entity
@Table(name="persona")
public class EmpleadoModel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_empleado")
	private Long idEmpleado;

	@Column(name="dependencia")
	private String dependencia;

	@Column(name="fechaIngreso")
	private String fechaIngreso;

	public EmpleadoModel() {
		super();
	}


	/**
	 * @return the idEmpleado
	 */
	public Long getIdEmpleado() {
		return idEmpleado;
	}




	/**
	 * @param idEmpleado the idEmpleado to set
	 */
	public void setIdEmpleado(Long idEmpleado) {
		this.idEmpleado = idEmpleado;
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
	public String getFechaIngreso() {
		return fechaIngreso;
	}

	/**
	 * @param fechaIngreso the fechaIngreso to set
	 */
	public void setFechaIngreso(String fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}


}
