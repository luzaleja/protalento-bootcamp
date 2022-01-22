package ar.com.educacionit.exceptions;

import ar.com.educacionit.domain.Categorias;
import ar.com.educacionit.domain.Socios;

public class MiPrimerExceptionMain {

	public static void main(String[] args) {

		//jvm > errores unchecked: el programador no debe preocuparse 
		//la jvm es la que atrapa el error
		
		int a = 10;
		int b = 0;
		int c = a/b;
		//este tipo de error es irrecuperable...
		//corta el programa
		System.out.println(c);
		
		//Al ejecutar nos dice donde esta el error(la linea) y que error es
		
		//Ejemplo con objetos
		
		Socios s = null;
		Long id = s.getId();
		System.out.println(id);
		//aca el error ocurre porque un objeto null no tiene datos
		//esta "muerto", entonces no le puedo pedir su id.
		
		//herencia / interfaces
		
		//Object socio = new Socios();
		//Categorias cat = (Categorias)socio;
		
		//System.out.println(cat.getCodigo());
		
		//**************************************
		
		//jvm maneja errores de tipo checked
		//obliga al programador a controlar las "checked exception"
		//entonces debo usar un try or catch
		//no deja compilar el programa!!
		try {
			//lo que va a estar bien va aca
			metodoConException(10);
		}catch (Exception nombre) {
			//lo que considero que va a ser error va aca
			nombre.printStackTrace();
		}
		
		//la aplicacion no se rompe, se controla el error
		//El en try va lo que queremos ejecutar
		//y en el catch el como controlar en caso de error. por ejemplo un mensaje de error
		
	}

	public static void metodoConException(int valor) throws Exception{
		if(valor == 0) {
		//lanzo una nueva Exception (throw)
			throw new Exception("el valor es erroneo");
		}	
	}
	
	public static void metodoB() throws Exception{
		//metodoC()
	}
}
