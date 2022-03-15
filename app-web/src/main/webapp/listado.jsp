<%@page import="ar.com.educacionit.domain.Articulos"%>
<%@page import="java.util.List"%>

<html>

	<head>
	
	</head>

	<body>
	
	<!--  quiero capturar el listado que envio el servlet bajo el nombre LISTADO -->
	
	<% //SCRIPTLET me permite escribir codigo java
		//dentro de la jsp tengo un objeto implicito llamado request
		//es implicito porque lo puedo usar sin instanciarlo
		
		//primero capturo el atributo
		Object listadoObject = request.getAttribute("LISTADO");
		
		//puedo castear
		List<Articulos> listado = (List<Articulos>)listadoObject;
	%>
	
	<%
		//ahora recorro el listado y dibujo el codigo en un parrafo html
		for(Articulos art : listado) {
	%>
	<!-- en el medio puedo poner html puro y usar el objeto art -->
		<p><%=art.getCodigo()%></p>
	
	<%
		}
	%>
	
	</body>
</html>