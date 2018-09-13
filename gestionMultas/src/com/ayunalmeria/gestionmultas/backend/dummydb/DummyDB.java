package com.ayunalmeria.gestionmultas.backend.dummydb;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import com.ayunalmeria.gestionmultas.backend.model.Multa;




public class DummyDB {

	private static final Map<Integer,Multa> MAPA_MULTAS = new HashMap<>();
	
	static {
		
		String strFecha1 = "24/12/2017";
		String strFecha2 = "13/08/2017";
		String strFecha3 = "02/09/2017";
		String strFecha4 = "27/03/2017";
		String strFecha5 = "12/12/2017";
		
		Date fecha1 = null;
		Date fecha2 = null;
		Date fecha3 = null;
		Date fecha4 = null;
		Date fecha5 = null;
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		try {
			fecha1 = sdf.parse(strFecha1);
			fecha2 = sdf.parse(strFecha2);
			fecha3 = sdf.parse(strFecha3);
			fecha4 = sdf.parse(strFecha4);
			fecha5 = sdf.parse(strFecha5);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		Multa p1 = new Multa(25709002, "Honorio Martin Salvador",fecha1,"Sobrepasar dos minutos el tiempo de estacionamiento en zona azul", "3446DKS", 100.00, "El infractor,con muletas, iba acompañado de dos personas de avanzada edad");
		Multa p2 = new Multa(18763287, "Gustavo Rodriguez Sierra",fecha2,"Saltar ceda el paso","1555RKM",200.00, "El infractor, se saltó un ceda al paso en un cruce peligroso");
		Multa p3 = new Multa(19757560, "Maria Jimenez Jaen",fecha3,"Ocupa zona minusvalos","1567JMM",60.00, "El infractor, ocupa plaza de minusvalido");
		Multa p4 = new Multa(90726234, "Maria Jimenez Jaen",fecha4,"Saltar ceda el paso","2222FMT",200.00, "El infractor, se saltó un ceda al paso en un cruce");
		Multa p5 = new Multa(40533574, "Victor Mendez Garcia",fecha5,"Saltar semaforo en rojo","3424HTM",300.00, "El infractor, se saltó un semaforo en rojo poniendo en peligro a los transeuntes");

		MAPA_MULTAS.put(p1.getCodigo(), p1);
		MAPA_MULTAS.put(p2.getCodigo(), p2);
		MAPA_MULTAS.put(p3.getCodigo(), p3);
		MAPA_MULTAS.put(p4.getCodigo(), p4);
		MAPA_MULTAS.put(p5.getCodigo(), p5);
	}

	
	public DummyDB() {
		
	}
	
	public Map<Integer,Multa> getMapaMultas(){
		return MAPA_MULTAS;
	}
}
