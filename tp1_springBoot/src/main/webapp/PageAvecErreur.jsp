<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Division par zéro !</title>
</head>
<body>
<%
if(request.getParameter("attention") == null) {
    response.getWriter().append("Cette page fonctionne !<br>");
} else {
    try {
        int i = 1/0;
    } catch (Exception e) {
        response.sendRedirect("/tp1_springBoot/error.jsp");
    }
}
%>
</body>
</html>
