package com.number.web.controllers;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Number
 */
@WebServlet("/Number")
public class Number extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static String html=""; 
	private static String button=""; 
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		int n=20;//(int) Math.floor(Math.random()*99+1);
		String number = request.getParameter("numberIn");
		//String play=request.getParameter("play");
		response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        String txt=""; 
		String color="red";
		
		HttpSession session = request.getSession();
		
		
		
        RequestDispatcher rdObj = null;
		if(number == null || "".equals(number) ) {
            out.write("<p id='errMsg' style='color: red; font-size: larger;'>Please Enter a Number... !</p>");
            rdObj = request.getRequestDispatcher("/index.jsp");
            rdObj.include(request, response);
            
		}else if(Integer.parseInt(number)<n){
			txt="TooLow";
			
		}else if(Integer.parseInt(number)>n) {
			txt="TooHigh";
			
		}else if(Integer.parseInt(number)==n){
			txt="Right";
			color="green";
			
		}else {
			html=null;
			button="<input name=\"play\" value=\"none\" type=\"hidden\">"; 
			button+="<button class=\"btn btn-info\" type=\"submit\">Submit</button>";
		}
		
		System.out.println(number);
		
		session.setAttribute("number", number);
		session.setAttribute("color", color);
		RequestDispatcher rd=request.getRequestDispatcher(txt);
    	rd.forward(request, response); 
    	session.setAttribute("html", null);
    	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
