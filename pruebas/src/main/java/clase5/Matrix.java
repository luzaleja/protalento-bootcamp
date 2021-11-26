package clase5;

public class Matrix {

	public static void main(String[] args) {
		
		// matrices son vectores con filas y columnas
		
		// por ejemplo, un vector con nombres y edades
		
		// lo podemos ver como
		
		// vector 1 [a b c d]
		// vector 2	[1 2 3 4]
		
		// o 
		
		//			columna 1		columna 2
		// fila1	pos 00			pos 01
		// fila2	pos 10			pos 11
		
		// for (int fila = 0, fila < 2; fila ++)
		//		for (int columna = 0, columna < 2; columna ++)
		
		
		int cantFilas = 2;
		int cantCols = 2;
		
		// si hago nombreYEdad.length, me va a entregar el tamaño de las filas
		// si se hac nombreYEdad[0].length va a dar el tamaño de las columnas
		Integer[][] matriz = new Integer [cantFilas][cantCols];
		
		//cargar la matriz
		
		for(int fila = 0; fila < cantFilas; fila++) {
			for(int columna = 0; columna < cantCols; columna++) {
				System.out.println(fila + "-"+columna + "="+matriz[fila][columna]);
			}
		}
	}

}
