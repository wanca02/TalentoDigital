<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>    
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>New Student!</title>
		<!-- CSS only -->
		<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css" integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk" crossorigin="anonymous">
		<link rel="stylesheet" href="../css/style.css">
	</head>
	<body>
		<div class="container mt-5">
			<div class="row">
				<div class="col">
					<a href="../contacts/new">Crear Contacto</a>
				</div>
			</div>
			<div class="row justify-content-center">
				<div class="col-5">
					<form:form action="addStudent" method="post" modelAttribute="student">
				    <div class="form-group row">
			        <form:label class="col-sm-4 col-form-label" path="firstName">First Name: </form:label>
			        <form:errors path="firstName"/>
			        <div class="col-sm-8">
			        	<form:input type="text" class="form-control" path="firstName"/>
			        </div>
				    </div>
				    <div class="form-group row">
			        <form:label class="col-sm-4 col-form-label" path="lastName">Last Name: </form:label>
			        <form:errors path="lastName"/>
			        <div class="col-sm-8">
			        	<form:input type="text" class="form-control" path="lastName"/>
			        </div>
				    </div>
				    <div class="form-group row">
			        <form:label class="col-sm-4 col-form-label" path="age">Age: </form:label>
			        <form:errors path="age"/>
			        <div class="col-sm-8">
			        	<form:input type="number" class="form-control" path="age"/>
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
						  <c:forEach items="${ students }" var="student">
							  <tr>
						      <th scope="row"><%=cc++ %></th>
						      <td><c:out value="${ student.firstName }"></c:out> <c:out value="${ student.lastName }"></c:out></td>
						      <td><a href="<c:out value="${ student.id }"></c:out>">Ver</a></td>
						    </tr>
						  </c:forEach>
					  </tbody>
					</table>
				</div>
			</div>
		</div>
	</body>
</html>














