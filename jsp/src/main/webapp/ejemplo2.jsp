<html>
<body>

	<h1>Scriptlets</h1>

	<h2>Esperado</h2>
	<ul>
		<li>item 01</li>
		<li>item 02</li>
		<li>item 03</li>
	</ul>
	
	<hr/>
	
	<h2>Resolución</h2>
	<ul>
		<%
			for (int i = 1; i < 4; i++)
				out.println("<li>item 0" + i + "</li>");
		%>
	</ul>
</body>
</html>
