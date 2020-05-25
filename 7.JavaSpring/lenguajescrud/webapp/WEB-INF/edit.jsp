<%@ page isErrorPage="true" %>  
<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>    
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Editar Lenguaje!</title>
		<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css" integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk" crossorigin="anonymous">
	</head>
	<body>
		<div class="container">
			<div class="row mt-5">
				<div class="col">
					<a href="/languages">DashBoard</a>
				</div>
			</div>
			<div class="row mt-3">
				<div class="col-6 offset-3">
					<form:form action="/languages/${ lang.id }" method="post" modelAttribute="lang">
						<input type="hidden" name="_method" value="PUT">
				    <div class="form-group row">
			        <form:label class="col-sm-2 col-form-label" path="name">Name</form:label>
			        <form:errors path="name"/>
			        <div class="col-sm-10">
			        	<form:input type="text" class="form-control" path="name" placeholder="${ lang.name }"/>
			        </div>
				    </div>
				    <div class="form-group row">
			        <form:label class="col-sm-2 col-form-label" path="creator">Creator</form:label>
			        <form:errors path="creator"/>
			        <div class="col-sm-10">
			        	<form:input type="text" class="form-control" path="creator" placeholder="${ lang.creator }"/>
			        </div>
				    </div>
				    <div class="form-group row">
			        <form:label class="col-sm-2 col-form-label" path="currentVersion">Version</form:label>
			        <form:errors path="currentVersion"/>
			        <div class="col-sm-10">
			        	<form:input type="text" class="form-control" path="currentVersion" placeholder="${ lang.currentVersion }"/>
			        </div>
				    </div>
				    <input type="submit" class="btn btn-primary" value="Submit"/>
					</form:form>
				</div>
			</div>
			<div class="row">
				<div class="col">
					<table>
						<tr>
							<td>
				      	<form action="/languages/${lang.id}" method="post">
							    <input type="hidden" name="_method" value="DELETE">
							    <input type="submit" class="btn btn-danger" value="Delete">
								</form>
				      </td>
				    </tr>
					</table>
				</div>
			</div>
		</div>
	</body>
</html>







