<%@page import="java.text.SimpleDateFormat"%>
<%@page import="practicaAdicionalSemana15.repository.MapaRepository"%>
<%@page import="java.util.Collection"%>
<%@page import="practicaAdicionalSemana15.entidades.Formulario"%>
<%@page import="java.util.Map"%>
<html>
	<head>
		<meta charset="utf-8">
		<title>Mapa</title>
	</head>
	<body>
		<header>
			<h2>Listado de registros</h2>
		</header>
		<main>
			<table border="1">
				<tr>
					<td>
						<b>Nombre</b>
					</td>
					<td>
						<b>Apellido</b>
					</td>
					<td>
						<b>Documento</b>
					</td>
					<td>
						<b>Edad</b>
					</td>
					<td>
						<b>Ocupacion</b>
					</td>
					<td>
						<b>Fecha de Nacimiento</b>
					</td>
				</tr>
				<%
					Map<Long,Formulario> listado = MapaRepository.getMapa();

					Collection<Formulario> formularios = listado.values();
				%>
				<%
					for(Formulario form:formularios) {
				%>
				<tr>
					<td>
						<%=form.getNombre()%>
					</td>
					<td>
						<%=form.getApellido()%>
					</td>
					<td>
						<%=form.getDocumento()%>
					</td>
					<td>
						<%=form.getEdad()%>
					</td>
					<td>
						<%=form.getOcupacion()%>
					</td>
					<td>
						<%
							SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
							String fechaStr = formato.format(form.getFechaNacimiento());
						%>
						<%=fechaStr%>
					</td>
				</tr>
				<%
					}
				%>
			</table>
		</main>
	</body>
</html>