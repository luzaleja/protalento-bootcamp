package clase4;

public class CicloWhile {

	public static void main(String[] args) {

		short[] edades = new short[] {10,5,25}; //length 3, pos 0 1 2
		
		
		// defino i por fuera
		int i = 0;
		
		//se evalua la condicion antes de ejecutar el ciclo while
		//si no es verdad, nunca se va a ejecutar el while
		
		while(i< edades.length) {
			System.out.println("pos:"+i+",val:"+edades[i]);
			// 0    VAL 10
			i++;
			//para que el ciclo no siga por siempre			
		}
		
		
		i = edades.length - 1; //va a iniciar en la posicion 2
		
		while( i >= 0 ) {
			System.out.println("pos:"+i+",val:"+edades[i]);
			// 0    VAL 10
			i--;
			//para que el ciclo no siga por siempre			
		}

	}

}
