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
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		String FirstName = req.getParameter("fname");
		String LastName = req.getParameter("lname");
		String fullName = FirstName +" "+LastName;
	
		System.out.println("My  Name is "+fullName);
		System.out.println("Printwriter is called");
		PrintWriter writer = resp.getWriter();
		writer.println("<html><body><h1> My Name is "+fullName+"</h1></body></html>");
		System.out.println("Calling URL and other html file");
		
		/*
		 * Note: you can run one sendRedirect() ones
		 */
		//resp.sendRedirect("https://www.google.com/");
		resp.sendRedirect("test.html");
		
		req.setAttribute("name", fullName);
		RequestDispatcher dispatcher = req.getRequestDispatcher("/output.jsp");
		dispatcher.forward(req, resp);
		
		System.out.println("Post method finished");
	}
}
