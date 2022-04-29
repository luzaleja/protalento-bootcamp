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
						<form class="form" id="form" novalidate>
						    <div class="mb-3">
							    <label for="nombre" class="form-label">Nombre completo</label>
						        <input type="text" class="form-control" id="nombre" aria-describedby="basic-addon3">
						  		<small>Campo Inválido</small>
						    </div>
						    <div class="mb-3">
						    	<label for="email" class="form-label">Email address</label>
						   		<input type="email" class="form-control" id="email" aria-describedby="emailHelp">
						    	<small>Campo Inválido</small>
						    </div>
						    <div class="mb-3">
								<label for="pais" class="form-label">Pais</label>
								<select class="form-select" id="pais" aria-label="Default select example">
									<option selected>Elija un pais</option>
									<option value="colombia">Colombia</option>
									<option value="peru">Peru</option>
									<option value="chile">Chile</option>
									<option value="argentina">Argentina</option>
							 	</select>
							 	<small>Campo Inválido</small>
							</div>	
							<div class="mb-3" id="estadoCivil">
								<div class="form-check form-check-inline">
									<input class="form-check-input" type="radio" name="estadoCivil" id="soltero" value="soltero">
									<label class="form-check-label" for="soltero">Soltero</label>
								</div>
								<div class="form-check form-check-inline">
									<input class="form-check-input" type="radio" name="estadoCivil" id="casado" value="casado">
									<label class="form-check-label" for="casado">Casado</label>
								</div>
								<small>Campo Inválido</small>
							</div>
							<div class="mb-3 form-check">
								<input type="checkbox" class="form-check-input" id="terminos">
								<label class="form-check-label" for="terminos">Acepto los términos y condiciones</label>
								<small>Campo Inválido</small>
							</div>
							<button type="submit" class="btn btn-primary" onclick="validarFormulario()" id="myButton">Registrarse</button>
						</form>
					</div>
				</div>
			</section>
		</main>
	</body>
	<jsp:include page="scripts.jsp"/>
	<script type="text/javascript" src="<%=request.getContextPath()%>/js/validador.js"></script>
</html>