<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>    
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Show Question!</title>
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
					<h1><c:out value="${ question.question }"></c:out></h1>
					<h4>Tags <c:out value="${ question.tags[0].tag }"></c:out></h4>
				</div>
			</div>
			<div class="row mt-5 justify-content-center">
				<div class="col">
					<table class="table table-strip table-hover">
						<thead>
							<tr>
								<th>Answers</th>
							</tr>
						</thead>		
						<tbody>
							<c:forEach items="${ question.answers }" var="answer">
								<tr>
									<td><c:out value="${ answer.answer }"></c:out></td>
								</tr>			
							</c:forEach>
						</tbody>			
					</table>
				</div>
				<div class="col">
					<form action="addAnswerQuestion" method="post">
						<div class="form-group row">
							<label class="col-sm-2 col-form-label">Answer: </label>
			        <div class="col-sm-10">
			        	<textarea rows="5" class="form-control" name="answer"></textarea>
			        </div>
						</div>
						<input type="hidden" name="questionId" value="${ question.id }" />
						<div class="row justify-content-right">
							<div class="col offset-9">
								<input type="submit" class="btn btn-primary" value="Answer it" />
							</div>
						</div>
					</form>
				</div>
			</div>
		</div>
	</body>
</html>










