<%@page import="practicaAdicionalSemana16.entities.Imagenes"%>
<%@page import="java.util.Collection"%>
<%@page import="practicaAdicionalSemana16.service.impl.CarrouselServiceImpl"%>
<%@page import="practicaAdicionalSemana16.service.CarrouselService"%>
<!-- HTML5 -->
<!DOCTYPE html>
<html lang="es">
	<head>
		<jsp:include page="styles.jsp"></jsp:include>
	</head>
	<body>
		<main>
			<%
					Collection<Imagenes> carrousel = (Collection<Imagenes>)request.getAttribute("imagenes");
			%>
			<%
					if(carrousel == null) {
			%>
				<jsp:forward page="/CarrouselServlet"></jsp:forward>
			<%
					} else if (carrousel != null) {
			%>
			<section class="container">
				<div class="row d-flex justify-content-center">
					<h1 class="text-center">Paisajes Naturales</h1>
					<div class="col-12">
						<div id="carouselExampleIndicators" class="carousel slide" data-bs-ride="carousel">
						  <div class="carousel-indicators">
						    <button type="button" data-bs-target="#carouselExampleIndicators" data-bs-slide-to="0" class="active" aria-current="true" aria-label="Slide 1"></button>
						    <button type="button" data-bs-target="#carouselExampleIndicators" data-bs-slide-to="1" aria-label="Slide 2"></button>
						    <button type="button" data-bs-target="#carouselExampleIndicators" data-bs-slide-to="2" aria-label="Slide 3"></button>
						  </div>
						  <div class="carousel-inner">
						  	<%
						  		Imagenes imagen1 = carrousel.iterator().next();
						  	%>
							    <div class="carousel-item active">
							      <img src="<%=imagen1.getImagen()%>" class="d-block w-100" alt="<%=imagen1.getDescripcion()%>">
							    </div>
							<%
								for(Imagenes imagen : carrousel) {
							%>
						    	<%
						    		if(imagen.getId() != imagen1.getId()) {
						    	%>
						    		<div class="carousel-item">
      									<img src="<%=imagen.getImagen()%>" class="d-block w-100" alt="<%=imagen.getDescripcion()%>">
    								</div>
    							<%
						    		}
    							%>
    						<%
								}
    						%>		
						  </div>
						  <button class="carousel-control-prev" type="button" data-bs-target="#carouselExampleIndicators" data-bs-slide="prev">
						    <span class="carousel-control-prev-icon" aria-hidden="true"></span>
						    <span class="visually-hidden">Previous</span>
						  </button>
						  <button class="carousel-control-next" type="button" data-bs-target="#carouselExampleIndicators" data-bs-slide="next">
						    <span class="carousel-control-next-icon" aria-hidden="true"></span>
						    <span class="visually-hidden">Next</span>
						  </button>
						</div>
					</div>
				</div>
				<div class="row d-flex justify-content-end">
					<div class="col-xs-12 col-md-6 col-lg-4">
						<a class="btn btn-primary" href="<%=request.getContextPath()%>/ListadoImagenesServlet" role="button">Listado de imagenes</a>
					</div>
				</div>
			</section>
			<%
				}
			%>
		</main>
		<jsp:include page="scripts.jsp"></jsp:include>
	</body>
</html>