<html>
	<head>
		<title>Clase36 - Inicio java web</title>
	</head>
	<body>
		<h1>Clase36</h1>
		
		<!-- creo un formulario , puedo cambiar el method a POST o GET-->
		<form action="<%=request.getContextPath()%>/ListadoServlet"
		method="POST">
			<!-- con un boton adentro -->
			<input type="submit" value="Pedir Listado"/>
		</form>

		<form action="<%=request.getContextPath()%>/ListadoServlet"
		method="GET">
			<!-- con un boton adentro -->
			<input type="submit" value="Pedir Listado"/>
		</form>
		<img 
			height="25%"
			width="25%"
			alt="Mila"
			src="<%=request.getContextPath()%>/img/Mila.jpg"
		/>
	</body>
</html>
