package com.test.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.test.jdbc.StudentDAO;
import com.test.jdbc.StudentDTO;

public class LoginServlet extends HttpServlet {
	
	private StudentDAO studentDAO;
	
	public LoginServlet(){
		System.out.println("Created Login Servlet Obj !!!!");
		studentDAO = new StudentDAO();
	}
	
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
			RequestDispatcher rd = req.getRequestDispatcher("success.jsp");
			
			//Fetch the Data from the DB
			List<StudentDTO> stuList = studentDAO.getAllStudents();
			req.setAttribute("stuList",stuList);
			rd.forward(req, resp);
			//resp.sendRedirect("success.jsp");
		}else{
			System.out.println( " Validation is Failed !!!!!!!!! ");
			//resp.sendRedirect("login.jsp");
			RequestDispatcher rd = req.getRequestDispatcher("login.jsp");
			req.setAttribute("error", "Invalid UserName & PAssword. Pls Try Again !!!!");
			rd.forward(req, resp);
		}
		
		
		
		/*PrintWriter out = resp.getWriter();
		out.println("Welcome to First Dynamic  Web Resource");
		out.println("Date : " + new Date());*/
	}

}
