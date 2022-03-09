package ar.com.educacionit.crud;

import java.util.Scanner;

public class Repaso {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);		
		
		int continuar;
		
		do {
			int opcion;
			//muestro el menu
			do {
				Menu.mostrar();
				opcion = teclado.nextInt();
			} while(opcion < 0 || opcion > 4);
			
			Ejecutable ej = null;
			try {
				ej = CreadorDeEjecutables.obtenerEjecutable(opcion);
				
				//Para llenar los datos de Data, dependerá de cuál sea la opción
				//por ejemplo, si es alta, necesitará id y titulo
				//pero si es baja, solo necesitará id, si es modificar solo
				//titulo pues el id no lo puedo modificar, etc
				Data data;
				ILectora lectora;
				boolean consola = true; //suponemos que siempre llegan por consola
				if(consola) {
					lectora = new LectorPorConsola(teclado,opcion);
					data = lectora.leerDatos();
				} else {
					lectora = new LectoraPorWeb();
					data = lectora.leerDatos();
					
				}
				
				ej.ejecutar(data);
				
				if(ej instanceof Alta) {
					Alta alta = (Alta)ej;
					alta.crear();
				}
			} catch (Exception e) {
				System.err.println(e.getMessage());
				e.printStackTrace();
			}
			
			Menu.mostrarContinuar();
			continuar = teclado.nextInt();
		} while(continuar == 1);
		
		teclado.close();
		
		System.out.println("FIN");
		  
	}

}
