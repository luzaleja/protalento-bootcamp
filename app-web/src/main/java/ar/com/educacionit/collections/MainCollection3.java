package ar.com.educacionit.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class MainCollection3 {

	public static void main(String[] args) {

		//creo
		LinkedList<String> nombres = new LinkedList<>(); 

		//Para recorrerlo podemos usar un for, un iterator o un ListIterator
		//El ListIterator es mejor, pues nos deja mover hacia adelante y
		//hacia atras
		
		nombres.add("edwin");
		nombres.add("camilo");
		nombres.add("juan");
		
		//ListIterator
		
		ListIterator<String> li = nombres.listIterator();
		//hacia adelante
		while(li.hasNext()) {
			String elemento = li.next();
			System.out.println(elemento);
		}
		
		//hacia atras
		while(li.hasPrevious()) {
			String elemento = li.previous();
			System.out.println(elemento);
		}
	}

}
