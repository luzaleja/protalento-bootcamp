<!DOCTYPE html>
<html lang="es">
	<head>
		<jsp:include page="styles.jsp"/>
	</head>
	<body>
		<main>
			<section class="container">
				<div class="row">
					<h3>Registro</h3>
					<div class="col 12">
						<form onsubmit="return validarFormulario()" class="form" id="form" novalidate>
						    <div class="control">
							    <label for="nombre" class="form-label">Nombre completo</label>
						        <input type="text" class="form-control" id="nombre" aria-describedby="basic-addon3">
						  		<div class="nombreFeedback"><small>Campo Inválido</small></div>
						    </div>
							<button type="button" class="btn btn-primary" id="myButton">Submit</button>
						</form>
					</div>
				</div>
			</section>
		</main>
	</body>
	<jsp:include page="scripts.jsp"/>
	<script type="text/javascript" src="<%=request.getContextPath()%>/js/val.js"></script>
</html>