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
	<form action='/Rosters/teams?id=<%=id%>' method='POST'>
		<h1 class="text-center mt-1 display-4">Nuevo miembro: <c:out value="${tname}"/></h1>
		<div class="form-group row mt-3 justify-content-center">
			<label class="text-primary col-sm-2 col-form-label">Nombre:</label>
			<div>
				<input type='text' name='name'>
			</div>
		</div>
		<div class="form-group row justify-content-center">
			<label class="text-primary col-sm-2 col-form-label">Raza:</label>
			<div>
				<input type='text' name='race'>
			</div>
		</div>
		<div class="form-group row justify-content-center">
			<label class="text-primary col-sm-2 col-form-label">Edad:</label>
			<div>
				<input type='number' name='age'>
			</div>
		</div>
		<div class="text-center mt-4">
			<a class="btn btn-outline-danger p-2" role="button" href="/Rosters/teams?id=<%=id%>">Cancelar</a>
			<button class="btn btn-outline-success p-2">Agregar</button>
		</div>
	</form>
	</div>
</body>
</html>