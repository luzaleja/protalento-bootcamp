<!DOCTYPE html>
<%@page import="practicaAdicionalSemana16.entities.Imagenes"%>
<%@page import="java.util.List"%>
<html lang="es">
	<head>
		<jsp:include page="styles.jsp"></jsp:include>
	</head>
	<body>
		<main>
			<%
				List<Imagenes> listadoImagenes = (List<Imagenes>)request.getSession().getAttribute("listadoImagenes");
			%>
			<section class="container-fluid">
				<div class="row d-flex justify-content-center">
					<h1 class="text-center">Listado de Imagenes</h1>
					<div class="col-12">
						<form action="/app-web/EditarImagenURLServlet" method="POST">
							<h3>Elige la imagen a editar</h3>
							<select class="form-select" multiple aria-label="multiple select example" name="imagenSeleccionada">
								<%
									for(Imagenes imagen : listadoImagenes) {
								%>
									<option value="<%=imagen.getId()%>">Imagen <%=imagen.getId()%>, URL <%=imagen.getImagen()%></option>
							    <%
									}
							    %>
							</select>
							<br>
							<h3>Ingresa el nuevo URL de la imagen</h3>
							<div class="input-group mb-3">
								<span class="input-group-text" id="basic-addon3">https://example.com/imagen.jpg</span>
								<input type="text" name="urlNueva" class="form-control" id="basic-url" aria-describedby="basic-addon3">
							</div>
							<button type="submit" class="btn btn-primary">Guardar</button>
						</form>
					</div>
				</div>
			</section>
		</main>
		<jsp:include page="scripts.jsp"></jsp:include>
	</body>
</html>