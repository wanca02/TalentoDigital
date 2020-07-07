<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>    
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>New License!</title>
		<!-- CSS only -->
		<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css" integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk" crossorigin="anonymous">
	</head>
	<body>
		<div class="container mt-5">
			<div class="row justify-content-center">
				<div class="col-5">
					<form action="/licenses/add" method="post">
				    <div class="form-group row">
			        <label class="col-sm-2 col-form-label">Person: </label>
			        <div class="col-sm-10">
			        	<select class="form-control" name="personId">
			        		<c:forEach items="${ persons }" var="person">
			        			<option value="${ person.id }"><c:out value="${ person.firstName }"></c:out></option>
			        		</c:forEach>
			        	</select>
			        </div>
				    </div>
				    <div class="form-group row">
			        <label class="col-sm-2 col-form-label" for="state">State: </label>
			        <div class="col-sm-10">
			        	<input type="text" class="form-control" name="state"/>
			        </div>
				    </div>
				    <div class="form-group row">
			        <label class="col-sm-2 col-form-label" for="expirationDate">Expiration Date: </label>
			        <div class="col-sm-10">
			        	<input type="date" class="form-control" name="expirationDate"/>
			        </div>
				    </div>
				    <input type=hidden class="form-control" name="number" value="00000"/>
				    <input type="submit" class="btn btn-primary" value="Create"/>
					</form>
				</div>
			</div>
		</div>
	</body>
</html>