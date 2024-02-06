<%@ tablib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<p>I am writing EL expression ${2+2*10}</p>
	<p>I am writing EL expression ${6 ge 7 ? "Greater" : "Not greater"}</p>
	<p>I am writing EL expression ${2+2*10}</p>
	<p>I am writing EL expression ${2+2*10}</p>
	<!-- Accessing the object -->
	<h1>My name is ${name}</h1>
	
	<h1>My name is ${student.name}</h1>
	
	<h1>My name is ${student}</h1>
	
</body>
</html>