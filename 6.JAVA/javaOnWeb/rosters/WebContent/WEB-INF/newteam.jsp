<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="UTF-8">
	<title>Roster</title>
	<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">

</head>
<body>
	<div class="container">
	<form action='/Rosters/home' method='POST'>
		<h1 class="text-center pt-4 display-4">Nuevo Equipo</h1>
		<div class="text-center mt-4 row">
			<div class="col"><label>Name: </label><input type='text' name='team'></div>
		</div>
		<div class="text-center mt-4">
			<a class="btn btn-outline-danger p-2" role="button" href="/Rosters/home">Cancelar</a>
			<button class="btn btn-outline-info p-2">Agregar</button>
		</div>
	</form>
	</div>
</body>
</html>