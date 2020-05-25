<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="/languages/${lang.id}" method="post">
    <input type="hidden" name="_method" value="DELETE">
    <input type="submit" class="btn btn-danger" value="Delete">
	</form>
</body>
</html>