<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Ninja Gold Game</title>
		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
  	<link rel="stylesheet" href="./css/style.css"/>
  	<script src = "https://ajax.googleapis.com/ajax/libs/jquery/3.4.0/jquery.min.js"></script> 
	</head>
	<body>
		<div class="container">
			<div class="row mt-3">
				<div class="col">
					<h2>Your Gold: <c:out value="${ gold }"/></h2>
				</div>
			</div>
			<div class="row mt-3">
				<div class="col">
					<form action="calculate" method="post">
					  <div class="form-group">
					  	<h3>Farm</h3>
					  	<p>(earns 10-20 gold)</p>
					  </div>
					  <input name="place" value="farm" hidden="true">
					  <button type="submit" class="btn btn-primary">Find Gold!</button>
					</form>
				</div>
				<div class="col">
					<form action="calculate" method="post">
					  <div class="form-group">
					  	<h3>Cave</h3>
					  	<p>(earns 5-10 gold)</p>
					  </div>
					  <input name="place" value="cave" hidden="true">
					  <button type="submit" class="btn btn-primary">Find Gold!</button>
					</form>
				</div>
				<div class="col">
					<form action="calculate" method="post">
					  <div class="form-group">
					  	<h3>House</h3>
					  	<p>(earns 2-5 gold)</p>
					  </div>
					  <input name="place" value="house" hidden="true">
					  <button type="submit" class="btn btn-primary">Find Gold!</button>
					</form>
				</div>
				<div class="col">
					<form action="calculate" method="post">
					  <div class="form-group">
					  	<h3>Casino!</h3>
					  	<p>(earns 0-50 gold)</p>
					  </div>
					  <input name="place" value="casino" hidden="true">
					  <button type="submit" class="btn btn-primary">Find Gold!</button>
					</form>
				</div>
			</div>
			<div class="row mt-3">
				<div class="col">
					<h3>Activities</h3>
				</div>
			</div>
			<div class="row mt-3">
				<div class="col">
					<textarea id="history" rows="7" cols="50" readonly>
						<c:out value="${ history }" />
					</textarea>
				</div>
			</div>
		</div>
	</body>
	<footer>
		<script type="text/javascript" src="./js/script.js"></script>
	</footer>
</html>














