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
	int[] xs = { 2, 5, 7 };
	public int cuadrado (int x) { return x * x; }
%>

	<h1>Declaraciones, expresiones y scriptlets</h1>

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
			<% for(int x : xs) { %>
			<tr>
				<td><%= x %></td>
				<td><%= cuadrado(x) %></td>
			</tr>
			<% } %>
		</tbody>
	</table>
	
</body>
</html>
