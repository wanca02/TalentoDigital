<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>    
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Dojos</title>
		<!-- CSS only -->
		<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css" integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk" crossorigin="anonymous">
		<link rel="stylesheet" href="../css/style.css">
	</head>
	<body>
		<nav class="navbar navbar-expand-lg navbar-light bg-light">
		  <a class="navbar-brand" href="/">Dojos</a>
		  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
		    <span class="navbar-toggler-icon"></span>
		  </button>
		  <div class="collapse navbar-collapse" id="navbarSupportedContent">
		    <ul class="navbar-nav mr-auto">
		      <li class="nav-item active">
		        <a class="nav-link" href="/dashboard">Home <span class="sr-only">(current)</span></a>
		      </li>
		      <li class="nav-item">
		        <a class="nav-link" href="/dojos/new">Crear Dojo</a>
		      </li>
		      <li class="nav-item">
		        <a class="nav-link" href="../ninjas/new">Crear Ninja</a>
		      </li>
		    </ul>
		  </div>
		</nav>
		<div class="container mt-5">
			<div class="row justify-content-center">
				<div class="col-5">
					<h2><c:out value="${dojos.name}"/> Ninjas</h2>
				</div>
			</div>
			<div class="row justify-content-center">
				<div class="col-5">
					<table class="table table-hover">
					  <thead>
					    <tr>
					      <th scope="col">#</th>
					      <th scope="col">First Name</th>
					      <th scope="col">Last Name</th>
					      <th scope="col">Age</th>
					    </tr>
					  </thead>
					  <tbody>
						  <c:forEach items="${ dojos.ninjas }" var="ninja">
							  <tr>
						      <th scope="row"><c:out value="${ ninja.id }"></c:out></th>
						      <td><c:out value="${ ninja.firstName }"></c:out></td>
						      <td><c:out value="${ ninja.lastName }"></c:out></td>
						      <td><c:out value="${ ninja.age }"></c:out></td>
						    </tr>
						  </c:forEach>
					  </tbody>
					</table>
				</div>
			</div>
		</div>
	</body>
</html>