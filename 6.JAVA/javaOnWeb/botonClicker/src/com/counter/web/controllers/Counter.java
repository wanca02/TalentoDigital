package com.counter.web.controllers;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.counter.web.models.Sesiones;

/**
 * Servlet implementation class Counter
 */
@WebServlet("/Counter")
public class Counter extends HttpServlet {
	private static int count=0;
	private static final long serialVersionUID = 1L;
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		HttpSession session = request.getSession(true);
		
        String btn = request.getParameter("btn");
        
        if (btn.equalsIgnoreCase("ok")){
        	count++;
        	session.setAttribute("btn", count);	
        	//btn = "false";
        }
        RequestDispatcher rd=request.getRequestDispatcher("index.jsp");
    	rd.forward(request, response); 
        
        
        //response.setContentType("text/plain");
		//response.getWriter().write(Integer.toString(count));
         
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
