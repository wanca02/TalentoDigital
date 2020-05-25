<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>    
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Languages DashBoard</title>
		<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css" integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk" crossorigin="anonymous">
	</head>
	<body>
		<div class="container mt-5">
			<div class="row">
				<div class="col-4">
					<form:form action="/languages/add" method="post" modelAttribute="lang">
				    <div class="form-group row">
			        <form:label class="col-sm-2 col-form-label" path="name">Name</form:label>
			        <form:errors path="name"/>
			        <div class="col-sm-10">
			        	<form:input type="text" class="form-control" path="name"/>
			        </div>
				    </div>
				    <div class="form-group row">
			        <form:label class="col-sm-2 col-form-label" path="creator">Creator</form:label>
			        <form:errors path="creator"/>
			        <div class="col-sm-10">
			        	<form:input type="text" class="form-control" path="creator"/>
			        </div>
				    </div>
				    <div class="form-group row">
			        <form:label class="col-sm-2 col-form-label" path="currentVersion">Version</form:label>
			        <form:errors path="currentVersion"/>
			        <div class="col-sm-10">
			        	<form:input type="text" class="form-control" path="currentVersion"/>
			        </div>
				    </div>
				    <input type="submit" class="btn btn-primary" value="Submit"/>
					</form:form>
				</div>
				<div class="col-8">
					<table class="table table-striped">
					  <thead>
					    <tr>
					      <th scope="col">Name</th>
					      <th scope="col">Creator</th>
					      <th scope="col">Version</th>
					      <th scope="col" colspan=2>Action</th>
					    </tr>
					  </thead>
					  <tbody>
					  	<c:forEach items="${langs}" var="lang">
					    <tr>
					      <td><a href="languages/<c:out value="${ lang.id }"/>"><c:out value="${ lang.name }"/></a></td>
					      <td><c:out value="${ lang.creator }"/></td>
					      <td><c:out value="${ lang.currentVersion }"/></td>
					      <td>
					      	<form action="/languages/${lang.id}" method="post">
								    <input type="hidden" name="_method" value="DELETE">
								    <input type="submit" class="btn btn-danger" value="Delete">
									</form>
					      </td>
					      <td><a href="languages/edit/<c:out value="${ lang.id }"/>" class="btn btn-info" role="button">edit</a></td>
					    </tr>
					    </c:forEach>
					  </tbody>
					</table>
				</div>
			</div>
		</div>
	</body>
</html>