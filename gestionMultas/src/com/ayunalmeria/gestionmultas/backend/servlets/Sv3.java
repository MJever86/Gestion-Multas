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

@WebServlet("/minimax")
public class Sv3 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	private MultaServices minimomaximo = new MultaServicesImpl();

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		List <Multa> minmax = minimomaximo.getByPriceRange(100,150);

		request.setAttribute("lista", minmax);

		request.getRequestDispatcher("WEB-INF/ficha.jsp").forward(request, response);
		
	}

}
