<%@ page import="java.util.Date" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Quand et o� ?</title>
</head>
<body>
    <p>
        Nous sommes le <%= new Date() %> <br>
        Le nom du serveur sur lequel vous �tes connect� : <%= request.getServerName() %> <br>
    </p>
</body>
</html>
