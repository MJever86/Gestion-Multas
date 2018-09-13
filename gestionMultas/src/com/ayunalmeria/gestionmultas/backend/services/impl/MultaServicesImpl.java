package com.ayunalmeria.gestionmultas.backend.services.impl;

import java.util.*;
import java.util.stream.Collectors;

import com.ayunalmeria.gestionmultas.backend.dummydb.DummyDB;
import com.ayunalmeria.gestionmultas.backend.model.Multa;
import com.ayunalmeria.gestionmultas.backend.services.MultaServices;

public class MultaServicesImpl implements MultaServices{
	
	private DummyDB dummyDB = new DummyDB();
	
	@Override
	public void create(Multa multa) {

		dummyDB.getMapaMultas().put(multa.getCodigo(), multa);
	}

	@Override
	public List<Multa> getAll() {
		List <Multa> listaMultas = new ArrayList<Multa>(dummyDB.getMapaMultas().values());
		return listaMultas;
	}
		
	@Override
	public List<Multa> getByPriceRange(double min, double max) {
		
		return dummyDB.getMapaMultas().values().stream().filter(p -> p.getImporte() >= min && p.getImporte() <= max).collect(Collectors.toList());
	}

	@Override
	public List<Multa> getBetweenDates(Date fecha1, Date fecha2) {
		List <Multa> listaMultas = new ArrayList<Multa>(dummyDB.getMapaMultas().values());
		List <Multa> multabusqueda = new ArrayList<Multa>();
		
		for(Multa fecha: listaMultas) {
			
			if(fecha.getFecha().compareTo(fecha1) >= 0 && fecha.getFecha().compareTo(fecha2) <= 0) {

				multabusqueda.add(fecha);
			}
		}
		return multabusqueda;
	}

	@Override
	public List<Multa> getByAgente(String agente) {
		List<Multa> listaResultados = new ArrayList<Multa>();
		
		for (Multa multa: dummyDB.getMapaMultas().values()) {
			if (multa.getAgente().equals(agente)) {
				listaResultados.add(multa);
			}else {
				System.out.println("No se encuentra el agente...");
			}
		}
		
		return listaResultados;
	}

	public List<Multa> getMultaByMatricula(String matricula){
		return dummyDB.getMapaMultas().values()
				.stream().filter(m->m.getMatricula().equalsIgnoreCase(matricula)).collect(Collectors.toList());
	}


}

