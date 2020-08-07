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
 * Servlet implementation class Teams
 */
@WebServlet("/teams")
public class Teams extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		
		if (request.getParameter("id") != null) {
			ArrayList<Team> equipos = (ArrayList<Team>) session.getAttribute("equipos");
			int id = Integer.parseInt(request.getParameter("id"));
			String output = "<thead><tr><th class='text-center'>NOMBRE</th><th class='text-center'>RAZA</th><th class='text-center'>EDAD</th><th class='text-center'>ACCIONES</th></tr></thead><tbody>";
			for (int i = 0;i < equipos.get(id).getPlayers().size();i++) {
				output  += "<tr class='bg-light'><td class='text-center'>"+equipos.get(id).getPlayers().get(i).getName()+"</td><td class='text-center'>"+equipos.get(id).getPlayers().get(i).getRace()+"</td><td class='text-center'>"+equipos.get(id).getPlayers().get(i).getAge()+"</td><td class='text-center'><a class='btn btn-danger rounded' role='button' href='/Rosters/delete?id="+i+"&tipo=player&team="+id+"'>Eliminar</a></td></tr>";
			}
			output += "</tbody>";
			String name = equipos.get(id).getName();
			session.setAttribute("tname", name);
			session.setAttribute("salida", output);
			RequestDispatcher view = request.getRequestDispatcher("/WEB-INF/info.jsp");
			view.forward(request, response);
		} else {
			RequestDispatcher view = request.getRequestDispatcher("/WEB-INF/newteam.jsp");
			view.forward(request, response);
		}
		
		
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		if (request.getParameter("id") != null) {
			ArrayList<Team> equipos = (ArrayList<Team>) session.getAttribute("equipos");
			int id = Integer.parseInt(request.getParameter("id"));
			String nombre = request.getParameter("name");
			String raza = request.getParameter("race");
			int edad = Integer.parseInt(request.getParameter("age"));
			equipos.get(id).setPlayer(nombre, raza, edad);
			session.setAttribute("equipos", equipos);
			doGet(request, response);
		} else {

			doGet(request, response);
		}
	}

}