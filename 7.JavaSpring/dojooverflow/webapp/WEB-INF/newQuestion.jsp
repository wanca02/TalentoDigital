<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>    
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>New Question!</title>
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
		        <a class="nav-link" href="../">Home <span class="sr-only">(current)</span></a>
		      </li>
		      <li class="nav-item">
		        <a class="nav-link" href="../questions">Dashboard</a>
		      </li>
		    </ul>
		  </div>
		</nav>
		<div class="container">
			<div class="row justify-content-center">
				<div class="col-7">
					<form action="addQuestionTag" method="post">
				    <div class="form-group row">
			        <label class="col-sm-2 col-form-label">Question: </label>
			        <div class="col-sm-10">
			        	<input type="text" class="form-control" name="question"/>
			        </div>
				    </div>
				    <div class="form-group row">
			        <label class="col-sm-4 col-form-label">Tags: </label>
			        <div class="col-sm-8">
			        	<input type="text" class="form-control" name="tag"/>
			        </div>
				    </div>
				    <input type="submit" class="btn btn-primary" value="Create"/>
					</form>
				</div>
			</div>
		</div>
	</body>
</html>










