<html>
<head>
<style type="text/css">
td {
	background-color: lightgray;
}
</style>
</head>
<body>
<%!
	public int cuadrado (int x) { return x * x; }
%>

	<h1>Declaraciones (y expresiones)</h1>

	<h2>Esperado</h2>
	<table>
		<thead>
			<tr>
				<th>Valor</th>
				<th>Cuadrado</th>
			</tr>
		</thead>
		<tbody>
			<tr>
				<td>2</td>
				<td>4</td>
			</tr>
			<tr>
				<td>5</td>
				<td>25</td>
			</tr>
			<tr>
				<td>7</td>
				<td>49</td>
			</tr>
		</tbody>
	</table>
	
	<hr/>
	
	<h2>Resolución</h2>

	<table>
		<thead>
			<tr>
				<th>Valor</th>
				<th>Cuadrado</th>
			</tr>
		</thead>
		<tbody>
			<tr>
				<td>2</td>
				<td><%= cuadrado(2) %></td>
			</tr>
			<tr>
				<td>5</td>
				<td><%= cuadrado(5) %></td>
			</tr>
			<tr>
				<td>7</td>
				<td><%= cuadrado(7) %></td>
			</tr>
		</tbody>
	</table>
	
</body>
</html>
