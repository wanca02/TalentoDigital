<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>    
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>New ClassStudent!</title>
		<!-- CSS only -->
		<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css" integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk" crossorigin="anonymous">
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
		        <a class="nav-link" href="/dorms/new">Home <span class="sr-only">(current)</span></a>
		      </li>
		      <li class="nav-item">
		        <a class="nav-link" href="/students/new">Ver Estudiantes</a>
		      </li>
		      <li class="nav-item">
		        <a class="nav-link" href="../classes/new">Crear nueva Clase</a>
		      </li>
		    </ul>
		  </div>
		</nav>
		<div class="container">
			<div class="row">
				<div class="col">
					<h1>
						<c:out value="${ _student.firstName }"></c:out> <c:out value="${ _student.lastName }"></c:out>
					</h1>
				</div>
			</div>
			<div class="row justify-content-center">
				<div class="col-5">
					<form action="addClassStudent" method="post">
				    <div class="form-group row">
			        <label class="col-sm-4 col-form-label">Classes: </label>
			        <div class="col-sm-8">
			        	<select class="form-control" name="classId">
			        		<c:forEach items="${ classes }" var="class">
			        			<option value="${ class.id }"><c:out value="${ class.name }"></c:out></option>
			        		</c:forEach>
			        	</select>
			        </div>
				    </div>
				    <input type="hidden" name="studentId" value="<c:out value="${ _student.id }"></c:out>">
				    <input type="submit" class="btn btn-primary" value="Add"/>
					</form>
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
						  <c:forEach items="${ _student.classes }" var="class">
							  <tr>
						      <th scope="row"><%=cc++ %></th>
						      <td><c:out value="${ class.name }"></c:out></td>
						      <td>
						      	<form action="delClassStudent" method="post">
									    <input type="hidden" name="_method" value="DELETE">
									    <input type="hidden" name="classId" value="<c:out value="${ class.id }"></c:out>">
									    <input type="hidden" name="studentId" value="<c:out value="${ _student.id }"></c:out>">
									    <button type="submit" class="btn btn-outline-danger" value="Delete">Delete</button>
										</form>
						      </td>
						    </tr>
						  </c:forEach>
					  </tbody>
					</table>
				</div>
			</div>
		</div>
	</body>
</html>










