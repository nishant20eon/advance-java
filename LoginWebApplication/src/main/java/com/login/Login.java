package com.login;

import java.io.IOException;
import java.io.PrintWriter;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class Login extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter pw=resp.getWriter();
		//resp.setContentType("text/html");
		//System.out.println("Resp: "+resp.getContentType());
		String user=req.getParameter("userName");
		String pass=req.getParameter("userPassword");
		if(user.equals("edureka") && pass.equals("edureka"))
		pw.println("Login Success...!");
		else
		pw.println("Login Failed...!");
		pw.close();
		
	}
}
