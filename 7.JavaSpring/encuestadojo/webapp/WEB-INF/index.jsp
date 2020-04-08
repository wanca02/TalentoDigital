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
  <div class="container mg">
  	<div class="row mt-5">
  		<div class="col-6 offset-3">
  			<p><c:out value="${ error }"/></p>
  		</div>
  	</div>
  	<div class="row mt-3">
  	  <div class="col-6 offset-3 justify-content-center border">
	    <form action="result" method="post">
		  <div class="form-group row">
		    <label for="staticName" class="col-sm-4 col-form-label">Your name:</label>
		    <div class="col-sm-8">
		      <input type="text" class="form-control" name="name">
		    </div>
		  </div>
		  <div class="form-group row">
		    <label for="inputLocation" class="col-sm-4 col-form-label">Dojo Location:</label>
		    <div class="col-sm-8">
		      <select class="form-control" name="location">
		      	<option value="none">Choose one location...</option>
		        <option value="Temuco">Temuco</option>
		        <option value="San José">San José</option>
		        <option value="Santiago">Santiago</option>
		        <option value="Londres">Londres</option>
		        <option value="San Francisco">San Francisco</option>
		      </select>
		    </div>
		  </div>
		  <div class="form-group row">
		    <label for="inputLanguage" class="col-sm-4 col-form-label">Favorite Language:</label>
		    <div class="col-sm-8">
		      <select class="form-control" name="language">
		        <option value="none">Choose one language...</option>
		        <option value="Python">Python</option>
		        <option value="Java">Java</option>
		        <option value="R">R</option>
		        <option value="C">C/C++</option>
		        <option value="Go">Go</option>
		      </select>
		    </div>
		  </div>
		  <div class="form-group">
		    <label for="comment">Comment (optional):</label>
		    <textarea class="form-control" name="comment" rows="3"></textarea>
		  </div>
		  <button type="submit" class="btn btn-primary">Submit</button>
		</form>
	  </div>
  	</div>
  </div>
</body>
</html>






