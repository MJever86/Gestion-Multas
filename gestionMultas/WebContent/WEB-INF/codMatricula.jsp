<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="ISO-8859-1"%>
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>Matriculas de vehiculos sancionados</title>
	</head>
	<body>
		<h1>Matriculas sancionadas</h1>
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
			
				<c:forEach var="multa" items="${nummatricula}">
				<tr align="center">
					<td>${multa.codigo}</td>
					<td>${multa.agente}</td> 
					<td>${multa.fecha}</td>
					<td>${multa.motivo}</td>
					<td>${multa.matricula}</td>
					<td>${multa.importe}</td>
					<td>${multa.observacion}</td>
				</tr>
				</c:forEach>

		</table>
		
	</body>
	
</html>