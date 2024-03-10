<%@ page import="java.util.Date" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Quand et où ?</title>
</head>
<body>
    <p>
        Nous sommes le <%= new Date() %> <br>
        Le nom du serveur sur lequel vous êtes connecté : <%= request.getServerName() %> <br>
    </p>
</body>
</html>
