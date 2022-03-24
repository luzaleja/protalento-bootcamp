<%@page import="ar.com.educacionit.domain.Users"%>
<%
	//objetos implicitos que tiene la jsp
	Users user = (Users)session.getAttribute("usuario");
%>

<html>

	<head>
	
	</head>
	
	<body>
		<main>
			<h1>Username: <%=user.getUsername()%></h1>
			<h2>Nombre: <%=user.getSocio().getNombre()%></h2>
			<h2>Apellido: <%=user.getSocio().getApellido()%></h2>
			
			<a href="<%=request.getContextPath()%>/BuscarProductosServlet">Ver Listado</a>
		</main>
	</body>
</html>