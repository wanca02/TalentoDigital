<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>    
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>New Person!</title>
		<!-- CSS only -->
		<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css" integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk" crossorigin="anonymous">
	</head>
	<body>
		<div class="container">		
			<div class="row">
				<div class="col">
					<a href="students/new">Ingresar Estudiante</a>
				</div>
				<div class="col">
					<a href="contacts/new">Ingresar Contacto</a>
				</div>
			</div>
			<div class="row justify-content-center">
				<div class="col-7">
					<table class="table table-hover">
					  <thead>
					    <tr>
					      <th scope="col">#</th>
					      <th scope="col">Name</th>
					      <th scope="col">Age</th>
					      <th scope="col">Address</th>
					      <th scope="col">City</th>
					      <th scope="col">State</th>
					    </tr>
					  </thead>
					  <tbody>
					  <c:forEach items="${ students }" var="student">
						  <tr>
					      <th scope="row"><c:out value="${ student.id }"></c:out></th>
					      <td><c:out value="${ student.firstName }"></c:out> <c:out value="${ student.lastName }"></c:out></td>
					      <td><c:out value="${ student.age }"></c:out></td>
					      <td><c:out value="${ student.contact.address }"></c:out></td>
					      <td><c:out value="${ student.contact.city }"></c:out></td>
					      <td><c:out value="${ student.contact.state }"></c:out></td>
					    </tr>
					  </c:forEach>
					  </tbody>
					</table>
				</div>
			</div>
		</div>
	</body>
</html>