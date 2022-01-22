package ar.com.educacionit.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

public class MainCollection2 {

	public static void main(String[] args) {

		//creo
		List<String> nombres = new ArrayList<>(); 
		//un list no puede contener una Collection
		//arrayList tiene implementado el toString 
		
		//agregar
		nombres.add("camilo");
		nombres.add("edwin");
		nombres.add("juan");
		nombres.add("juan");

		List<String> apellidos = new ArrayList<>();
		apellidos.add("perez");
		apellidos.add("lopez");
		apellidos.add("juarez");
		
		//Lista de lista
		List<List<String>> nombresList = new ArrayList<>();
		nombresList.add(nombres);
		nombresList.add(apellidos);
		
		//recorrer
		System.out.println(nombresList);
		for(List<String> nl : nombresList) {
			for(String aux : nl) {
				System.out.println(aux);
			}
		}
		
		//saca todos los nombres y luego todos los apellidos
	}

}
