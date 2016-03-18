package com.test.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet {

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) 
			throws ServletException, IOException {
		//Read User Input
		String uname = req.getParameter("username");
		String password = req.getParameter("password");
		
		System.out.println( " UserName : " + uname + " Password " + password); //Logging
		
		//TODO: JDBC / JPA
		if(uname.equals("testuser") && password.equals("test1234")){
			//B.L - Redirect to View
			System.out.println( " Sucess !!!!! ");
			resp.sendRedirect("success.jsp");
		}else{
			System.out.println( " Validation is Failed !!!!!!!!! ");
			resp.sendRedirect("login.jsp");
		}
		
		
		
		/*PrintWriter out = resp.getWriter();
		out.println("Welcome to First Dynamic  Web Resource");
		out.println("Date : " + new Date());*/
	}

}
