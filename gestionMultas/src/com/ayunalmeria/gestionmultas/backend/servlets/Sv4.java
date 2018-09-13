package com.ayunalmeria.gestionmultas.backend.servlets;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ayunalmeria.gestionmultas.backend.model.Multa;
import com.ayunalmeria.gestionmultas.backend.services.MultaServices;
import com.ayunalmeria.gestionmultas.backend.services.impl.MultaServicesImpl;

@WebServlet("/fechainifin")
public class Sv4 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private MultaServices fecha = new MultaServicesImpl();

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String strFecha2 = "24/12/2017";
		String strFecha1 = "13/08/2017";
		
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		Date fecha1 = null;
		Date fecha2 = null;
		
		try {
			fecha1 = sdf.parse(strFecha1);
			fecha2 = sdf.parse(strFecha2);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		List <Multa> fechainiciofin = fecha.getBetweenDates(fecha1, fecha2);
		

		request.setAttribute("lista", fechainiciofin);
		

		request.getRequestDispatcher("WEB-INF/ficha.jsp").forward(request, response);
	}

}
