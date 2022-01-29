package ar.com.educacionit.collections.list;

import java.util.ArrayList;
import java.util.List;

public class Buscador {

	private String clave;
	private List<String> resultados;
	
	public Buscador(String clave) {
		this.clave = clave;
		this.resultados = new ArrayList<>();
		//instanciamos en el constructor para asegurarnos que no sea null
		//al momento de crear una instancia del Buscador
	}
	
	public void buscar() {
		List<String> resul = new ArrayList<>();
		//el metodo instancia una lista
		
		resul.add("resultado 1 " + this.clave);
		resul.add("resultado 2 " + this.clave);
		resul.add("resultado 3 " + this.clave);
		//guarda resultados en ella
		
		this.resultados = resul;
		//guarda esta lista en la lista de la clase
	}
	
	public List<String> getResultados() {
		return this.resultados;
	}
	
	
	
}
