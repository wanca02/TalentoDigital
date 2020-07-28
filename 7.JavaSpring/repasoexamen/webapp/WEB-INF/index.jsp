<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>    
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Home Registration!</title>
		<!-- CSS only -->
		<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css" integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk" crossorigin="anonymous">
	</head>
	<body>
		<div class="container mt-5">
			<div class="row justify-content-center">
				<div class="col-6">
					<form:form action="addUser" method="post" modelAttribute="user">
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
			        <form:label class="col-sm-4 col-form-label" path="email">Email: </form:label>
			        <form:errors path="email"/>
			        <div class="col-sm-8">
			        	<form:input type="email" class="form-control" path="email"/>
			        </div>
				    </div>
				    <div class="form-group row">
					    <form:label class="col-sm-4 col-form-label" path="location">Location</form:label>
					    <div class="col-sm-8">
					    <form:select class="form-control" path="location">
					      <form:option value="Temuco">Temuco</form:option>
					      <form:option value="Valdivia">Valdivia</form:option>
					      <form:option value="Santiago">Santiago</form:option>
					      <form:option value="Pucon">Pucon</form:option>
					      <form:option value="Iquique">Iquique</form:option>
					    </form:select>
					    </div>
					  </div>
					  <div class="form-group row">
			        <form:label class="col-sm-4 col-form-label" path="password">Password: </form:label>
			        <form:errors path="password"/>
			        <div class="col-sm-8">
			        	<form:input type="password" class="form-control" path="password"/>
			        </div>
				    </div>
				    <div class="form-group row">
			        <form:label class="col-sm-4 col-form-label" path="passwordConfirmation">PW Conf: </form:label>
			        <form:errors path="passwordConfirmation"/>
			        <div class="col-sm-8">
			        	<form:input type="password" class="form-control" path="passwordConfirmation"/>
			        </div>
				    </div>
				    <input type="submit" class="btn btn-primary" value="Registrar"/>
					</form:form>
				</div>
				<div class="col-6">
					<form action="login" method="post">
					  <div class="form-group row">
					    <label for="staticEmail" class="col-sm-2 col-form-label">Email</label>
					    <div class="col-sm-10">
					      <input type="text" class="form-control" name="email" placeholder="email@example.com">
					    </div>
					  </div>
					  <div class="form-group row">
					    <label for="inputPassword" class="col-sm-2 col-form-label">Password</label>
					    <div class="col-sm-10">
					      <input type="password" class="form-control" name="password" placeholder="*******">
					    </div>
					  </div>
					  <input type="submit" class="btn btn-primary" value="Ingresar"/>
					</form>
				</div>
			</div>
		</div>
	</body>
</html>



