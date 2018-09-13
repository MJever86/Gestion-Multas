<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Listado de Multas del Ayuntamiento de Almería</title>
	</head>
	<body>
		<h1>Lista de Multas del Ayuntamiento de Almería</h1>
		<table>
			<tr align="center" style="background-color: black; color:white">
				<th>Codigo</th>
				<th>Agente</th>
				<th>Fecha/Hora</th>
				<th>Motivo</th>
				<th>Matricula</th>
				<th>Importe</th>
				<th>Observaciones</th>
			</tr>
			
				<c:forEach var="multas" items="${lista}">
				<tr>
					<td>${multas.codigo}</td>
					<td>${multas.agente}</td> 
					<td><fmt:formatDate pattern="dd-MM-yyyy" value= "${multas.fecha}"/> </td>
					<td>${multas.motivo}</td>
					<td>${multas.matricula}</td>
					<td>${multas.importe}</td>
					<td>${multas.observacion}</td>
					
				</tr>
				</c:forEach>

		</table>
		
	</body>
	
</html>