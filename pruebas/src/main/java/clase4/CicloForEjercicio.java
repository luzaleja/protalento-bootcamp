package clase4;

import java.util.Scanner;

public class CicloForEjercicio {

	public static void main(String[] args) {
		// solicitar al usuario la cantidad de registros
		// cargar en un vector de enteros los datos ingresados por el usuario
		// contar la cantidad de numeros pares
		// contar la cantidad de numeros impares
		// sumar los pares
		// sumer los impares
		// promedio de los valores ingresados
		
		// definir variables que vamos a necesitar
		
		int cantidadRegistros;
		int[] vector;
		int cantPares = 0;
		int cantImpares = 0;
		int sumaPares = 0;
		int sumaImpares = 0;
		double promedio;
		
		// 1 definir el tamaño del vector
		
		
		Scanner teclado = new Scanner(System.in);
		
		
		
		// para mover una linea: pararse en la linea
		// + alt + flecha arriba o abajo
		
		do {
			System.out.println("Ingrese la cantidad de registros a procesar: >0 ");
			cantidadRegistros = teclado.nextInt();
			//no hay vectores negativos, entonces se le va a pedir que siga ingresando 
			//numeros hasta que ingrese uno mayor a 0
		} while(cantidadRegistros <= 0);
		
		// carga de datos
		
		//inicializando el vector
		vector = new int[cantidadRegistros];
		
		for(int i=0; i <= cantidadRegistros -1; i++) {
			System.out.println("Ingrese un dato: ");
			int datoLeido = teclado.nextInt();
			vector[i] = datoLeido;
		}

		// procesamiento de las sumas
		
		for( int dato : vector) {
			
			if(dato%2 ==0) {
				cantPares++;
				sumaPares += dato;
			}else {
				cantImpares++;
				sumaImpares += dato;
			}	
		}
		
		//promedio
		
		//ctrl + shift i
		//seleccionando una linea, solo corre esa linea en debug
		// luego se puede seguir con esa correccion tomada en cuenta
		promedio = (double)(sumaPares + sumaImpares)/(cantPares+cantImpares);
				
		teclado.close();
		System.out.println("Cantidad de registros: " + cantidadRegistros);
		System.out.println("Cantidad de pares: " + cantPares);
		System.out.println("Cantidad de impares: " + cantImpares);
		System.out.println("Suma Pares: " + sumaPares);
		System.out.println("Suma Imparess: " + sumaImpares);
		System.out.println("Promedio: " + promedio);
	}

}
