<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>    
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>New Person!</title>
		<!-- CSS only -->
		<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css" integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk" crossorigin="anonymous">
	</head>
	<body>
		<div class="container mt-5">
			<div class="row">
				<div class="col">
					<a href="new">Go Back</a>
				</div>
			</div>
			<div class="row">
				<div class="col-5">
					<h2><c:out value="${person.firstName}"/> <c:out value="${person.lastName}"/></h2>
				</div>
			</div>
			<div class="row">
				<div class="col-5">
					<table>
						<tr>
							<td>License Number</td>
							<td><c:out value="${license.number}"/></td>
						</tr>
						<tr>
							<td>State</td>
							<td><c:out value="${license.state}"/></td>
						</tr>
						<tr>
							<td>Expiration Date</td>
							<td><c:out value="${license.expirationDate}"/></td>
						</tr>
					</table>
				</div>
			</div>
		</div>
	</body>
</html>