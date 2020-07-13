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
		        <a class="nav-link" href="#">Home <span class="sr-only">(current)</span></a>
		      </li>
		      <li class="nav-item">
		        <a class="nav-link" href="../products/new">Ingresar Producto</a>
		      </li>
		      <li class="nav-item">
		        <a class="nav-link" href="/categories/new">Crear Categoria</a>
		      </li>
		    </ul>
		  </div>
		</nav>
		<div class="container mt-3">
			<div class="row">
				<div class="col">
					<h1><c:out value="${ category.name }"/></h1>
				</div>
			</div>
			<div class="row mt-3 justify-content-center">
				<div class="col">
					<h3>Productos</h3>
					<ul>
						<c:forEach items="${ category.products }" var="product">
							<li><c:out value="${ product.name }"/></li>							
						</c:forEach>
					</ul>
				</div>
				<div class="col">
					<form action="addCategoProd" method="post">
				    <div class="form-group row">
			        <label class="col-sm-4 col-form-label" for="name">Add Product: </label>
			        <div class="col-sm-8">
			        	<select class="form-control" name="prodId">
			        		<c:forEach items="${ products }" var="product">
			        			<option value="<c:out value="${ product.id }"/>"><c:out value="${ product.name }"/></option>
			        		</c:forEach>
			        	</select>
			        </div>
				    </div>
				    <input type="hidden" name="categoId" value="<c:out value="${ categoId }"/>"/>
				    <input type="submit" class="btn btn-primary" value="Add"/>
					</form>
				</div>
			</div>
		</div>
	</body>
</html>








