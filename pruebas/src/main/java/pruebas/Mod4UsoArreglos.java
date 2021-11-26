package pruebas;

public class Mod4UsoArreglos {

	public static void main(String[] args) {

		// Busqueda del numero maximo y minimo de un vector
		
		// definiendo el vector y dandole los datos
		
		int [] numeros = new int [] {2,5,20,8,18};
		
		// tomamos como numero mayor y menor el primer numero del vector para poder compararlo en el for
		int numMayor = numeros[0];
		int numMenor = numeros[0];
		
		// comparando desde la segunda posicion a la ultima
		for (int i = 1; i < numeros.length ; i++) {
			
			//si la pos i es mayor al numero mayor hasta el momento, ese pasa a ser el numero mayor
			if (numeros[i] >= numMayor) {
				numMayor = numeros[i];
			}	
			if (numeros[i] <= numMenor) {
				numMenor = numeros[i];
			}
			
		}
		
		System.out.println("El numero mayor es " + numMayor
				+ " y el numero menor es " + numMenor);
		
		System.out.println("------------------------------");
		 
		
		
		// contar cuantes veces aparece el numero 10
		
		// definiendo el vector y dandole datos
		
		int [] datos = new int [] {1,10,2,10,3,10};
		
		int contador = 0;
		int numero = 10;
		
		for ( int num : datos) {
			if (num == numero) {
				contador++;
			}
		}
		
		System.out.println("El numero de " +numero+" es: " + contador);
		
		System.out.println("------------------------------");
		
		
		
		// Totalizar un vector y calcular el promedio
		
		// definimos vector y damos numeros
		
		int [] lista = new int [] {1,2,3,4,5};
		
		int suma = 0;
		
		for (int a = 0; a < lista.length; a++) {
			suma += lista[a];
		}

		int promedio = suma/lista.length;
		
		System.out.println("La suma es "+suma+" y el promedio es "+promedio);
		
		
		
		
		
		
	}

}
