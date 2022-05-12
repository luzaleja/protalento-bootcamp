(function () {
  'use strict'

  // Fetch all the forms we want to apply custom Bootstrap validation styles to
  var forms = document.querySelectorAll('.needs-validation')

  // Loop over them and prevent submission
  Array.prototype.slice.call(forms)
    .forEach(function (form) {
      form.addEventListener('submit', function (event) {
        if (!form.checkValidity()) {
          event.preventDefault()
          event.stopPropagation()
        }

        form.classList.add('was-validated')
      }, false)
    })
})()

function isValid() {
	const options = {
			  keyboard: false
			};
			
	const inputNombre = document.getElementById('nombre');
	const inputEmail = document.getElementById('email');
	const inputPais = document.getElementById('pais');
	const inputEstadoCivil = document.getElementById('estadoCivilCasado');
	const inputTerminos = document.getElementById('terminos');
	
	let valid = true;
	
	if(inputNombre.classList.contains('invalid')) {
		valid = false;
	} 
	
	if(inputEmail.classList.contains('invalid')) {
		valid = false;
	} 
	
	if(inputPais.classList.contains('invalid')) {
		valid = false;
	} 
	
	if(inputEstadoCivil.classList.contains('invalid')) {
		valid = false;
	} 
	
	if(inputTerminos.classList.contains('invalid')) {
		valid = false;
	} 
	
	if(valid === true) {
		const myModal = new bootstrap.Modal(document.getElementById('modalValidar'), options)
		myModal.show();
	}
}

