<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Lista de Telefonos</title>
<link rel="stylesheet" href="/TeneGuaman-Adrian-Examen/Estilos/EstiloTabla.css" />
</head>

<body>
	<h1>Lista Comida</h1>


	<table border="1" width="100%">
		<tr>
			<td>Nombre</td>
			<td>Precio</td>
			<td>Seleccionar</td>
		</tr>
<c:forEach var="comida" items="${lista}">
			<tr>
				<td><c:out value="${comida.nombre}" /></td>
				<td><c:out value="${comida.precio}" /></td>
				<td><input type="radio" name="transporte2" value="1">selecciona</td>
			</tr>
					</c:forEach>
	</table>
	<br>'

	<table border="0" align="center">
		<tr>
			<td><a href='/TeneGuaman-Adrian-Examen/Privada/Telefono.jsp'>RealizarPedido</a></td>
		</tr>
	</table>
	<table border="0" align="center">
		<tr>
			<td><a href='/TeneGuaman-Adrian-Examen/Privada/Privada.html'>Volver al
					Inicio</a></td>
		</tr>
	</table>


</body>
</html>