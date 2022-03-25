<%@page import="java.util.Arrays"%>
<%@page import="java.util.List"%>
<html>
	<head>
		<meta charset="utf-8">
		<title>Error</title>
	</head>
	<body>
		<header>
			<h2>Error</h2>
		</header>
		<main>
			<%
				String camposVacios = (String)request.getAttribute("camposVacios");
			%>
			<%
				String[] camposVaciosArray = camposVacios.split(" ");
				int cantidadDeCampos = camposVaciosArray.length;
			%>
			<%
				List<String> campos = Arrays.asList("Nombre","Apellido","Documento","Edad","Ocupacion","Fecha de Nacimiento");
			%>
				<h6>El/los siguiente(s) campos se encuentran vacios:</h6>
			<%
				for(int i= 0;i<cantidadDeCampos;i++) {
					String campoStr = camposVaciosArray[i];
					int campo = Integer.parseInt(campoStr);
			%>
				<ul>
					<li><%=campos.get(campo)%>
				</ul>
			<%	
				}
			%>
		</main>
		<nav>
			<a href="practicaAdicionalSemana15/form.jsp">Volver al formulario</a>
		</nav>
	</body>
</html>