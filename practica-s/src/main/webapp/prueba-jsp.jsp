<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Prueba JSP</title>
</head>
<body>
	HOLA JSP
	<%for(int i =0; i<10; i++){%>
	
		Index del contador : <%=i %> <br/>
		
	<% } %>
	<%List<String> cabecera = new ArrayList<String>();
	cabecera.add("nombre");
	cabecera.add("apellido");
	cabecera.add("fecha de nacimiento");
	
	%>
	<table>
		<thead>
			<tr>
				<%for(String s : cabecera){ %>
				<td>
				<%=s %>
				</td>
				<%} %>
			</tr>
		</thead>
		<tbody>
			<tr>
				<td>
				
				</td>
			</tr>
		</tbody>
	</table>

</body>
</html>