<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
  <head>
    <meta charset="ISO-8859-1">
    <title>Secret Code</title>
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm" crossorigin="anonymous">
    <link rel="stylesheet" href="./css/style.css"/>
  </head>
  <body>
    <div class="container">
	  <div class="row">
	    <div class="col text-center">
	      <p><c:out value="${ error }"/></p>
	    </div>
	  </div>
	  <div class="row">
	    <div class="col text-center">
	      <form action="/login" method="post">
			<div class="form-group">
		      <label for="">What is the code?</label>
		      <input type="text" class="form-control wd" placeholder="Enter code" name="code">
			</div>
			<button type="submit" class="btn btn-primary">Check Code</button>
		  </form>
	    </div>
	  </div>
	</div>
  </body>
</html>