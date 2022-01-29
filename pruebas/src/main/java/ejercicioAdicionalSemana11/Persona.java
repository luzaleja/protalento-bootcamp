package ejercicioAdicionalSemana11;

import java.util.HashSet;
import java.util.Set;

public class Persona {
	
	//atributos
	
	private String nombre;
	private String apellido;
	private IIdioma idiomaNativo;
	private Set<IIdioma> idiomasAprendidos;
	//Es set porque no puede aprender un idioma dos veces
	
	
	
	//constructor: nace con idiomaNativo, nombre y apellido
	//inicializamos idiomasAprendidos para evitar Null
	public Persona(String nombre, String apellido, IIdioma idiomaNativo) {
		this.nombre = nombre;
		this.apellido = apellido;
		this.idiomaNativo = idiomaNativo;
		
		this.idiomasAprendidos = new HashSet<>();
	}


	
	//metodos de la clase
	public void aprender(IIdioma idioma) throws IdiomaYaAprendidoException {
		//si el idioma a aprender es el nativo
		if(idioma.getClass().getSimpleName() == this.idiomaNativo.getClass().getSimpleName()) {
			throw new IdiomaYaAprendidoException("El idioma "+idioma.getClass().getSimpleName()+" es el idioma nativo.");
			//si se repide debe lanzar una excepcion
		} 
		
		for(IIdioma idiomaAux : idiomasAprendidos) {
			if(idioma.getClass().getSimpleName() == idiomaAux.getClass().getSimpleName()) {
				throw new IdiomaYaAprendidoException("El idioma "+idioma.getClass().getSimpleName()+" ya fue aprendido.");
			}
		}
		
		this.idiomasAprendidos.add(idioma);
	}
	
	
	public void saludarEn(IIdioma idioma) {
		idioma.saludar();
	}
	
	public void presentarseEn(IIdioma idioma) {
		idioma.presentarse(nombre, apellido);
	}

	public void despedirseEn(IIdioma idioma) {
		idioma.despedirse();
	}
	
	
	//getters, setters y toString
	public IIdioma getIdiomaNativo() {
		return idiomaNativo;
	}


	public String getNombre() {
		return nombre;
	}


	public String getApellido() {
		return apellido;
	}


	public Set<IIdioma> getIdiomasAprendidos() {
		return idiomasAprendidos;
	}


	public void setIdiomasAprendidos(Set<IIdioma> idiomasAprendidos) {
		this.idiomasAprendidos = idiomasAprendidos;
	}



	@Override
	public String toString() {
		return "Persona [nombre=" + nombre + ", apellido=" + apellido + ", idiomaNativo=" + idiomaNativo
				+ ", idiomasAprendidos=" + idiomasAprendidos + "]";
	}


	
	
	
	
	
	
	

}
