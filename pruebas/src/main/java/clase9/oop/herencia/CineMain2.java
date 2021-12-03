package clase9.oop.herencia;

public class CineMain2 {

	public static void main(String[] args) {

		//Persona persona = new Persona("nombre1", "apellido1", "negro");
		Empleado empleado = new Empleado("empleado1","apellidoemp1","rojo",1);
		Efectivo efectivo = new Efectivo("nombre efectivo1","apellido efectivo1","rubio",1);
		Contratado contratado = new Contratado("nombre contratado1","apellido contratado1","azul",1,6);
		
		Director director = new Director("nombre director","apellido director","negro",10);
		// podria decir Director director = new Director();
		
		
		// todas las personas pueden ir al cine
		Persona[] personas = new Persona[5];
		
		System.out.println(empleado.cantidadNariz);
		System.out.println(efectivo.cantidadNariz);
		
		
		// si alguien cambia el valor en algun momento
		// el valor cambia para todos desde ese momento
		
		Persona.cantidadNariz = 5;
		
		System.out.println(contratado.cantidadNariz);
		System.out.println(director.cantidadNariz);

		
		
		
	}

}
