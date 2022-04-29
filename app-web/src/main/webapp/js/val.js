const form = document.getElementById('form');

//capturamos los datos del formulario
const inputNombre = document.getElementById('nombre');

form.addEventListener('submit', e => {
	e.preventDefault();
	
	validarFormulario();
});

function validarFormulario() {
	
	//obtenemos el valor
	const valueNombre = inputNombre.value.trim();
		
	let nombreValid = true;
		
	//revisamos que no vengan vacios y que cumplan con lo que queremos
	//nombre: que no traiga numeros
	if(valueNombre === '' && !('^[^0-9]+$'.test(valueNombre))) {
		setErrorFor(inputNombre,'Nombre inválido')
		nombreValid = false;
	}
}

function setErrorFor(input, message) {
	const controlI = input.parentElement;
	const small = controlI.querySelector('small');
	controlI.className = 'mb-3 error';
	small.innerText = message;
}

