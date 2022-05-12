async function obtenerDatos() {
	//Para abrir el modal despues
	const options = {
		keyboard: false
	};
	
	let listadoJson = await axios.get('/controllers/ListadoServlet');

	listadoJson = listadoJson.data;
	
	const marcas = listadoJson.marcas;
	
	const categorias = listadoJson.categorias;
	
	//presentamos el modal con la informacion
	const myModal = new bootstrap.Modal(document.getElementById('modalAbrirTablas'), options)
	myModal.show();
}

function llenarTablas() {
	
}