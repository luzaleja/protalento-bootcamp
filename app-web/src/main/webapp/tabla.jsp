<!-- listar las imagenes qe se utilizaron para el carrousel -->
<!-- y poder editar las url -->
<!-- guardar los cambios y verificar que se visualicen en el carrousel -->
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
						<table class="table">
							<thead>
								<tr>
									<th scope="col">#</th>
							    	<th scope="col">Descripcion</th>
							     	<th scope="col">Imagen</th>
							     	<th scope="col">Activo</th>
								</tr>
							</thead>
							<tbody>
								<%
									for(Imagenes imagen : listadoImagenes) {
								%>
							    <tr>
							      	<th scope="row"><%=imagen.getId()%></th>
							      	<td><%=imagen.getDescripcion()%></td>
							     	<td><%=imagen.getImagen()%></td>
							     	<td><%=imagen.getActivo()%></td>
							    </tr>
							    <%
									}
							    %>
							</tbody>
						</table>
					</div>
				</div>
				<div class="row">
					<div class="col-12">
						<a class="btn btn-primary" href="<%=request.getContextPath()%>/editar.jsp" role="button">Editar</a>
					</div>
				</div>
			</section>
		</main>
		<jsp:include page="scripts.jsp"></jsp:include>
	</body>
</html>