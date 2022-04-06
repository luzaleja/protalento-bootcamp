<%@page import="practicaAdicionalSemana16.entities.Carrousel"%>
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
			<section class="container-fluid">
				<div class="row d-flex justify-content-center">
					<h1 class="text-center">Paisajes Naturales</h1>
					<div class="col-6">
						<div id="carouselExampleIndicators" class="carousel slide" data-bs-ride="carousel">
						  <div class="carousel-indicators">
						    <button type="button" data-bs-target="#carouselExampleIndicators" data-bs-slide-to="0" class="active" aria-current="true" aria-label="Slide 1"></button>
						    <button type="button" data-bs-target="#carouselExampleIndicators" data-bs-slide-to="1" aria-label="Slide 2"></button>
						    <button type="button" data-bs-target="#carouselExampleIndicators" data-bs-slide-to="2" aria-label="Slide 3"></button>
						  </div>
						  <div class="carousel-inner">
						  	<%
						  		CarrouselService cs = new CarrouselServiceImpl();
						  	%>
						  	<%
						  		Collection<Carrousel> carrousel = cs.getActiveCarrousel();
						  	%>
						  	<%
						  		Carrousel imagen1 = carrousel.iterator().next();
						  	%>
							    <div class="carousel-item active">
							      <img src="<%=imagen1.getImagen()%>" class="d-block w-100" alt="<%=imagen1.getDescripcion()%>">
							    </div>
							<%
								for(Carrousel imagen : carrousel) {
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
			</section>
		</main>
		<jsp:include page="scripts.jsp"></jsp:include>
	</body>
</html>