package pruebas;

public class TiposDeDatos {

	// argumentos o parametros que "vienen" desde afuera
	public static void main(String[] args) {
		// comentario
		
		// tipos de datos
		// edad > numerico
		// byte < short < int < long < float < double
		
		// tipo nombre = 10;
		// definir tipo, definir nombre, inicializar la variable;
		
		byte edad = 10;
		short edadShort = 10;
		int edadInt = 10;
		long edadLong = 10;
		float edadFloat = 10;
		double edadDouble = edadFloat;
		
		//definir
		String nombre;
		
		//asignar (siempre comillas dobles)
		nombre = "carlos";
		
		//boolean flag = true;
		//boolean otroFlag = false;
		
		char letra = 'a';
		//ese si se puede con comillas simples, solo contiene un caracter
		
		String apellido = new String("lopez");
		//es lo mismo que
		String apellido2 = "lopez";
		
		//definir es darle el tipo a una variable
		// int edad;
		
		System.out.println(edad+edadShort+edadInt+edadLong+edadFloat+edadDouble);
		System.out.println(nombre);
		
		System.out.println(letra);
		
		System.out.println(apellido + apellido2);
		//definir y asignar
		//int edad2= 10;
		
		// operadores
		// como se que algo es mas grande que otra cosa
		

	}

}
