<!DOCTYPE html>
<html lang="es">
	<head>
		<title>Registro</title>
		<jsp:include page="styles.jsp"/>
	</head>
	<body>
		<main>
			<section class="container">
				<div class="row">
					<h3>Registro</h3>
					<div class="col-xs-12 col-md-6 col-lg-4">
						<form class="row g-3 needs-validation" novalidate>
						    <div class="mb-3">
							    <label for="nombre" class="form-label">Nombre completo</label>
						        <input type="text" 
						        	class="form-control" 
						        	id="nombre"
						        	aria-describedby=""
						        	pattern="^[A-Za-z]+(?: +[A-Za-z]+)*$"
						        	required>
						        <div class="invalid-feedback">
							        Nombre invalido. Asegurese de no incluir numeros ni espacios al principio ni al final.
							    </div>
						    </div>
						    <div class="mb-3">
							   	<label for="email" class="form-label">Email address</label>
							  	<input type="email" 
							  		class="form-control" 
							  		id="email" 
							  		aria-describedby=""
							  		pattern="^\w+([\.-]?\w+)*@\w+([\.-]?\w+)*(\.\w{2,3})+$"
							  		required>
							   	<div class="invalid-feedback">
							        Email invalido.
							    </div>
							</div>
							<div class="mb-3">
								<label for="pais" class="form-label">Pais</label>
								<select class="form-select" 
									id="pais" 
									aria-label="Default select example"
									required>
									<option value="">Open this select menu</option>
									<option value="colombia">Colombia</option>
									<option value="peru">Peru</option>
									<option value="chile">Chile</option>
									<option value="argentina">Argentina</option>
							 	</select>
							 	<div class="invalid-feedback">
							        Seleccione una opcion.
							    </div>
							</div>	
							<div class="mb-3" id="estadoCivil">
								  <div class="form-check">
								    <input type="radio" class="form-check-input" id="estadoCivilCasado" name="radio-stacked" required>
								    <label class="form-check-label" for="estadoCivilCasado">Casado</label>
								  </div>
								  <div class="form-check mb-3">
								    <input type="radio" class="form-check-input" id="estadoCivilSoltero" name="radio-stacked" required>
								    <label class="form-check-label" for="estadoCivilSoltero">Soltero</label>
								    <div class="invalid-feedback">Escoja una opcion.</div>
								  </div>
							</div>
							<div class="mb-3 form-check">
								<input type="checkbox" class="form-check-input" id="terminos" required>
								<label class="form-check-label" for="terminos">Acepto los términos y condiciones</label>
								<div class="invalid-feedback">
							        Seleccione una opcion.
							    </div>
							</div>
						    <div class="col-12">
								<button type="submit" onclick="isValid()" class="btn btn-primary">Registrarse</button>
							</div>
						</form>
					</div>
				</div>
			</section>
			<!-- Modal -->
			<div class="modal fade" id="modalValidar" tabindex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">
			  <div class="modal-dialog">
			    <div class="modal-content">
			      <div class="modal-header">
			        <h5 class="modal-title" id="exampleModalLabel">Registro exitoso</h5>
			        <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
			      </div>
			      <div class="modal-body">
			        Sus datos han sido guardados.
			      </div>
			      <div class="modal-footer">
				        <button type="button" class="btn btn-secondary" data-bs-dismiss="modal">Cerrar</button>
			      </div>
			    </div>
			  </div>
			</div>
		</main>
	</body>
	<jsp:include page="scripts.jsp"/>
	<script type="text/javascript" src="<%=request.getContextPath()%>/js/validador.js"></script>
</html>