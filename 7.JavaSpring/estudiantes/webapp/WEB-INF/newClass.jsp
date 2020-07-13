<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>    
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>New Class!</title>
		<!-- CSS only -->
		<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css" integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk" crossorigin="anonymous">
		<link rel="stylesheet" href="../css/style.css">
	</head>
	<body>
		<nav class="navbar navbar-expand-lg navbar-light bg-light">
		  <a class="navbar-brand" href="/">LOGO</a>
		  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
		    <span class="navbar-toggler-icon"></span>
		  </button>
		  <div class="collapse navbar-collapse" id="navbarSupportedContent">
		    <ul class="navbar-nav mr-auto">
		      <li class="nav-item active">
		        <a class="nav-link" href="#">Home <span class="sr-only">(current)</span></a>
		      </li>
		      <li class="nav-item">
		        <a class="nav-link" href="../students/new">Ingresar Estudiante</a>
		      </li>
		    </ul>
		  </div>
		</nav>
		<div class="container">
			<div class="row">
				<div class="col">
					<h1>Clases!!</h1>
				</div>
			</div>
			<div class="row justify-content-center">
				<div class="col-5">
					<form:form action="addClass" method="post" modelAttribute="class">
				    <div class="form-group row">
			        <form:label class="col-sm-4 col-form-label" path="name">Name: </form:label>
			        <form:errors path="name"/>
			        <div class="col-sm-8">
			        	<form:input type="text" class="form-control" path="name"/>
			        </div>
				    </div>
				    <input type="submit" class="btn btn-primary" value="Create"/>
					</form:form>
				</div>
			</div>
			<div class="row mt-5 justify-content-center">
				<div class="col-8">
					<table class="table table-hover">
					  <thead>
					    <tr>
					      <th scope="col">#</th>
					      <th scope="col">Name</th>
					      <th scope="col">Action</th>
					    </tr>
					  </thead>
					  <tbody>
					  	<%int cc=1; %>
						  <c:forEach items="${ classes }" var="class">
							  <tr>
						      <th scope="row"><%=cc++ %></th>
						      <td><c:out value="${ class.name }"></c:out></td>
						      <td><a href="<c:out value="${ class.id }"></c:out>">Ver</a></td>
						    </tr>
						  </c:forEach>
					  </tbody>
					</table>
				</div>
			</div>
		</div>
	</body>
</html>














