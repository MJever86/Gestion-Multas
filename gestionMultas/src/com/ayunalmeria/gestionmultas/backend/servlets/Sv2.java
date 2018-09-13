package com.ayunalmeria.gestionmultas.backend.servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.ayunalmeria.gestionmultas.backend.model.Multa;
import com.ayunalmeria.gestionmultas.backend.services.MultaServices;
import com.ayunalmeria.gestionmultas.backend.services.impl.MultaServicesImpl;


@WebServlet("/codigomatricula")
public class Sv2 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private MultaServices multaservices = new MultaServicesImpl();
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String codmatricula = request.getParameter("matricula");		

		List<Multa> mul1 = multaservices.getMultaByMatricula(codmatricula);
	
		request.setAttribute("nummatricula", mul1);
		
		request.getRequestDispatcher("WEB-INF/codMatricula.jsp").forward(request, response);
		
	}
}
