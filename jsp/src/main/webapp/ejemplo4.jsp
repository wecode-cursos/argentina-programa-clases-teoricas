<%@page import="service.CuadradoService"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<html>
<head>
<style type="text/css">
td {
	background-color: lightgray;
}
</style>
</head>
<body>
<jsp:useBean id="cuadrado" class="service.CuadradoService"/>
<jsp:useBean id="par" class="service.ParService"/>  

	<%!
		int[] xs = { 2, 5, 7 };
	%>
	<%
		pageContext.setAttribute("xs", xs);
	%>

	<h1>JSTL: core</h1>

	<h2>Esperado</h2>
	<table>
		<thead>
			<tr>
				<th>Valor</th>
				<th>Cuadrado</th>
				<th>¿Es par?</th>
			</tr>
		</thead>
		<tbody>
			<tr>
				<td>2</td>
				<td>4</td>
				<td>Si</td>
			</tr>
			<tr>
				<td>5</td>
				<td>25</td>
				<td>No</td>
			</tr>
			<tr>
				<td>7</td>
				<td>49</td>
				<td>No</td>
			</tr>
		</tbody>
	</table>

	<hr />

	<h2>Resolución</h2>

	<table>
		<thead>
			<tr>
				<th>Valor</th>
				<th>Cuadrado</th>
				<th>¿Es par?</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach items="${xs}" var="x">
				<tr>
					<td>
						<c:out value="${x}"></c:out>
					</td>
					<td>
						<c:out value="${cuadrado.calcularPara(x)}"/>
					</td>
					<td>
						<c:choose>
						  <c:when test="${x % 2 == 0}">
						    Si
						  </c:when>
						  <c:otherwise>
						    No
						  </c:otherwise>
						</c:choose>
					</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>

</body>
</html>