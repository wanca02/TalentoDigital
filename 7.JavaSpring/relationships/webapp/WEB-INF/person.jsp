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
		<div class="container mt-5">
			<div class="row">
				<div class="col">
					<a href="../licenses/new">Crear Licencias</a>
				</div>
			</div>
			<div class="row justify-content-center">
				<div class="col-5">
					<form:form action="/persons/add" method="post" modelAttribute="person">
				    <div class="form-group row">
			        <form:label class="col-sm-2 col-form-label" path="firstName">First Name: </form:label>
			        <form:errors path="firstName"/>
			        <div class="col-sm-10">
			        	<form:input type="text" class="form-control" path="firstName"/>
			        </div>
				    </div>
				    <div class="form-group row">
			        <form:label class="col-sm-2 col-form-label" path="lastName">Last Name: </form:label>
			        <form:errors path="lastName"/>
			        <div class="col-sm-10">
			        	<form:input type="text" class="form-control" path="lastName"/>
			        </div>
				    </div>
				    <input type="submit" class="btn btn-primary" value="Create"/>
					</form:form>
				</div>
			</div>
		</div>
	</body>
</html>














