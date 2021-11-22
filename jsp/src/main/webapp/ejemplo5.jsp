<%@page import="service.CuadradoService"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>

<c:set var="data" value="Rojo Verde Azul" />

<html>
<body>


	<h1>JSTL: functions</h1>

	<h2>Esperado</h2>

	<p>"Rojo Verde Azul" resulta en...</p>

	<ul>
		<li>Rojo</li>
		<li>Verde</li>
		<li>Azul</li>
	</ul>

	<hr />

	<h2>Resolución</h2>

	<c:set var="colores" value="${fn:split(data, ' ')}" />
	<ul>
		<c:forEach items="${colores}" var="color">
			<li><c:out value="${color}"></c:out></li>
		</c:forEach>
	</ul>
	
	<h2>Resolución 2, juntando con comas</h2>
	
	<c:set var="colores2" value="${fn:join(colores, ', ')}" />
	<p><c:out value="${colores2}"></c:out></p>

</body>
</html>