package clase4;

import java.util.Scanner;

public class EjercicioIntegrador {

	public static void main(String[] args) {

		// ingrese 10 datos
		//encuentre max
		//min
		//posicion del maximo
		//posicion del minimo
		//suma total
		//contar cuantas veces se repite el mismo maximo
		//y el minimo
		
		float[] datos = new float[10];
		
		float maximo;
		float minimo;
		byte pMax;
		byte pMin;
		float sumaTotal = 0;
		int cantRepMax = 0;
		int cantRepMin = 0;
		
		Scanner teclado = new Scanner(System.in);
		
		for(int i=0; i < datos.length ; i++) {
			System.out.println("ingrese un valor: ");
			datos[i] = teclado.nextInt();
			
		}
		
		teclado.close();
		
		maximo = datos[0];
		pMax = 0;
		minimo = datos[0];
		pMin= 0;
		

		
		for(int i=1; i < datos.length; i++) {
			//maximo
			if(datos [i] >= maximo) {
				maximo = datos[i];
				pMax = (byte)i;
				if(datos[i] == maximo)
					cantRepMax++;
				else
					cantRepMax = 0;
			}
			//minimo
			if(datos[i] <= minimo) {
				minimo = datos[i];
				pMin = (byte)i;
				if(datos[i] == minimo)
					cantRepMin++;
				else
					cantRepMin = 0;
			}
			System.out.println("max: "+maximo);
			System.out.println("min: "+minimo);
			System.out.println("posmax: "+pMax);
			System.out.println("posmin: "+pMin);
			System.out.println("cantmax: "+cantRepMax);
			System.out.println("cantmin: "+cantRepMin);
		
			
			
			
			
		}
		
		
		
		

	}

}
