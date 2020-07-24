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
					<h6>2. Obtener cantidad de ciudades de cada país:</h6>
				</div>
			</div>
			<div class="row">
				<div class="col">
					<table class="table table-hover">
						<thead>
							<tr>
								<th>Pais</th>
								<th>N° Ciudades</th>
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
					<h6>3. Obtener ciudades de México con población mayor a 500.000:</h6>
				</div>
			</div>
			<div class="row">
				<div class="col">
					<table class="table table-hover">
						<thead>
							<tr>
								<th>Code País</th>
								<th>Ciudades</th>
								<th>Población</th>
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
					<h6>4. Obtener ciudades de México con población mayor a 500.000:</h6>
				</div>
			</div>
			<div class="row">
				<div class="col">
					<table class="table table-hover">
						<thead>
							<tr>
								<th>País</th>
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
					<h6>5. Obtener paises con Área inferior a 501 y población mayor a 100.000:</h6>
				</div>
			</div>
			<div class="row">
				<div class="col">
					<table class="table table-hover">
						<thead>
							<tr>
								<th>País</th>
								<th>Super. Área</th>
								<th>Población</th>
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
					<h6>6. Obtener paises con solo Monarquía y Super. Área mayor a 200 y una expectativa de vida superior a 75 años:</h6>
				</div>
			</div>
			<div class="row">
				<div class="col">
					<table class="table table-hover">
						<thead>
							<tr>
								<th>País</th>
								<th>Forma de Govierno</th>
								<th>Super. Área</th>
								<th>Expe. Vida (años)</th>
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
					<h6>7. Obtener ciudades de Argentina cuyo distrito es Buenos Aires y población mayor a 500000:</h6>
				</div>
			</div>
			<div class="row">
				<div class="col">
					<table class="table table-hover">
						<thead>
							<tr>
								<th>País</th>
								<th>Ciudad</th>
								<th>Distrito</th>
								<th>Población</th>
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
					<h6>8. Obtener cantidad de paises por región:</h6>
				</div>
			</div>
			<div class="row">
				<div class="col">
					<table class="table table-hover">
						<thead>
							<tr>
								<th>Región</th>
								<th>N° Paises</th>
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





