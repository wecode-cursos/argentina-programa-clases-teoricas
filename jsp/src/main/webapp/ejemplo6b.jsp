<%@page import="service.CuadradoService"%>

<html>
<body>


	<h1>Formularios</h1>
	
	<% 
		String nombre = request.getParameter("nombre");
		String tipo = request.getParameter("tipo");
	%>
	
	<% if (nombre != null && nombre != "") { %>
		<h2>
		Hola, <%= nombre %>
		<% if (tipo.equals("efusivo")) { %>
			!!!!!!!!
		<% } %>
		</h2>
	<% } else { %>
		No hay nada que hacer aquí...
	<% } %>
	
	<a href="ejemplo6.jsp">Volver</a>

</body>
</html>