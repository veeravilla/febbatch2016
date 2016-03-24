package com.test.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet  extends HttpServlet{
	
	public LoginServlet(){
		System.out.println("Servlet Object Created !!!");
	}
	

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		System.out.println(" Service #############");
		//B.L
		String username = req.getParameter("username");
		String password = req.getParameter("password");
		
		
		//JDBC
		if(username.equals("jhon") && password.equals("test123")){
			//Success
			//PrintWriter out = resp.getWriter();
			String output = new Date().toString(); // B.L Output
			
			resp.sendRedirect("output.jsp");
			/*RequestDispatcher rd = req.getRequestDispatcher("output.jsp");
			req.setAttribute("date", output);
			req.setAttribute("username", username);
			rd.forward(req, resp);*/
		}else{
			RequestDispatcher rd = req.getRequestDispatcher("login.jsp");
			req.setAttribute("error", "UserName or Password invalid. Pls Try agian!!!!");
			rd.forward(req, resp);
		}
		
		
		
		//out.println("<html><head><title>Demo Servlet</title></head><body><h1><font color=\"red\">Demo Servlet " + new Date()+"</font><h1></body></html>");
	}
	
	
}
