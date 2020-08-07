package com.rosters.controllers;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.rosters.models.Team;

/**
 * Servlet implementation class Home
 */
@WebServlet("/home")
public class Home extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		if(session.isNew()) {
			ArrayList<Team> equipos = new ArrayList<Team>();
			session.setAttribute("equipos", equipos);
			String output = "<thead><tr><th class='text-center'>EQUIPO</th><th class='text-center'>JUGADORES</th><th class='text-center'>ACCIONES</th></tr></thead><tbody></tbody>";
			session.setAttribute("salida", output);
			RequestDispatcher view = request.getRequestDispatcher("/WEB-INF/index.jsp");
			view.forward(request, response);
		} else {
			ArrayList<Team> equipos = (ArrayList<Team>) session.getAttribute("equipos");
			String output = "<thead><tr><th class='text-center'>EQUIPO</th><th class='text-center'>JUGADORES</th><th class='text-center'>ACCIONES</th></tr></thead><tbody>";
			for (int i = 0;i < equipos.size();i++) {
				output  += "<tr class='bg-light'><td class='text-center'>"+equipos.get(i).getName()+"</td><td class='text-center'>"+equipos.get(i).getPlayers().size()+"</td><td class='text-center'><a class='btn btn-info rounded' role='button' href='/Rosters/teams?id="+i+"'>Detalles</a><a class='btn btn-danger rounded' role='button' href='/Rosters/delete?id="+i+"&tipo=team'>Eliminar</a></td></tr>";
			}
			output += "</tbody>";
			session.setAttribute("salida", output);
			RequestDispatcher view = request.getRequestDispatcher("/WEB-INF/index.jsp");
			view.forward(request, response);
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		if (request.getParameter("team").equals(null)) {
			doGet(request, response);
		} else {
			ArrayList<Team> equipos = (ArrayList<Team>) session.getAttribute("equipos");
			String nuevoTeam = request.getParameter("team");
			Team equipo = new Team(nuevoTeam);
			equipos.add(equipo);
			session.setAttribute("equipos", equipos);
			doGet(request, response);
		}
	}
	

}