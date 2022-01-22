package ar.com.educacionit.domain;

import ar.com.educacionit.dao.ICrud;
import ar.com.educacionit.dao.impl.SocioDaoImpl;
import ar.com.educacionit.dao.impl.SocioSQLCustom;

public class FindAllSociosTest2 {

	//revisando herencia de interfaces, en este caso se muestra
	//lo que se hace al implementar 2 interfaces diferentes en una 
	//clase
	
	//si SOCIOSQLCustom heredara de ICrud, SocioDaoImpl podria 
	//implementar solo SOCIOSQLCustom y tendria que implementar
	//todos los metodos de ICrud y SocioSQLCustom
	//y podria usar todos estos abajo sin necesidad de hacer el casteo
	
	public static void main(String[] args) {
		
		// quiero un sistema que pueda hacer consultas a 3 tablas y 
		// muestre los resultados de forma generica
		
		// recordemos que va a haber una implementacion
		// por cada tabla que implemente la interfaz
		
		//SocioDaoImpl socioImpl = new SocioDaoImpl();
		// es decir, ademas de la implementacion SocioDaoImpl
		// podriamos tener estas otras implementaciones,
		// y podríamos instanciarlas así para poder usar sus metodos:
		// ArticuloDaoImpl articuloImpl = new ArticuloDaoImpl();
		// CuponDaoImpl cuponImpl = new CuponDaoImpl();
		
		
		// para poder hacerlo general, usamos ICrud, porque sabemos
		// que todas estas implementaciones implementan ICrud:
		
		
		//ICrud[] cruds = new ICrud[] {socioImpl /*,articuloImpl,CuponImpl*/};
		
		//for(ICrud unCrud : cruds) {
			//hacemos el casteo para acceder a los metodos de 
			//SocioSQLCustom
			//if (unCrud instanceof SocioSQLCustom) {
				//i puede ejecutar todos los metodos de ICrud
				//SocioSQLCustom sc = (SocioSQLCustom)unCrud;
				//sc.selectCustom();
			//}
	//	}
		
		
	}
}
