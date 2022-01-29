package ar.com.educacionit.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

public class MainCollection {

	public static void main(String[] args) {

		//creo
		Collection<String> nombres = new ArrayList<>();
		
		//agregar
		nombres.add("juan");
		nombres.add("camilo");
		nombres.add("edwin");
		
		//obtener
		Iterator<String> itNombres = nombres.iterator();
		while(itNombres.hasNext()) {
			String dato = itNombres.next();
			System.out.println("Dato: " + dato);
		}
		
		//eliminar con Iterator
		itNombres = nombres.iterator();
		while(itNombres.hasNext()) {
			itNombres.next();
			itNombres.remove();
		}
		
		//buscar sin alterar el tamaño de la coleccion
		//for(String nombre : nombres) {
		//	if(nombre.equalsIgnoreCase("juan")) {
		//		nombre = new String("jose"); //toca reinstanciar para asegurarse que cambie el valor
		//	}
		//} EN ESTE CASO NO FUNCIONA PORQUE LOS STRING SON INMUTABLES
		// ASI REINSTANCIE, NO CAMBIA EL VALOR DEL STRING EN LA COLECCION
		// SI FUERAN OBJETOS, SI PODRIA FUNCIONAR
		
		System.out.println(nombres);
	}

}
