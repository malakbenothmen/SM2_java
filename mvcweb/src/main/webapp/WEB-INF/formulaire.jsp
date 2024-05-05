<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>


<form method="POST" action="Commande">
<label for=""> Chambre : </label> 
<input type="text"  name="chambre" id="" value="100"/><br />

<label for="">Nombre de repas : </label> 
<input type="text"  name="nombreDeRepas" id="" value="1"/><br />

<label for="">Heure de livraison (entre 6h et 10h) : </label> 
<input type="time"  name="heure" id="" value="08:00" required /><br /> 

<label for="">Commentaire : </label> <br />
<textarea name="commentaire" id="" rows="10" cols="50">Vos remarques.</textarea><br /> 
  
<input type="submit" name="Envoyer" value="Envoyer" /> </form>


</body>
</html>