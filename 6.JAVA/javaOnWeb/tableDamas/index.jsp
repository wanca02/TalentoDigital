<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Insert title here</title>
	<link href="./resources/css/style.css" rel="stylesheet" type="text/css">
</head>
<body>
	<!-- Obtenemos el valor del parámetro name -->
    <% 
    int fil = Integer.parseInt(request.getParameter("fil")); 
    int col = Integer.parseInt(request.getParameter("col"));
    
    
    %>
    <!-- Mostramos el valor que obtuvimos -->
    <table>
    	<% for(int i=0;i<fil;i++) {%>
    	<tr>
    		<% for(int j=0;j<col;j++) { 
    			if(i==j || (i-j)%2==0) {%>
    				<td class="purple"></td>
    			<% } else{%>
    				<td class="blue"></td>
    			<% } %>		
    		<% } %>	
    	</tr>
    	<% } %>
    </table>
</body>
</html>