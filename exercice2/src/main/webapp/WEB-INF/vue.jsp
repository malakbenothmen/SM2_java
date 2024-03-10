<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<% String nom = (String) session.getAttribute("AttributNomEnMajuscule") ; %>
<h1><b>Bonjour <%= nom  %> </b></h1>


</body>
</html>