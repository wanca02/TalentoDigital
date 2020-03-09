<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@page import="com.pets.web.models.Animal"%>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Cat</title>
</head>
<body>
	<%Animal a=(Animal)request.getAttribute("cat");%>  
	<h1>Your <%=a.getBreed() %> cat looked at you with some affection. you think</h1>
</body>
</html>