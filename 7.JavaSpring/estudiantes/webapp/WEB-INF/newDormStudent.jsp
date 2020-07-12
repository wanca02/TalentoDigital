<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>    
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>New DormStudent!</title>
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
		        <a class="nav-link" href="../students/new">Ingresar Estudiante</a>
		      </li>
		    </ul>
		  </div>
		</nav>
		<div class="container">
			<div class="row justify-content-center">
				<div class="col-5">
					<form action="addDormStudent" method="post">
				    <div class="form-group row">
			        <label class="col-sm-4 col-form-label">Students: </label>
			        <div class="col-sm-8">
			        	<select class="form-control" name="studentId">
			        		<c:forEach items="${ students }" var="student">
			        			<option value="${ student.id }"><c:out value="${ student.firstName }"></c:out> <c:out value="${ student.lastName }"></c:out></option>
			        		</c:forEach>
			        	</select>
			        </div>
				    </div>
				    <input type="hidden" name="dormId" value="<c:out value="${ dormId }"></c:out>">
				    <input type="submit" class="btn btn-primary" value="Create"/>
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
						  <c:forEach items="${ dorm.dormstudent }" var="dorm">
							  <tr>
						      <th scope="row"><%=cc++ %></th>
						      <td><c:out value="${ dorm.student.firstName }"></c:out></td>
						      <td>Remove</td>
						    </tr>
						  </c:forEach>
					  </tbody>
					</table>
				</div>
			</div>
		</div>
	</body>
</html>










