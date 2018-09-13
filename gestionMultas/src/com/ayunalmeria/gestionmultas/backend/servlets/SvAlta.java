package com.ayunalmeria.gestionmultas.backend.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * Servlet implementation class SvAlta
 */
@WebServlet({"/altademulta" })
public class SvAlta extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String strCodigo= request.getParameter("mcodigo");
		//int codigo = Integer.parseInt(strCodigo);
		String agente= request.getParameter("magente");
		String fecha= request.getParameter("mfecha");
		String motivo= request.getParameter("minfra");
		String matricula= request.getParameter("mmatricula");
		String importe= request.getParameter("mimporte");
		String observaciones= request.getParameter("mobser");

		System.out.println("Creamos multa con código " + strCodigo + agente + fecha + motivo + matricula + importe + observaciones);

		
		
		
		
		// 1.- Parsear parametros
			
		// 2.- Instanciar la multa   Multa multa = new Multa(.......)
		
		// 3.- Crear la multa  ---> multaServices.create(multa);
		
		// 4.- Emitir response
		
		response.sendRedirect("formulario.html"); 
		
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

}
