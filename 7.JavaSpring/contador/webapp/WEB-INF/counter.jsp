<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Current visit count</title>
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
</head>
<body>
  <p>You have visited <a href="/">http://localhost/</a> <c:out value="${ count }"/> times</p>
  <p>Here <a href="/mas2">http://localhost/otra_pagina</a></p>
  
  <!--<form name="formdef" action="/counter" method="post">
    <input name="bool" type="text" value="ok" hidden=true />
    <a href="javascript:$('form').submit()">Test another visit</a>
  </form>-->
</body>
</html>