<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>    
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Home ID:<c:out value="${ user.id }"></c:out></title>
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
		        <a class="nav-link" href="/">Home <span class="sr-only">(current)</span></a>
		      </li>
		      <li class="nav-item">
		        <a class="nav-link" href="/logout">Logout</a>
		      </li>
		    </ul>
		  </div>
		</nav>
		<div class="container mt-2">
			<div class="row">
				<div class="col">
					<h1>Welcome! <c:out value="${ user.firstName }"></c:out></h1>
					<c:out value="${ user.relevents[1].location }"></c:out>
				</div>
			</div>
			<div class="row mt-5">
				<div class="col">
					<h5>Same Región</h5>
				</div>
			</div>
			<div class="row justify-content-center">
				<div class="col-10">
					<table class="table table-hover">
						<thead>
							<tr>
								<th>Name</th>
								<th>Date</th>
								<th>Location</th>
								<th>Host</th>
								<th>Action/Status</th>
							</tr>
						</thead>
						<tbody>
						<c:forEach items="${ events }" var="event">
							<c:set var="ok" value="${ false }"></c:set>
							<c:forEach items="${ event.relausers }" var="users">
								<c:if test="${ users.id eq pageContext.session.getAttribute('userId') }">
									<c:set var="ok" value="${ true }"></c:set>
								</c:if>
							</c:forEach>
							<tr>
								<td><c:out value="${ event.name }"></c:out></td>
								<td><c:out value="${ event.date }"></c:out></td>
								<td><c:out value="${ event.location }"></c:out></td>
								<td><c:out value="${ event.user.firstName }"></c:out></td>
								<td>
									<c:choose>
										<c:when test="${ pageContext.session.getAttribute('userId') == event.user.id}">
											<a class="btn btn-outline-info" href="/events/${ event.id }">Edit</a>
											<form action="/events/deleteEvent" method="post">
												<input type="hidden" name="_method" value="DELETE"/>
										    <input type="hidden" name="eventId" value="${ event.id }">
										    <input type="hidden" name="userId" value="${ event.user.id }">
										    <button type="submit" class="btn btn-outline-danger">Delete</button>
											</form>
										</c:when>
										<c:when test="${ ok eq true }">
											<form action="/events/cancelUserEvent" method="post">
										    <input type="hidden" name="evenId" value="<c:out value="${ event.id }"></c:out>">
										    <input type="hidden" name="userId" value="<c:out value="${ event.user.id }"></c:out>">
										    <button type="button" class="btn btn-outline-primary" disabled>Joining</button>
										    <button type="submit" class="btn btn-outline-danger">Cancel</button>
											</form>
										</c:when>
										<c:otherwise>
											<form action="/events/addUserEvent" method="post">
												<input type="hidden" name="evenId" value="<c:out value="${ event.id }"></c:out>">
										    <input type="hidden" name="userId" value="<c:out value="${ event.user.id }"></c:out>">
										    <button type="submit" class="btn btn-outline-info">Join</button>
											</form>
										</c:otherwise>
									</c:choose>
								</td>
							</tr>
						</c:forEach>
						</tbody>
					</table>
				</div>
			</div>
			
			<div class="row">
				<div class="col">
					<h5>Others Región</h5>
				</div>
			</div>
			<div class="row justify-content-center">
				<div class="col-10">
					<table class="table table-hover">
						<thead>
							<tr>
								<th>Name</th>
								<th>Date</th>
								<th>Location</th>
								<th>Host</th>
								<th>Action/Status</th>
							</tr>
						</thead>
						<tbody>
							<c:forEach items="${ _events }" var="event">
							<c:set var="ok" value="${ false }"></c:set>
							<c:forEach items="${ event.relausers }" var="users">
								<c:if test="${ users.id eq pageContext.session.getAttribute('userId') }">
									<c:set var="ok" value="${ true }"></c:set>
								</c:if>
							</c:forEach>
							<tr>
								<td><c:out value="${ event.name }"></c:out></td>
								<td><c:out value="${ event.date }"></c:out></td>
								<td><c:out value="${ event.location }"></c:out></td>
								<td><c:out value="${ event.user.firstName }"></c:out></td>
								<td>
									<c:choose>
										<c:when test="${ pageContext.session.getAttribute('userId') == event.user.id}">
											<a class="btn btn-outline-info" href="/events/<c:out value="${ event.id }"></c:out>">Edit</a>
											<form action="/events/deleteEvent" method="post">
												<input type="hidden" name="_method" value="DELETE"/>
										    <input type="hidden" name="eventId" value="<c:out value="${ event.id }"></c:out>">
										    <input type="hidden" name="userId" value="<c:out value="${ event.user.id }"></c:out>">
										    <button type="submit" class="btn btn-outline-danger">Delete</button>
											</form>
										</c:when>
										<c:when test="${ ok eq true }">
											<form action="/events/cancelUserEvent" method="post">
										    <input type="hidden" name="evenId" value="<c:out value="${ event.id }"></c:out>">
										    <input type="hidden" name="userId" value="<c:out value="${ event.user.id }"></c:out>">
										    <button type="button" class="btn btn-outline-primary" disabled>Joining</button>
										    <button type="submit" class="btn btn-outline-danger">Cancel</button>
											</form>
										</c:when>
										<c:otherwise>
											<form action="/events/addUserEvent" method="post">
										    <input type="hidden" name="evenId" value="<c:out value="${ event.id }"></c:out>">
										    <input type="hidden" name="userId" value="<c:out value="${ event.user.id }"></c:out>">
										    <button type="submit" class="btn btn-outline-info">Join</button>
											</form>
										</c:otherwise>
									</c:choose>
								</td>
							</tr>
						</c:forEach>
						</tbody>
					</table>
				</div>
			</div>
		</div>
		<div class="row justify-content-center">
			<div class="col-6">
				<form:form action="/events/addEvent" method="post" modelAttribute="event">
				    <div class="form-group row">
			        <form:label class="col-sm-4 col-form-label" path="name">Name: </form:label>
			        <form:errors path="name"/>
			        <div class="col-sm-8">
			        	<form:input type="text" class="form-control" path="name"/>
			        </div>
				    </div>
				    <div class="form-group row">
			        <form:label class="col-sm-4 col-form-label" path="date">Date: </form:label>
			        <form:errors path="date"/>
			        <div class="col-sm-8">
			        	<form:input type="date" class="form-control" path="date"/>
			        </div>
				    </div>
					  <div class="form-group row">
					    <form:label class="col-sm-4 col-form-label" path="location">Location</form:label>
					    <div class="col-sm-8">
					    <form:select class="form-control" path="location">
					      <form:option value="Temuco">Temuco</form:option>
					      <form:option value="Valdivia">Valdivia</form:option>
					      <form:option value="Santiago">Santiago</form:option>
					      <form:option value="Pucon">Pucon</form:option>
					      <form:option value="Iquique">Iquique</form:option>
					    </form:select>
					    </div>
					  </div>
				    <input type="submit" class="btn btn-primary" value="Crear"/>
					</form:form>
			</div>
		</div>
	</body>
</html>



