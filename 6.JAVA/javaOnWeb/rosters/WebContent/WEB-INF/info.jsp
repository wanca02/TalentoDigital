<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Roster</title>
	<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
</head>
<body>
	<% 
		int id = Integer.parseInt(request.getParameter("id"));
	%>
	<div class="container">
		<h1 class="text-center pt-4 text-primary display-4"><c:out value="${tname}"/></h1>
		<div class="text-center mt-4">
			<a class="btn btn-outline-warning p-1" role="button" href="/Rosters/home">Regresar</a>
			<a class="btn btn-outline-primary p-1" role="button" href="/Rosters/players?id=<%=id%>">Nuevo Miembro</a>
		</div>
		<p class="text-center mt-3 text-light h3">Lista de Jugadores</p>
		<table class="table table-bordered mt-5">
			<% String output = (String) session.getAttribute("salida");%>
			<%=output%>
		</table>
	</div>
</body>
</html>