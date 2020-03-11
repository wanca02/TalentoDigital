<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<%@page import="com.pets.web.models.Animal"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<% Animal a=(Animal)request.getAttribute("dog");
	String v="";
	%>  
	<h1>Your created a <%=a.getBreed() %></h1>
	<%if(a.getWeight()<30){ 
		v="hopped into your lap and cuddle you!";
	}else{
		v="curl up next to him!";
	}%>
	<h3>David <%=v %></h3>
</body>
</html>