package com.random.web.controllers;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Random
 */
@WebServlet("/Random")
public class Random extends HttpServlet {
	private static int count=0;
	private static final long serialVersionUID = 1L;
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		
		HttpSession session = request.getSession(true);
		
        String ok = request.getParameter("action");
        String txt="";
        Date createTime = new Date(session.getCreationTime());
        
        if (ok.equalsIgnoreCase("ok")){
        	count++;
        	txt=randomNumber();
        }
        session.setAttribute("ok", Integer.toString(count));
        
        /*
         * if (session.isNew()) {
        	count++;
        	session.setAttribute("ok", count);
        }
         * */
        String html="<input type=\"text\" class=\"form-control\" id=\"randomIn\" aria-describedby=\"RandomNumber\"";
        html+="value="+txt+" >";
        
        SimpleDateFormat formatter = new SimpleDateFormat("MMM dd yyyy HH:mm:ss");  
        
        String date="<input type=\"text\" class=\"form-control\" id=\"dateIn\" aria-describedby=\"dateTxt\"";
        date+="value='"+formatter.format(createTime)+"' >";
        
        
        session.setAttribute("html", html);
        session.setAttribute("date", date);
        
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
	
	public String randomNumber() {
		String m="";
		for(int i=0; i<10;i++) {
			m+=String.valueOf((char)(Math.floor(Math.random()*26+1) + 64));
		}
		return m;
	}

}







