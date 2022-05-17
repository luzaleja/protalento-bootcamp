<header>	
	<nav class="navbar navbar-expand-lg navbar-light bg-light">
	  <div class="container-fluid">
	    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent" aria-controls="navbarSupportedContent" aria-expanded="false" aria-label="Toggle navigation">
	      <span class="navbar-toggler-icon"></span>
	    </button>
	    	<div class="collapse navbar-collapse" id="navbarSupportedContent">
		      <ul class="navbar-nav me-auto mb-2 mb-lg-0">
		        <li class="nav-item">
		            <a class="btn btn-primary" 
						role="button"
						onclick="obtenerDatos()">
						Abrir Modal
				    </a>
				</li>
		      </ul>
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
		
		let listadoJson = await axios.get(`<%=request.getContextPath()%>/ListadoServlet`);
	
		listadoJson = listadoJson.data;
		
		const marcas = listadoJson.marcas;
		const tablaMarcas = document.getElementById('marcas');
		
		hacerTitulos(tablaMarcas);
		llenarTabla(marcas,tablaMarcas);
		
		const categorias = listadoJson.categorias;
		const tablaCat = document.getElementById('categorias');
		
		hacerTitulos(tablaCat);
		llenarTabla(categorias,tablaCat);
		
		//presentamos el modal con la informacion
		const myModal = new bootstrap.Modal(document.getElementById('modalAbrirTablas'), options)
		myModal.show();
	}
	
	function hacerTitulos(tablaSeleccionada) {
		
		const currentList = tablaSeleccionada.getElementsByTagName('thead');
		if(currentList.length === 0) {
			
			let thead = document.createElement('thead');
			let tr = document.createElement('tr');
			let th1 = document.createElement('th');
			let id = document.createTextNode('ID');
			th1.appendChild(id);
			tr.appendChild(th1);
			
			let th2 = document.createElement('th');
			let des = document.createTextNode('DESCRIPCION');
			th2.appendChild(des);
			tr.appendChild(th2);
			
			let th3 = document.createElement('th');
			let cod = document.createTextNode('CODIGO');
			th3.appendChild(cod);
			tr.appendChild(th3);
			
			let th4 = document.createElement('th');
			let hab = document.createTextNode('HABILITADA');
			th4.appendChild(hab);
			tr.appendChild(th4);
			
			let th5 = document.createElement('th');
			let op = document.createTextNode('OPCIONES');
			th5.appendChild(op);
			tr.appendChild(th5);
			
			thead.appendChild(tr);
			
			tablaSeleccionada.appendChild(thead);
		}
		
	}
	
	function llenarTabla(lista,tablaSeleccionada) {

		const currentList = tablaSeleccionada.getElementsByTagName('tbody');
		if(currentList.length === 0) {
			let tbody = document.createElement('tbody');
			for(const linea of lista) {
				
				let tr = document.createElement('tr');
				let td1 = document.createElement('td');
				let id = document.createTextNode(linea.id);
				td1.appendChild(id);
				tr.appendChild(td1);
				
				let td2 = document.createElement('td');
				let des = document.createTextNode(linea.descripcion);
				td2.appendChild(des);
				tr.appendChild(td2);
				
				let td3 = document.createElement('td');
				let cod = document.createTextNode(linea.codigo);
				td3.appendChild(cod);
				tr.appendChild(td3);
				
				let td4 = document.createElement('td');
				let hab = document.createTextNode(linea.habilitada);
				td4.appendChild(hab);
				tr.appendChild(td4);
				
				let td5 = document.createElement('td');
				let newButton = document.createElement('button');
				newButton.appendChild(document.createTextNode('Ver'));
				newButton.className = 'btn btn-primary';
				newButton.setAttribute('onclick','modalFormulario(linea)');
				td5.appendChild(newButton);
				tr.appendChild(td5);
				
				tbody.appendChild(tr);
			}
			tablaSeleccionada.appendChild(tbody);
		}
	}
	
	function modalFormulario(lineaActual) {
		const options = {
				keyboard: false
			};
		
		const formModal = document.getElementById('formularioModal');
		
		document.getElementById('id').innerHTML = lineaActual.id;
		document.getElementById('descripcion').value = lineaActual.descripcion;
		document.getElementById('codigo').value = lineaActual.codigo;
		document.getElementById('habilitada').value = lineaActual.habilitada;
		
		const myFormModal = new bootstrap.Modal(document.getElementById('modalAbrirForm'), options)
		myFormModal.show();
	}

</script>
<!-- Modal 1 -->
<div class="modal fade" id="modalAbrirTablas" tabindex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">
  <div class="modal-dialog">
    <div class="modal-content">
      <div class="modal-header">
        <h5 class="modal-title" id="exampleModalLabel">Marcas y Categorias</h5>
        <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
      </div>
      <!-- Las tablas -->
      <div class="modal-body">
      	<div class="mb-3">
      		<h5>Marcas</h5>
	      	<table class="table" id="marcas">
			</table>
		</div>
		<div class="mb-3">
			<h5>Categorias</h5>
			<table class="table" id="categorias">
			</table>
		</div>
      </div>
      <!-- los botones -->
      <div class="modal-footer">
        <button type="button" class="btn btn-secondary" data-bs-dismiss="modal">Close</button>
      </div>
    </div>
  </div>
</div>
<!-- Modal 2-->
<div class="modal fade" id="modalAbrirForm" tabindex="-1" aria-labelledby="exampleModalLabel" aria-hidden="true">
  <div class="modal-dialog">
    <div class="modal-content">
      <div class="modal-header">
        <h5 class="modal-title" id="exampleModalLabel">Marcas y Categorias</h5>
        <button type="button" class="btn-close" data-bs-dismiss="modal" aria-label="Close"></button>
      </div>
      <!-- El formulario -->
      <div class="modal-body">
      	<form id="formularioModal">
      		<div class="mb-3">
				<label for="id" class="form-label">ID</label>
				<span id="id"></span>
			</div>
			<div class="mb-3">
			    <label for="descripcion" 
			    	class="form-label">Descripcion</label>
			    <input type="text" 
			    	class="form-control" 
		    		id="descripcion" 
		    		aria-describedby="descripcionHelp">
		    </div>
		    <div class="mb-3">
			    <label for="codigo" 
			    	class="form-label">Codigo</label>
			    <input type="text" 
			    	class="form-control" 
		    		id="codigo" 
		    		aria-describedby="codigoHelp">
		    </div>
		    <div class="mb-3">
			    <label for="habilitada" 
			    	class="form-label">Habilitada</label>
			    <input type="number" 
			    	class="form-control" 
		    		id="habilitada" 
		    		aria-describedby="habilitadaHelp">
		    </div>
      	</form>
      </div>
      <!-- los botones -->
      <div class="modal-footer">
        <button type="button" class="btn btn-secondary" data-bs-dismiss="modal">Close</button>
      </div>
    </div>
  </div>
</div>