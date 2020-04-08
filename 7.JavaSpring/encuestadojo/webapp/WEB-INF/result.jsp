<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
  <head>
    <meta charset="ISO-8859-1">
    <title>Dojo Survey Index</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
    <link rel="stylesheet" href="./css/style.css"/>
  </head>
  <body>
    <div class="container">
    	<div class="row mt-5">
    		<div class="col-6 offset-3">
    			<h5>Submitted Info</h5>
    		</div>
    	</div>
      <div class="row justify-content-center">
      	<div class="col-3">
      	  <ul class="list-group list-group-flush">
					  <li class="list-group-item">Name</li>
					  <li class="list-group-item">Dojo Location</li>
					  <li class="list-group-item">Favorite Language</li>
					  <li class="list-group-item">Comment</li>
					  <li class="list-group-item"></li>
					</ul>
      	</div>
      	<div class="col-3">
      	  <ul class="list-group list-group-flush">
					  <li class="list-group-item"><c:out value="${ name }"/></li>
					  <li class="list-group-item"><c:out value="${ location }"/></li>
					  <li class="list-group-item"><c:out value="${ language }"/>!!!</li>
					  <li class="list-group-item"><c:out value="${ comment }"/></li>
					  <li class="list-group-item"></li>
					</ul>
      	</div>
      </div>
    </div>
  </body>
</html>







