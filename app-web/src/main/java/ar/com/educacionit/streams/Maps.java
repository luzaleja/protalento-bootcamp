package ar.com.educacionit.streams;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class Maps {

	public static void main(String[] args) {

		//Convertir edades de Integer a String
		Collection<Integer> edades = new ArrayList<>();
		
		edades.add(10);
		edades.add(30);
		edades.add(50);
		edades.add(5);
		
		//con for
		List<String> edadesStr = new ArrayList<>();
		
		for(Integer aux : edades) {
			edadesStr.add("valor" + aux.toString());
		}
		
		System.out.println(edadesStr);
		
		//con streams
		
		List<String> strs = edades.stream()
				.map(aux -> "valor" + aux.toString())
				.collect(Collectors.toList());
		
		System.out.println(strs);
	}

}
