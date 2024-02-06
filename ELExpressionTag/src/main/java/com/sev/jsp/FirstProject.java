package com.sev.jsp;
import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class FirstProject extends HttpServlet {
	
	
	/**
	 * Always run main webproject to run serverlet
	 */
	
	public FirstProject() {
		super();
		System.out.println("Inside no org construstor");
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String FirstName = req.getParameter("fname");
		String LastName = req.getParameter("lname");
		String fullName = FirstName +" "+LastName;
		
		Student student = new Student();
		student.setName("Nishant Kumar");
	
		req.setAttribute("name", fullName);
		req.setAttribute("student", student);
		RequestDispatcher dispatcher = req.getRequestDispatcher("/output.jsp");
		dispatcher.forward(req, resp);
		
		System.out.println("Post method finished");
	}
	
}
