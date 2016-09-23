<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
 <link rel="stylesheet" href="Style/style.css" />
<title>Accueil Annuaire</title>
</head>
<body>
<h1>Annuaire</h1>

<div id="Connexion">
<a href="Connexion.jsp"><input type="button" value="Connexion"></a>

</div>


<div id="Menu">
<ul>
<li><a href="FormulaireAjout.jsp">Ajout</a></li>
<li><a href="Recherche.jsp">Afficher Tout</a></li>
</ul>
</div>

<div id="recherche">
<form id="rechercher" method="POST">
	<input id="recherche" name="recherche" type="text" placeholder=" Qui ? Nom" /><br/>
<input id="recherche-button" type="submit" value="Rechercher" />
</form>
</div>



<footer>
	<div id="barre">
	</div>

<p>  
<img src="Style/Image/ur.jpg" alt="UR" />
Copyright Université de la Réunion-Tous droit réservé 
<a href="#">Nous Contacter</a>
</p>

</footer>












</body>
</html>