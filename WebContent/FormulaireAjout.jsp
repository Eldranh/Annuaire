<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
 <link rel="stylesheet" href="Style/style.css" />
</head>				
<body>
	<form method="POST">
		<h1>Formulaire d'ajout</h1>
			<p>Nom:* <input type=text value='nom'></p>
			<p>Prenom:* <input type=text value='prenom'></p>
			<p>Numéro de telephone:* <input type=text value='numTel'></p>
			<p>Adresse mail: <input type=text value='email'></p>
			<p>Commentaire: <textarea name="comment" id="comment" rows="10" cols="50">
			</textarea>
			</p>
			<input type=button value=Valider>
		</form>
	<a href='Accueil.jsp'>Retour a l accueil</a>
</body>
</html>