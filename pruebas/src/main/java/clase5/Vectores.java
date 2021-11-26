package clase5;

import java.util.Arrays;

public class Vectores {

	public static void main(String[] args) {
		
		// crear vectores
		
		// tipoDatos[] nombre = new tipodeDatos[] {valor1,valor2,...,valorn};
		
		// tipoDato [] nomobre = new tipodeDato [tamaño];
		// es como si crearamos un vector vacio
		
		String[] nombres = new String[] {"Luz", "Jose", "Edwin", "Carlos", "Herana", "Samir"};
		
		int size = nombres.length; //nos da el tamaño del vector
		
		//necesito un nuevo vector de tamaño 6 pues max 6 nombres pueden empezar por e
		String[] nombresConE = new String[size];
		
		
		int j = 0;
		// buscar los nombres que empiecen con E
		
		for (int i=0 ; i < size ; i++) {
			String nombre = nombres[i];
			
			/*if (dato.substring(0,i) == "E"); {  //1ra opcion
				
			}
			if (dato.charAt(0) == 'E') {  //2da opcion
				
			}
			if (dato.indexOf("E") == 0) { // >= 0 sino -1 // 3ra opcion
				
			}
			*/
			//4ta opcion
			if(nombre.startsWith("E")) {
				nombresConE[j] = nombre;
				j++;
				
				//nombresConE[i] = nombre; esto va creando el vector, pero el indice importa
				//si en el v1 Edwin esta en 4, en el v2 estara ahi tambien
				// por eso mejor agregamos una nueva variable j, para que
				// se vayan guardando en en la posicion 0, 1,...
				
			//esto imprime [edwin,null,null,null,null,null]
			//si se usa solo la i, , imprimiria [null,null,null,edwin,null,null]
				
			}
			
			System.out.println(Arrays.toString(nombresConE));
			
			//con un for para mostrar solo los nombres, pero se guardan los null
			for(String nombre1 : nombresConE) {
				if(nombre1 != null) {
					System.out.println(nombre1);
				}
			}
		}
	}

}
