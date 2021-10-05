<!DOCTYPE html>
<%@page import="java.util.Set"%>
<html>
<head>
<meta charset="utf-8">
<title>libri</title>
</head>
<body>
<h1>Libri</h1>

<table>
	<tr><th>Titolo</th></tr>

<% Set<String> titoli = (Set<String>) request.getAttribute("titoli");  %>
<% for (String titolo : titoli){ %>
	<tr><td><%= titolo %></td></tr>
<% } %>

</table>



</body>
</html>