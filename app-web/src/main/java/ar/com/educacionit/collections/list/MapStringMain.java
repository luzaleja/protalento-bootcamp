package ar.com.educacionit.collections.list;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapStringMain {

	public static void main(String[] args) {

		Map<Integer,String> dias = new HashMap<>();
		
		dias.put(1,  "Lunes");
		dias.put(2,  "Martes");
		dias.put(3,  "Miercoles");
		dias.put(4,  "Jueves");
		dias.put(5,  "Viernes");
		dias.put(6,  "Sabado");
		dias.put(7,  "Domingo");
		dias.put(7,  "Domingo2");
		
		//obtengo un elemento
		String diaStr = dias.get(1);
		System.out.println(1 + " - " + diaStr);
		
		//keySet del mapa
		Set<Integer> keySet = dias.keySet();
		
		//recorro el mapa completo sin tener que saber sus claves
		for(Integer key : keySet) {
			String value = dias.get(key);
			System.out.println(key + " - " + value);
		}
		
		//Recorrer solo los valores
		Collection<String> values = dias.values();
		for(String value : values) {
			System.out.println(value);
		}
		
		//EntrySet
		
		Set<Map.Entry<Integer, String>> entrySet = dias.entrySet();
		//recorrer
		for(Map.Entry<Integer, String> entry : entrySet) {
			Integer key = entry.getKey();
			String value = entry.getValue();
			
			System.out.println(key);
			System.out.println(value);
			
			System.out.println(entry);
			
		}
		
	}

}
