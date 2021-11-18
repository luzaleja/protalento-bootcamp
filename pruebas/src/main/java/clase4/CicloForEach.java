package clase4;

public class CicloForEach {

	public static void main(String[] args) {


		String [] nombres = new String[] {"Edwin","Juan","Ricardo","Anyalith"}; //length 4, 0 1 2 3 
		
		// con for each somo me interesa ver el valor, no la posicion
		// tipo de datos nombre_variable : array que usaremos
		for ( String nombre : nombres ) {
		//no tengo que mantener nada con i++ o i+=2
			// el for each pasa solo por cada posicion y para cuando no hay mas
			System.out.println("nombre:" + nombre);
		}
	}

}
