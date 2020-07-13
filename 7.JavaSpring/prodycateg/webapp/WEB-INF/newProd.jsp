<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>    
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>New Dojo!</title>
		<!-- CSS only -->
		<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.5.0/css/bootstrap.min.css" integrity="sha384-9aIt2nRpC12Uk9gS9baDl411NQApFmC26EwAOH8WgZl5MYYxFfc+NcPb1dKGj7Sk" crossorigin="anonymous">
		<link rel="stylesheet" href="../css/style.css">
	</head>
	<body>
		<div class="container mt-3">
			<div class="row">
				<div class="col">
					<a href="../categories/new">Crear Categoria</a>
				</div>
			</div>
			<div class="row">
				<div class="col offset-2">
					<h1>New Product</h1>
				</div>
			</div>
			<div class="row justify-content-center">
				<div class="col-5">
					<form:form action="addProduct" method="post" modelAttribute="product">
				    <div class="form-group row">
			        <form:label class="col-sm-4 col-form-label" path="name">Name: </form:label>
			        <form:errors path="name"/>
			        <div class="col-sm-8">
			        	<form:input type="text" class="form-control" path="name"/>
			        </div>
				    </div>
				    <div class="form-group row">
			        <form:label class="col-sm-4 col-form-label" path="description">Description: </form:label>
			        <form:errors path="description"/>
			        <div class="col-sm-8">
			        	<form:textarea class="form-control" rows="3" path="description"/>
			        </div>
				    </div>
				    <div class="form-group row">
			        <form:label class="col-sm-4 col-form-label" path="price">Price: </form:label>
			        <form:errors path="price"/>
			        <div class="col-sm-8">
			        	<form:input type="number" step="0.01" class="form-control" path="price"/>
			        </div>
				    </div>
				    <input type="submit" class="btn btn-primary" value="Create"/>
					</form:form>
				</div>
				<div class="col-6">
					<table class="table table-hover table-fixed">
					  <thead>
					    <tr>
					      <th scope="col">#</th>
					      <th scope="col">Name</th>
					      <th scope="col">Action</th>
					    </tr>
					  </thead>
					  <tbody>
					  	<%int cc=1; %>
						  <c:forEach items="${ products }" var="product">
							  <tr>
						      <th scope="row"><%=cc++ %></th>
						      <td><c:out value="${ product.name }"></c:out></td>
						      <td><a href="<c:out value="${ product.id }"></c:out>">Ver</a></td>
						    </tr>
						  </c:forEach>
					  </tbody>
					</table>
				</div>
			</div>
		</div>
	</body>
</html>








