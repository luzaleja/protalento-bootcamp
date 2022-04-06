<%@page import="ar.com.educacionit.web.enums.ViewKeysEnum"%>
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
			<section class="container">
				<div class="row d-flex justify-content-center">
					<h1>Cargar Archivo</h1>
					<div class="col-6">
						<form action="<%=request.getContextPath()%>/controllers/UploadServlet" method="POST" enctype="multipart/form-data">
							<div class="mb-3">
							  <label for="formFile" class="form-label">Cargar Archivo de Productos(csv/xlsx)</label>
							  <input class="form-control" type="file" name="<%=ViewKeysEnum.UPLOAD_FILE.getParam()%>" id="formFile">
							</div>
							<button type="submit" class="btn btn-primary">Subir Archivo</button>
						</form>
					</div>
				</div>
			</section>
		</main>
		<jsp:include page="scripts.jsp"></jsp:include>
	</body>
</html>