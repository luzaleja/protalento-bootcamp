package ar.com.educacionit.collections.list;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MapStringMain2 {

	public static void main(String[] args) {

		Map<String,Integer> mapa = new HashMap<>();
		
		//Queremos contar cuantas veces se ingresa un nombre
		//Las claves van a ser los nombres unicos
		//el valor es la cantidad de veces que se ha ingresado el valor
		
		Scanner teclado = new Scanner(System.in);
		System.out.println(mapa);
		
		String nombre;
		
		do {
			System.out.println("Ingrese nombre");
			nombre = teclado.next();
			
			if(!"FIN".equals(nombre)) {
				if(mapa.containsKey(nombre)) {
					//si ya contiene el nombre como clave entonces
					//trae cuantas veces lleva el nombre trayendo el valor
					//le sumamos uno
					//y guardamos la clave nuevamente, sobreescrita con este nuevo valor
					Integer value = mapa.get(nombre);
					value++;
					mapa.put(nombre, value);
				}else {
					mapa.put(nombre, 1); //si no existe la clave, se agrega al mapa
					//con un 1 porque seria la primera repeticion
				}
			}
		} while(!nombre.equalsIgnoreCase("FIN"));
		System.out.println(mapa);
		
		
		System.out.println("Ingrese nombre a eliminar");
		nombre = teclado.next();
		
		if(mapa.containsKey(nombre)) {
			mapa.remove(nombre);
		}else {
			System.out.println("No existe "+nombre+" en el mapa");
		}

		System.out.println(mapa);
		
		teclado.close();
	}

}
