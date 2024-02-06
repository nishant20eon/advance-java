<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>This is output file</h1>
	<p>Hello, this is <%= request.getAttribute("name") %></p>
	<h2>
		<%
		String fullname= request.getAttribute("name").toString();
		out.println(fullname);
		%>
	</h2>
	
	<p>The value of 2*2 is <%= 2*2 %></p>
	<p>6>8 is <%= (6>8) %></p>
	
	<%
		for(int i=0;i<=10;i++)
		{
			out.println("<p> the value of i is "+i+"</p>");
		}
	%>
	
	<%!
		int calLength(String str)
		{
			return str.length();
		}
	%>
	<p> The length of string(firstservlet) is <%= calLength("firstservlet") %> </p>
	
	
</body>
</html>

<%-- 

JSP Scriplets: <% //java code %>
JSP Expression: <%= //java code %>  - for line code
In order to print message in browser we need print object, printwriter but jsp we have a obj called JspWriter

JSP declarations - Using which we call write java methods inside JSP Syntax <%!  %>

--%>