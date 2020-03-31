<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
  <meta charset="ISO-8859-1">
  <title>Esta es la Fecha</title>
  <link rel="stylesheet" type="text/css" href="./css/style.css">
  
  <!-- <link href="https://cdn.jsdelivr.net/npm/alertifyjs@1.11.0/build/css/alertify.min.css" rel="stylesheet"/>
  <script src="https://cdn.jsdelivr.net/npm/alertifyjs@1.11.0/build/alertify.min.js"></script>
   -->
</head>
<body>
	<h1 id="date"><c:out value="${date}"/></h1>
	<a href="/">Go back</a>
</body>
<footer>
  <script type="text/javascript">
    alert("Localhost:8080 says: This is the date template");
  </script>
</footer>
</html>