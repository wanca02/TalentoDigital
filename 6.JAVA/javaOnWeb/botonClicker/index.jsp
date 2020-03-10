<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.4.1/jquery.min.js"></script>
<title>Insert title here</title>
</head>
<body>
	<%
	int btn = (int) session.getAttribute("btn");
	%>
	<!--  -->
	<form action="Counter">
		<button type="submit" name="btn" value="ok">Click Here</button>
	</form>
	
	 <!-- <button type="submit" name="btn" value="ok">Click Here</button> -->
	
	<h2>You have clicked this button <%= btn %> times</h2>
	<!-- <label id="result"></label> -->
</body>
<footer>
	<!-- <script>
	$(document).ready(function() {
		$('button').click(function(event) {
			//alert("hola");
	        $.get('Counter', {
	           btn : "ok"
	        }, function(responseText) {
	                //$('#ajaxGetUserServletResponse').text(responseText);
	        	$("#result").text(responseText);
	        	console.log(responseText)
	        });
		});
	});
	</script>  -->
</footer>
</html>