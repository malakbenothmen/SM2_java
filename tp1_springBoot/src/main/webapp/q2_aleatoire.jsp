<%@ page import="java.util.Random" %>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Aleatoire</title>
</head>
<body>
    <% 
        // G�n�rer un nombre al�atoire entre 1 et 100 inclus
        Random random = new Random();
        int nombreAleatoire = random.nextInt(100) + 1;
    %>
    Le nombre al�atoire g�n�r� est <%= nombreAleatoire %>. <br>
    <a href="<%= request.getRequestURI() %>" >Recommencer !</a>
</body>
</html>
