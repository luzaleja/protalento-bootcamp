function validarFormulario() {
	
	//capturamos los datos del formulario
	let inputNombre = document.getElementById('nombre');
	let inputEmail = document.getElementById('email');
	let inputPais = document.getElementById('pais');
	let inputEstadoCivil = document.getElementById('estadoCivil');
	let inputTerminos = document.getElementById('terminos');
	
	//obtenemos el valor
	const valueNombre = inputNombre.value.trim();
	const valueEmail = inputEmail.value.trim();
	const valuePais = inputPais.value.trim();
	const valueEstadoCivil = inputEstadoCivil.value.trim();
	const valueTerminos = inputTerminos.value.trim();
	
	let nombreValid = true;
	let emailValid = true;
	let paisValid = true;
	let estadoCivilValid = true;
	let terminosValid = true;
	
	//revisamos que no vengan vacios y que cumplan con lo que queremos
	//nombre: que no traiga numeros
	if(valueNombre === '' && !('^[^0-9]+$'.test(valueNombre))) {
		setErrorFor(inputNombre,'Nombre inválido')
		nombreValid = false;
	}
	
	//email: que sea un formato de email
	const emailRegex = '/^(([^<>()[\]\\.,;:\s@"]+(\.[^<>()[\]\\.,;:\s@"]+)*)|(".+"))@((\[[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\.[0-9]{1,3}\])|(([a-zA-Z\-0-9]+\.)+[a-zA-Z]{2,}))$/';
	if(valueEmail === '' && !emailRegex.test(valueEmail)) {
		setErrorFor(inputEmail,'Email inválido')
		emailValid = false;
	}
	
	//pais: que no venga vacio
	if(valuePais === '') {
		setErrorFor(inputPais,'Pais inválido')
		paisValid = false;
	}
	
	//estado civil: que no venga vacio
	if(valueEstadoCivil === '') {
		const control = inputEstadoCivil.parentElement.parentElement;
		const small = control.querySelector('small');
		
		small.innerText = 'Estado Civil inválido';
		control.className = 'mb-3 error';
		estadoCivilValid = false;
	}
	
	//terminos: que no venga vacio 
	if(valueTerminos !== 'on') {
		const controlT = inputTerminos.parentElement;
		const small = controlT.querySelector('small');
		
		small.innerText = 'Debe Aceptar los Términos';
		controlT.className = 'mb-3 form-check error';
		terminosValud = false;
	}
	
	//if(nombreValid && emailValid && paisValid && estadoCivilValid && terminosValid) {
	//	let toggle = document.getElementById('myButton').data-bs-toggle;
	//	toggle.setAttribute("data-bs-toggle","modal");
	//} 
}

function setErrorFor(input, message) {
	const controlI = input.parentElement;
	const small = controlI.querySelector('small');
	
	small.innerText = message;
	controlI.className = 'mb-3 error';
}




