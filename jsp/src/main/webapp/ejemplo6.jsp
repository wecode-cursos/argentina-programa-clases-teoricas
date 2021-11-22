<%@page import="service.CuadradoService"%>

<html>
<body>


	<h1>Formularios</h1>

	<form action="ejemplo6b.jsp" method="get">
		Nombre: <input name="nombre"/>
		
		<br>
		
		Tipo de saludo:
		<select name="tipo">
			<option value="normal">Normal</option>
			<option value="efusivo">Efusivo</option>
		</select>
		
		<br>
		
		<button type="submit">Saludar</button>	
	</form>

</body>
</html>