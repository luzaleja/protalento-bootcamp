package ar.com.educacionit.collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;

public class MainCollection4 {

	public static void main(String[] args) {

		//creo
		Set<Cliente> clientes = new HashSet<>(); 

		clientes.add(new Cliente("carlos","12345"));
		clientes.add(new Cliente("carlos","12345"));
		
		//aunque tienen los mismos datos, son dos objetos diferentes
		//esto porque al hacer new, cada vez se crea una nueva instancia
		//entonces ocupan un espacio de memoria diferente
		//quiere decir que se aceptan en el set!
		
		System.out.println(clientes);
		
	}

}
