<%@page import="ar.com.educacionit.domain.Users"%>
<%@page import="ar.com.educacionit.web.enums.ViewKeysEnum"%>
<%
	Users user = (Users)session.getAttribute(ViewKeysEnum.USER.getParam());
%>

<header>	
	<nav class="navbar navbar-expand-lg navbar-light bg-light">
	  <div class="container-fluid">
	    <a class="navbar-brand" href="<%=request.getContextPath()%>/">Home</a>
	    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
	      <span class="navbar-toggler-icon"></span>
	    </button>
	    	<div class="collapse navbar-collapse" id="navbarSupportedContent">
		      <ul class="navbar-nav me-auto mb-2 mb-lg-0">
			  	<% 
	    			if(user != null) {
	    		%>
			        <li class="nav-item">
			          <a class="nav-link" href="<%=request.getContextPath()%>/upload.jsp">Cargar Archivo</a>
			        </li>
			        <li class="nav-item">
			          <a class="nav-link" href="<%=request.getContextPath()%>/controllers/NuevoProductoServlet">Nuevo Producto</a>
			        </li>
			        <li>
			          <a class="btn btn-primary" 
							role="button"
							onclick="obtenerDatos()">
							Abrir Modal
					  </a>
					</li>
			    <%
	    			}
			    %>
			    <li class="nav-item">
			    	<a class="nav-link" href="#">Nosotros</a>
			  	</li>
		      </ul>
		      	<%
		          	if(user != null) {
		      	%>
			      <form class="d-flex" action="<%=request.getContextPath()%>/controllers/BuscarProductosServlet">
			        <input class="form-control me-2"
			        	name="<%=ViewKeysEnum.CLAVE_BUSQUEDA.getParam()%>" 
			        	type="search" 
			        	placeholder="Search" 
			        	aria-label="Search">
			        <button class="btn btn-outline-success" type="submit">Search</button>
			      </form>
			      <a class="btn btn-primary" href="<%=request.getContextPath()%>/LogoutServlet" role="button">Logout</a>
		    	<%
	    			}
				%>
		    </div>
	  </div>
	</nav>
</header>
<script src="https://unpkg.com/axios/dist/axios.min.js"></script>
<script type="text/javascript">
	async function obtenerDatos() {
		//Para abrir el modal despues
		const options = {
			keyboard: false
		};
		
		let listadoJson = await axios.get('/controllers/ListadoServlet');
	
		listadoJson = listadoJson.data;
		
		const marcas = listadoJson.marcas;
		llenarTablas()
		
		const categorias = listadoJson.categorias;
		
		//presentamos el modal con la informacion
		const myModal = new bootstrap.Modal(document.getElementById('modalAbrirTablas'), options)
		myModal.show();
	}
	
	function llenarTablas() {
		const table = document.getElementById('marcas');
		
		for(const linea of marcas) {
			const fila = document.createElement('')
		}
	}
</script>
<!-- Modal -->
<div class="modal fade" id="modalAbrirTablas" tabindex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">
  <div class="modal-dialog">
  	<form id="abrirModalForm">
	    <div class="modal-content">
	      <div class="modal-header">
	        <h5 class="modal-title" id="exampleModalLabel">Marcas y Categorias</h5>
	        <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
	      </div>
	      <!-- Las tablas -->
	      <div class="modal-body">
	      	<table class="table" id="marcas">
			</table>
			<table class="table" id="categorias">
			</table>
	      </div>
	      <!-- los botones -->
	      <div class="modal-footer">
	        <button type="button" class="btn btn-secondary" data-bs-dismiss="modal">Close</button>
	        <button type="button" class="btn btn-primary">Save changes</button>
	      </div>
	    </div>
	</form>
  </div>
</div>