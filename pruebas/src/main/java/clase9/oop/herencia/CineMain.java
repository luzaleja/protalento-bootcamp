package clase9.oop.herencia;

public class CineMain {

	public static void main(String[] args) {

		//Persona persona = new Persona("nombre1", "apellido1", "negro");
		Empleado empleado = new Empleado("empleado1","apellidoemp1","rojo",1);
		Efectivo efectivo = new Efectivo("nombre efectivo1","apellido efectivo1","rubio",1);
		Contratado contratado = new Contratado("nombre contratado1","apellido contratado1","azul",1,6);
		
		Director director = new Director("nombre director","apellido director","negro",10);
		// podria decir Director director = new Director();
		
		
		// todas las personas pueden ir al cine
		Persona[] personas = new Persona[4];
		
		// para que todos puedan entrar es mejor trabajar con la clase padre
		// que es personas
		
		// si usamos Empleado[] personas = new Empleado [5];
		// solo nos aceptará los empleados y los que están bajo el
		
		//personas[0] = persona;
		personas[0] = empleado;
		personas[1] = efectivo;
		personas[2] = contratado;
		personas[3] = director;
		
		
		// recorrer las personas que entran al cine y quiero saber si son un director
		
		for(Persona aux : personas) {
		
			// con aux tengo acceso a todos los metodos public de Persona
			// todos los objetos heredan de Object
			aux.detalle();
			
			if (aux instanceof Director) {
				// toma al director que esta adentro
				Director d = (Director)aux;
				
				// encontrando el apellido
				//aux.getApellido();
				//o 
				//d.getApellido();
				
				System.out.println("Director: " + d.getEmpACargo() + " va a una silla VIP");
			}
		}
		
	}

}
