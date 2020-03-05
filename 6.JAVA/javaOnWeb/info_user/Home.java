package com.wanca02.com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Home
 */
@WebServlet("/Home")
public class Home extends HttpServlet {
	private static final long serialVersionUID = 1L;
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		String firstname= validar(request.getParameter("firstname"));
		String lastname= validar(request.getParameter("lastname"));
		String favoriteLanguage= validar(request.getParameter("favoritelanguage"));
		String hometown= validar(request.getParameter("hometown"));
		
		
		
		String html="<h1>Bienvenido, "+firstname+" "+lastname+"</h1>";
		html+="<h2> Tu lenguaje favorito: "+favoriteLanguage+"</h2>";
		html+="<h2> Tu Cuidad : "+hometown+"</h2>";
		out.write(html);
	}
	public String validar(String x) {
		if(x!="") return x;
		else return "Unknow";
	}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
