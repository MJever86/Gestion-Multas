package com.ayunalmeria.gestionmultas.backend.model;

import java.io.Serializable;
import java.util.Date;

public class Multa implements Serializable{
	private static final long serialVersionUID = -4642765L;
	
	private int codigo;
	private String agente;
	private Date fecha;
	private String motivo;
	private String matricula;
	private double importe;
	private String observacion;

	public Multa() {
		
	}
	
	public Multa(int codigo, String agente, Date fecha, String motivo, String matricula,double importe, String observacion) {
		this.codigo = codigo;
		this.agente = agente;
		this.fecha = fecha;
		this.motivo = motivo;
		this.matricula = matricula;
		this.importe = importe;
		this.observacion = observacion;
	}
	
	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getAgente() {
		return agente;
	}

	public void setAgente(String agente) {
		this.agente = agente;
	}

	public Date getFecha() {
		return fecha;
	}

	public String getMotivo() {
		return motivo;
	}

	public void setMotivo(String motivo) {
		this.motivo = motivo;
	}

	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}

	public String getObservacion() {
		return observacion;
	}

	public void setObservacion(String observacion) {
		this.observacion = observacion;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public double getImporte() {
		return importe;
	}

	public void setImporte(double importe) {
		this.importe = importe;
	}

	@Override
	public String toString() {
		return "Multa [codigo=" + codigo + ", agente=" + agente + ", fecha=" + fecha + ", motivo=" + motivo
				+ ", matricula=" + matricula + ", importe=" + importe + ", observacion=" + observacion + "]";
	}
	
}
