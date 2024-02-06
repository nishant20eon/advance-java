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
	
		req.setAttribute("name", fullName);
		RequestDispatcher dispatcher = req.getRequestDispatcher("/output.jsp");
		dispatcher.forward(req, resp);
		
		System.out.println("Post method finished");
	}
	
	public void init()throws ServletException{
		super.init();
		System.out.println("Inside init method.. ..");
	}
	
	/*
	 * Service method call each and every time when we make request
	 * doGet() and doPost()
	 */
	@Override
	protected void service(HttpServletRequest arg0, HttpServletResponse arg1) throws ServletException, IOException 	{
		super.service(arg0, arg1);
		System.out.println("Inside service method.. ..");
	}

	
	public void destroy()
	{
		super.destroy();
		System.out.println("Inside detroy method.. ..");
	}
}
