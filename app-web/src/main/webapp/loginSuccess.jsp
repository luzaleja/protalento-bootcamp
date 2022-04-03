<%@page import="ar.com.educacionit.web.enums.ViewKeysEnum"%>
<%@page import="ar.com.educacionit.domain.Users"%>
<%
	//objetos implicitos que tiene la jsp
	Users user = (Users)session.getAttribute(ViewKeysEnum.USER.getParam());
%>

<!-- HTML5 -->
<!DOCTYPE html>
<html lang="es">
	<head>
		<jsp:include page="styles.jsp"></jsp:include>
	</head>
	
	<body>
		<jsp:include page="navbar.jsp"></jsp:include>
		<main>
			<jsp:include page="mensajeria.jsp"></jsp:include>
			<section class="container-fluid">
				<div class="row d-flex justify-content-center">
					<div class="col-6">
						<h1>Username: <%=user.getUsername()%> </h1>
						<h2>Nombre: <%=user.getSocio().getNombre()%> </h2>
						<h3>Apellido: <%=user.getSocio().getApellido()%> </h3>
						
						<a href="<%=request.getContextPath()%>/BuscarProductosServlet">Ver Listado</a>
					</div>
				</div>
			</section>
		</main>
		<jsp:include page="scripts.jsp"></jsp:include>
	</body>
</html>