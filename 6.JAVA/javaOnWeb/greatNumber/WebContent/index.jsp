<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>The Great Number!</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">
    <script src="https://code.jquery.com/jquery-3.4.1.slim.min.js" integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n" crossorigin="anonymous"></script>
	<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
	<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js" integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6" crossorigin="anonymous"></script>

</head>
<body>
  <div class="container text-center">
  	<div class="row">
  	  <div class="col">
  	  	<h1>Welcome to the great Number Game</h1>
  	  </div>
  	</div>
  	<div class="row">
  	  <div class="col">
  	  	<h3>I am thinking of a number between 1 and 100</h3><br>
  	  	<h3>Take a guess!</h3>
  	  </div>
  	</div>
  	<div class="row">
  		<%if(session.getAttribute("html")!=null){  out.println(session.getAttribute("html"));  }%>
  	</div>
  	<br>
  	<div class="row">
  	  <div class="col-2 offset-5">
  	  	<form action="Number" method="post" class="justify-content-center">
		  <div class="form-group">
		  	<input class="form-control" type="text" name="numberIn" placeholder="Enter a number..."/>
		  </div>
		  <%if(session.getAttribute("button")!=null){  out.println(session.getAttribute("button"));  }else{%>
		  	<input name="play" value="none" type="hidden">
		  	<button class="btn btn-info" type="submit">Submit</button>
		  <%} %>
		</form>
  	  </div>
  	</div>
  </div>
</body>
</html>