<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Insert title here</title>
	<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css" integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh" crossorigin="anonymous">

</head>
<body>

	<div class="container">
		<div class="row  justify-content-center">
			<div class="col-7">
				<h2>You have generated a word 
				<%if(session.getAttribute("ok")!=null){  out.println(session.getAttribute("ok"));  }%>
				 times</h2>
			</div>
		</div>
		<div class="row  justify-content-center">
			<div class="col-5">
				<div class="input-group mb-3">
					<%if(session.getAttribute("html")!=null){  out.println(session.getAttribute("html"));  }%>
				</div>
				<form action="Random" method="post" class="form-inline justify-content-center">
					<input type="hidden" name="action" value="ok" />
					<button class="btn btn-info" type="submit">Generate</button>
				</form>
			</div>
		</div>
		<div class="row justify-content-center">
			<div class="col-7">
				<h4>The last time you generated a word was:</h4>
			</div>
		</div>
		<div class="row  justify-content-center">
			<div class="col-5">
				<%if(session.getAttribute("date")!=null){  out.println(session.getAttribute("date"));  }%>
			</div>
		</div>
	</div>
	
	
	
</body>
<footer>
</footer>
</html>




