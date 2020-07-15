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
		      <li class="nav-item">
		        <a class="nav-link" href="/questions/new">Ingresar Pregunta</a>
		      </li>
		    </ul>
		  </div>
		</nav>
		<div class="container">
			<div class="row">
				<div class="col">
					<h1>Questions Dashboard</h1>
				</div>
			</div>
			<div class="row mt-5 justify-content-center">
				<div class="col-7">
					<table class="table table-strip table-hover">
						<thead>
							<tr>
								<th>Question</th>
								<th>Tags</th>
							</tr>
						</thead>		
						<tbody>
							<c:forEach items="${ questions }" var="q">
								<tr>
									<td>
										<a href="/questions/<c:out value='${ q.id }'/>"><c:out value="${ q.question }"></c:out></a>
									</td>
									<td><c:out value="${ q.tags[0].tag }"></c:out></td>
								</tr>			
							</c:forEach>
						</tbody>			
					</table>
				</div>
			</div>
		</div>
	</body>
</html>










