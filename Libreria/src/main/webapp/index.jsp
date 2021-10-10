<!DOCTYPE html>
<%@page import="model.Libro"%>
<%@page import="controller.LibriCtrl"%>
<html>
<head>
<meta charset="UTF-8">
<title>Libreria</title>
</head>
<body>

	<h1>Libreria</h1>
	
	<%
	
		LibriCtrl lc = new LibriCtrl();
		Libro l = lc.getLibri().get(0);
		
	
	%>
	<h2><%= l %></h2>

</body>
</html>