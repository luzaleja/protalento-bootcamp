package clase4;

public class Arrays {

	public static void main(String[] args) {
		// crear vector
		
		int[] edades = new int[2]; // un vector de 3 posiciones 0.1
		// new int[x]; donde x es el length del vector
		
		// [0,0] está asi en un principio
		//  0 1 posicion
		
		// cargar el vector
		
		edades[0]= 5; //aca carga la posicion inicial que es la 0
		edades[1]= 10; // aca carga la posicion 2, que es la 1
		
		//atributo length
		
		int tamanio = edades.length; //tamaño del vector
		
		//acceder al ultimo elemento
		int edad = edades[tamanio-1]; 
		
		
	}

}
