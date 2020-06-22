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
		<link rel="stylesheet" href="./css/style.css"/>
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
		<div class="container mt-3">
			<div class="row">
				<div class="col">
					<h2>Top Ten Songs: </h2>
				</div>
			</div>
			<div class="row justify-content-center mt-4">
				<div class="col-8">
					<table class="table table-hover">
					  <tbody>
					    <c:forEach items="${ songs }" var="song">
					    	<tr>
						      <th scope="row"><c:out value="${ song.id }"></c:out></th>
						      <td><a href="songs/<c:out value="${ song.id }"></c:out>"><c:out value="${ song.title }"></c:out></a></td>
						      <td><c:out value="${ song.rating }"></c:out></td>
						      <td>
						      	<form action="del" method="post">
									    <input type="hidden" name="_method" value="DELETE">
									    <input type="hidden" name="id" value="<c:out value="${ song.id }"></c:out>">
									    <button type="submit" class="btn btn-outline-danger" value="Delete">Delete</button>
										</form>
						      </td>
						    </tr>
					    </c:forEach>
					  </tbody>
					</table>
				</div>
			</div>
		</div>
	</body>
</html>