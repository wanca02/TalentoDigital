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
					<form action="/events/editEvent" method="post">
						<input type="hidden" name="_method" value="PUT"/>
						<input type="hidden" name="eventId" value="${ _event.id }">
				    <div class="form-group row">
			        <label class="col-sm-4 col-form-label" for="name">Name: </label>
			        <div class="col-sm-8">
			        	<input type="text" class="form-control" name="name" value="${ _event.name }"/>
			        </div>
				    </div>
				    <div class="form-group row">
			        <label class="col-sm-4 col-form-label" for="date">Date: </label>
			        <div class="col-sm-8">
			        	<input type="date" class="form-control" name="date" value="${ _event.date }"/>
			        </div>
				    </div>
					  <div class="form-group row">
					    <label class="col-sm-4 col-form-label" for="location">Location</label>
					    <div class="col-sm-8">
						    <select class="form-control" name="location">
						      <option value="Temuco">Temuco</option>
						      <option value="Valdivia">Valdivia</option>
						      <option value="Santiago">Santiago</option>
						      <option value="Pucon">Pucon</option>
						      <option value="Iquique">Iquique</option>
						    </select>
						  </div>
					  </div>
				    <input type="submit" class="btn btn-primary" value="Actualizar"/>
					</form>
				</div>
			</div>
		</div>
	</body>
</html>



