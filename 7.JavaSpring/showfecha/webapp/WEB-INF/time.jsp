<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
  <meta charset="ISO-8859-1">
  <title>Esta eh la Time</title>
  <link rel="stylesheet" type="text/css" href="./css/style.css">
</head>
<body>
	<h1 id="time"><c:out value="${time}"></c:out></h1>
	<a href="/">Go back</a>
</body>
<footer>
  <script type="text/javascript">
    alert("Localhost:8080 says: This is the time template");
  </script>
</footer>
</html>