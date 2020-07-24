<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>    
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Query Time!</title>
		<!-- CSS only -->
		<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css" integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk" crossorigin="anonymous">
		<link rel="stylesheet" href="../css/style.css">
	</head>
	<body>
		<div class="container">
			<div class="row">
				<div class="col">
					<h6>1. Obtener todos los paises que hablen Sloveno:</h6>
				</div>
			</div>
			<div class="row">
				<div class="col">
					<table class="table table-hover">
						<thead>
							<tr>
								<th>Pais</th>
								<th>Lenguaje</th>
								<th>Porcentaje</th>
							</tr>
						</thead>
						<tbody>
						<c:forEach items="${ pregunta1 }" var="country">
							<tr>
								<td><c:out value="${ country[0] }"></c:out></td>
								<td><c:out value="${ country[1] }"></c:out></td>
								<td><c:out value="${ country[2] }"></c:out>%</td>
							</tr>
						</c:forEach>
						</tbody>
					</table>
				</div>
			</div>
			<div class="row">
				<div class="col">
					<h6>2. Obtener cantidad de ciudades de cada pa�s:</h6>
				</div>
			</div>
			<div class="row">
				<div class="col">
					<table class="table table-hover">
						<thead>
							<tr>
								<th>Pais</th>
								<th>N� Ciudades</th>
							</tr>
						</thead>
						<tbody>
						<c:forEach items="${ pregunta2 }" var="country">
							<tr>
								<td><c:out value="${ country[0] }"></c:out></td>
								<td><c:out value="${ country[1] }"></c:out></td>
							</tr>
						</c:forEach>
						</tbody>
					</table>
				</div>
			</div>
			<div class="row">
				<div class="col">
					<h6>3. Obtener ciudades de M�xico con poblaci�n mayor a 500.000:</h6>
				</div>
			</div>
			<div class="row">
				<div class="col">
					<table class="table table-hover">
						<thead>
							<tr>
								<th>Code Pa�s</th>
								<th>Ciudades</th>
								<th>Poblaci�n</th>
							</tr>
						</thead>
						<tbody>
						<c:forEach items="${ pregunta3 }" var="country">
							<tr>
								<td><c:out value="${ country[0] }"></c:out></td>
								<td><c:out value="${ country[1] }"></c:out></td>
								<td><c:out value="${ country[2] }"></c:out></td>
							</tr>
						</c:forEach>
						</tbody>
					</table>
				</div>
			</div>
			<div class="row">
				<div class="col">
					<h6>4. Obtener ciudades de M�xico con poblaci�n mayor a 500.000:</h6>
				</div>
			</div>
			<div class="row">
				<div class="col">
					<table class="table table-hover">
						<thead>
							<tr>
								<th>Pa�s</th>
								<th>Lenguaje</th>
								<th>Porcentaje</th>
							</tr>
						</thead>
						<tbody>
						<c:forEach items="${ pregunta4 }" var="country">
							<tr>
								<td><c:out value="${ country[0] }"></c:out></td>
								<td><c:out value="${ country[1] }"></c:out></td>
								<td><c:out value="${ country[2] }"></c:out>%</td>
							</tr>
						</c:forEach>
						</tbody>
					</table>
				</div>
			</div>
			<div class="row">
				<div class="col">
					<h6>5. Obtener paises con �rea inferior a 501 y poblaci�n mayor a 100.000:</h6>
				</div>
			</div>
			<div class="row">
				<div class="col">
					<table class="table table-hover">
						<thead>
							<tr>
								<th>Pa�s</th>
								<th>Super. �rea</th>
								<th>Poblaci�n</th>
							</tr>
						</thead>
						<tbody>
						<c:forEach items="${ pregunta5 }" var="country">
							<tr>
								<td><c:out value="${ country[0] }"></c:out></td>
								<td><c:out value="${ country[1] }"></c:out></td>
								<td><c:out value="${ country[2] }"></c:out></td>
							</tr>
						</c:forEach>
						</tbody>
					</table>
				</div>
			</div>
			<div class="row">
				<div class="col">
					<h6>6. Obtener paises con solo Monarqu�a y Super. �rea mayor a 200 y una expectativa de vida superior a 75 a�os:</h6>
				</div>
			</div>
			<div class="row">
				<div class="col">
					<table class="table table-hover">
						<thead>
							<tr>
								<th>Pa�s</th>
								<th>Forma de Govierno</th>
								<th>Super. �rea</th>
								<th>Expe. Vida (a�os)</th>
							</tr>
						</thead>
						<tbody>
						<c:forEach items="${ pregunta6 }" var="country">
							<tr>
								<td><c:out value="${ country[0] }"></c:out></td>
								<td><c:out value="${ country[1] }"></c:out></td>
								<td><c:out value="${ country[2] }"></c:out></td>
								<td><c:out value="${ country[3] }"></c:out></td>
							</tr>
						</c:forEach>
						</tbody>
					</table>
				</div>
			</div>
			<div class="row">
				<div class="col">
					<h6>7. Obtener ciudades de Argentina cuyo distrito es Buenos Aires y poblaci�n mayor a 500000:</h6>
				</div>
			</div>
			<div class="row">
				<div class="col">
					<table class="table table-hover">
						<thead>
							<tr>
								<th>Pa�s</th>
								<th>Ciudad</th>
								<th>Distrito</th>
								<th>Poblaci�n</th>
							</tr>
						</thead>
						<tbody>
						<c:forEach items="${ pregunta7 }" var="country">
							<tr>
								<td><c:out value="${ country[0] }"></c:out></td>
								<td><c:out value="${ country[1] }"></c:out></td>
								<td><c:out value="${ country[2] }"></c:out></td>
								<td><c:out value="${ country[3] }"></c:out></td>
							</tr>
						</c:forEach>
						</tbody>
					</table>
				</div>
			</div>
			<div class="row">
				<div class="col">
					<h6>8. Obtener cantidad de paises por regi�n:</h6>
				</div>
			</div>
			<div class="row">
				<div class="col">
					<table class="table table-hover">
						<thead>
							<tr>
								<th>Regi�n</th>
								<th>N� Paises</th>
							</tr>
						</thead>
						<tbody>
						<c:forEach items="${ pregunta8 }" var="country">
							<tr>
								<td><c:out value="${ country[0] }"></c:out></td>
								<td><c:out value="${ country[1] }"></c:out></td>
							</tr>
						</c:forEach>
						</tbody>
					</table>
				</div>
			</div>
			
		</div>
	</body>
</html>





