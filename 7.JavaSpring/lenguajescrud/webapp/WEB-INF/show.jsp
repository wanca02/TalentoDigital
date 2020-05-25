<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>    
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Mostrar el Libro</title>
		<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css" integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk" crossorigin="anonymous">
	</head>
	<body>
		<div class="container mt-5">
			<div class="row">
				<div class="col">
					<a href="/languages">DashBoard</a>
				</div>
			</div>
			<div class="row">
				<div class="col">
					<h1><c:out value="${lang.name}"/></h1>
					<p>Description: <c:out value="${lang.creator}"/></p>
					<p>Language: <c:out value="${lang.currentVersion}"/></p>
				</div>
			</div>
			<div class="row mt-4">
				<div class="col">
					<table>
						<tr>
							<td>
				      	<form action="/languages/${lang.id}" method="post">
							    <input type="hidden" name="_method" value="DELETE">
							    <input type="submit" class="btn btn-danger" value="Delete">
								</form>
				      </td>
				      <td><a href="languages/edit/<c:out value="${ lang.id }"/>" class="btn btn-info" role="button">edit</a></td>
				    </tr>
					</table>
				</div>
			</div>
		</div>
	</body>
</html>