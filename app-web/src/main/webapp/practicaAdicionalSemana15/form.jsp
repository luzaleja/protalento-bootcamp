<%@page import="java.util.ArrayList"%>
<%@page import="java.util.Collection"%>
<html>

	<head>
		<meta charset="utf-8">
		<title>Formulario</title>
	</head>
	<body>
		<header>
			<h2>Formulario</h2>
		</header>
		<main>
			<section>
				<form action="/app-web/FormularioServlet" method="POST"> 
					<label>Nombre *</label>
					<br>
					<input type="text" name="nombre">
					<br>
					<label>Apellido *</label>
					<br>
					<input type="text" name="apellido">
					<br>
					<label>Documento *</label>
					<br>
					<input type="number" name="documento">
					<br>
					<label>Edad *</label>
					<br>
					<input type="number" name="edad">
					<br>
					<label>Ocupacion *</label>
					<br>
					<%
						Collection<String> ocupaciones = new ArrayList<>();
						ocupaciones.add("Ingeniero de Sistemas");
						ocupaciones.add("Economista");
						ocupaciones.add("Ingeniero Industrial");
						ocupaciones.add("Abogado");
						ocupaciones.add("Médico");
					%>
					<select name="ocupacion">
						<%
							for(String ocupacion:ocupaciones) {
						%>
						<option value="<%=ocupacion%>"><%=ocupacion%></option>
						<%
							}
						%>
					</select>
					<br>
					<label>Fecha de Nacimiento *</label>
					<br>
					<input type="date" name="fechaNacimiento">
					<br>
					<button>Enviar</button>
				</form>
			</section>	
		</main>
		<nav>
			<ul>
				<li><a href="listadoForms.jsp">Ver todos los formularios</a></li>
			</ul>
		</nav>
	</body>
</html>