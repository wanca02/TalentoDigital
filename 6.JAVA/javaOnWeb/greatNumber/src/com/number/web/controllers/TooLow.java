package com.number.web.controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class TooLow
 */
@WebServlet("/TooLow")
public class TooLow extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static String html=""; 
	private static String button=""; 
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		HttpSession session = request.getSession(false);
		String color=(String) session.getAttribute("color");
		
		html="<div class=\"col-4 offset-4\" style=\"background-color:"+color+";\">";
		html+="<h3 style=\"padding:50px;\">Too Low</h3>";
		html+="</div>";
		
		button="<input name=\"play\" value=\"none\" type=\"hidden\">"; 
		button+="<button class=\"btn btn-info\" type=\"submit\">Submit</button>";
		
		session.setAttribute("html", html);
		session.setAttribute("button", button);
		
		RequestDispatcher rd=request.getRequestDispatcher("index.jsp");
    	rd.forward(request, response); 
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
