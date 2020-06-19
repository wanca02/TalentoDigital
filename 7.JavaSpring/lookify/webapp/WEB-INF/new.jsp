<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>    
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Lookify!</title>
		<!-- CSS only -->
		<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css" integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk" crossorigin="anonymous">
	</head>
	<body>
		<nav class="navbar navbar-expand-lg navbar-light bg-light">
		  <a class="navbar-brand" href="/">Lookify</a>
		  <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
		    <span class="navbar-toggler-icon"></span>
		  </button>
		  <div class="collapse navbar-collapse" id="navbarSupportedContent">
		    <ul class="navbar-nav mr-auto">
		      <li class="nav-item active">
		        <a class="nav-link" href="/dashboard">Home <span class="sr-only">(current)</span></a>
		      </li>
		    </ul>
		  </div>
		</nav>
		<div class="container mt-5">
			<div class="row justify-content-center">
				<div class="col-5">
					<form:form action="/songs/add" method="post" modelAttribute="song">
				    <div class="form-group row">
			        <form:label class="col-sm-2 col-form-label" path="title">Title</form:label>
			        <form:errors path="title"/>
			        <div class="col-sm-10">
			        	<form:input type="text" class="form-control" path="title"/>
			        </div>
				    </div>
				    <div class="form-group row">
			        <form:label class="col-sm-2 col-form-label" path="artist">Artist</form:label>
			        <form:errors path="artist"/>
			        <div class="col-sm-10">
			        	<form:input type="text" class="form-control" path="artist"/>
			        </div>
				    </div>
				    <div class="form-group row">
			        <form:label class="col-sm-2 col-form-label" path="rating">Rating</form:label>
			        <form:errors path="rating"/>
			        <div class="col-sm-3">
			        	<form:input type="number" class="form-control" path="rating" min="1" max="100"/>
			        </div>
				    </div>
				    <input type="submit" class="btn btn-primary" value="Submit"/>
					</form:form>
				</div>
			</div>
		</div>
	</body>
</html>