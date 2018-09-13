package com.ayunalmeria.gestionmultas.backend.services;

import java.util.Date;
import java.util.List;

import com.ayunalmeria.gestionmultas.backend.model.Multa;

public interface MultaServices {

	/**
	 * 
	 * @param multa
	 */
	public void create(Multa multa);
	
	public List<Multa> getAll();
	
	public List<Multa> getMultaByMatricula(String matricula);
	
	public List<Multa> getByAgente(String agente);
	
	public List<Multa> getByPriceRange(double min, double max);
	
	public List<Multa> getBetweenDates(Date fecha1, Date fecha2);
	
}

