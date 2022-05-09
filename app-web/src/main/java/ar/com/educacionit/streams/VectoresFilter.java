package ar.com.educacionit.streams;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class VectoresFilter {

	public static void main(String[] args) {

		Collection<Integer> edades = new ArrayList<>();
		
		edades.add(10);
		edades.add(30);
		edades.add(50);
		edades.add(5);
		
		//Filtrar los elementos de la coleccion y que solo tome los valores
		//mayores o iguales a 30
		
		Stream<Integer> stream = edades.stream();
		
		//funcion intermedia
		Stream<Integer> filtrados = stream.filter(aux -> aux >= 30);
		
		//funcion terminal 
		List<Integer> res= filtrados.collect(Collectors.toList());
		
		if(!res.isEmpty()) {
			System.out.println("Hay elementos: " + res);
		} else {
			System.out.println("No hay elementos: " + res);
		}
		
	}

}
