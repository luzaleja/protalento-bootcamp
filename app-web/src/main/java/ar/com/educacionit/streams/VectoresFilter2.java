package ar.com.educacionit.streams;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class VectoresFilter2 {

	public static void main(String[] args) {

		Collection<Integer> edades = new ArrayList<>();
		
		edades.add(10);
		edades.add(30);
		edades.add(50);
		edades.add(5);
		
		//Filtrar los elementos de la coleccion y que solo tome los valores
		//mayores o iguales a 30
		
		List<Integer> res = edades.stream() // me conecto a la fuente
				//funcion intermedia
				.filter(aux -> aux >= 30)
				.filter(aux -> aux % 2 == 0)
				//funcion terminal 
				.collect(Collectors.toList());
		
		if(!res.isEmpty()) {
			System.out.println("Hay elementos: " + res);
		} else {
			System.out.println("No hay elementos: " + res);
		}
		
	}

}
