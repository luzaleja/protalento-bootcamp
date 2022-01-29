package ejercicioAdicionalSemana11;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class MenuObtener {

	public Persona obtenerDatosPersona(Scanner teclado) {
		System.out.println("Por favor ingrese los datos de la persona: ");
		
		//Una persona tiene: nombre, apellido, idiomaNativo, idiomasAprendidos
		//Nace con los primeros 3
			
		//pedimos los datos
		
		System.out.println("Ingrese el nombre: ");
		String nombre = teclado.next();
		
		System.out.println("Ingrese el apellido: ");
		String apellido = teclado.next();
		
		String idiomaNativoStr;
		
		//Set de lenguajes que pueden ser nativos o se pueden aprender
		Set<String> lenguajes = new HashSet<>();
		
		//agregamos los que existen
		lenguajes.add("ES");
		lenguajes.add("EN");
		lenguajes.add("FR");
		lenguajes.add("DE");
		
		do {
			System.out.println("Ingrese el idioma nativo: "
					+ "\n" + "ES - Español"
					+ "\n" + "EN - Ingles"
					+ "\n" + "FR - Frances"
					+ "\n" + "DE - Aleman");
		
		idiomaNativoStr = teclado.next();
		} while (!lenguajes.contains(idiomaNativoStr));
		
		//con el String del idioma, traemos su enum correspondiente
		IdiomasEnum idiomaEnum = IdiomasEnum.valueOf(idiomaNativoStr);
		
		//con el enum, traemos la implementacion de la interfaz IIdioma correspondiente
		IIdioma idiomaNativo = idiomaEnum.getIdioma();
		
		//ahora podemos instanciar la persona
		Persona persona = new Persona(nombre,apellido,idiomaNativo);
		
		return persona;
	}

	public IIdioma obtenerIdiomaAAprender(Scanner teclado) {

		String idiomaAAprender;
		
		//Set de lenguajes que pueden ser nativos o se pueden aprender
		Set<String> lenguajes = new HashSet<>();
				
		//agregamos los que existen
		lenguajes.add("ES");
		lenguajes.add("EN");
		lenguajes.add("FR");
		lenguajes.add("DE");
				
		do {
			System.out.println("Ingrese el idioma a aprender: "
					+ "\n" + "ES - Español"
					+ "\n" + "EN - Ingles"
					+ "\n" + "FR - Frances"
					+ "\n" + "DE - Aleman");
				
		idiomaAAprender = teclado.next();
		} while (!lenguajes.contains(idiomaAAprender));
		
		//con el String del idioma, traemos su enum correspondiente
		IdiomasEnum idiomaEnum = IdiomasEnum.valueOf(idiomaAAprender);
				
		//con el enum, traemos la implementacion de la interfaz IIdioma correspondiente
		IIdioma iIdiomaAAprender = idiomaEnum.getIdioma();
		
		
		return iIdiomaAAprender;
	}
	
	public void hablar(Persona persona, Scanner teclado) throws LaPersonaNoHablaElIdiomaException {
		String idiomaAHablar;
		
		//Set de lenguajes que pueden ser nativos o se pueden aprender
		Set<String> lenguajes = new HashSet<>();
				
		//agregamos los que existen
		lenguajes.add("ES");
		lenguajes.add("EN");
		lenguajes.add("FR");
		lenguajes.add("DE");
				
		do {
			System.out.println("Ingrese el idioma a hablar: "
					+ "\n" + "ES - Español"
					+ "\n" + "EN - Ingles"
					+ "\n" + "FR - Frances"
					+ "\n" + "DE - Aleman");
				
		idiomaAHablar = teclado.next();
		} while (!lenguajes.contains(idiomaAHablar));
		
		//con el String del idioma, traemos su enum correspondiente
		IdiomasEnum idiomaEnum = IdiomasEnum.valueOf(idiomaAHablar);
						
		//con el enum, traemos la implementacion de la interfaz IIdioma correspondiente
		IIdioma iIdiomaAHablar = idiomaEnum.getIdioma();
		
		//revisando si la persona habla el idioma
		
		//revisamos el idioma nativo vs idioma que quiere hablar
		//si el idioma nativo no es el que quiere hablar
		boolean loHabla = false;
		if(persona.getIdiomaNativo().getClass().getSimpleName() != iIdiomaAHablar.getClass().getSimpleName()) {
			//revisamos si es uno de los que aprendio 
			Collection<IIdioma> idiomasQueAprendio = persona.getIdiomasAprendidos();
			for(IIdioma _idioma : idiomasQueAprendio) {
				if(_idioma.getClass().getSimpleName() == iIdiomaAHablar.getClass().getSimpleName()) {
					loHabla = true;
					break;
				} 
			}
		} else {
			loHabla = true;
		}
		if(loHabla) {
			persona.saludarEn(iIdiomaAHablar);
			persona.presentarseEn(iIdiomaAHablar);
			persona.despedirseEn(iIdiomaAHablar);
		}else {
			throw new LaPersonaNoHablaElIdiomaException("La persona no habla "+iIdiomaAHablar.getClass().getSimpleName());
		}
		
	}
	
	public Collection<Persona> obtenerPersonasQueHablanUnIdioma(Map<Integer,Persona> personas,Scanner teclado) {
		
		String idiomaABuscar;
		
		//Set de lenguajes que pueden ser nativos o se pueden aprender
		Set<String> lenguajes = new HashSet<>();
				
		//agregamos los que existen
		lenguajes.add("ES");
		lenguajes.add("EN");
		lenguajes.add("FR");
		lenguajes.add("DE");
				
		do {
			System.out.println("Ingrese el idioma a buscar: "
					+ "\n" + "ES - Español"
					+ "\n" + "EN - Ingles"
					+ "\n" + "FR - Frances"
					+ "\n" + "DE - Aleman");
				
		idiomaABuscar = teclado.next();
		} while (!lenguajes.contains(idiomaABuscar));
		
		//con el String del idioma, traemos su enum correspondiente
		IdiomasEnum idiomaEnum = IdiomasEnum.valueOf(idiomaABuscar);
						
		//con el enum, traemos la implementacion de la interfaz IIdioma correspondiente
		IIdioma iIdiomaABuscar = idiomaEnum.getIdioma();
		
		//Donde vamos a guardar las personas que saben un idioma
		Collection<Persona> personasQueSabenUnIdioma = new ArrayList<>();
		
		//revisando que personas hablan el idioma
		Set<Map.Entry<Integer, Persona>> entrySet = personas.entrySet();
		//recorremos cada entrada en el mapa
		for(Map.Entry<Integer, Persona> entry : entrySet) {
			Persona personaAux = entry.getValue();
			
			//revisando si es su idioma nativo
			if(personaAux.getIdiomaNativo().getClass().getSimpleName() == iIdiomaABuscar.getClass().getSimpleName()) {
				personasQueSabenUnIdioma.add(personaAux);
			}
			
			//revisando si es uno de los idiomas aprendidos
			//traemos el Set de idiomas de la persona
			Set<IIdioma> idiomasAprendidosPorPersona = personaAux.getIdiomasAprendidos();
			//recorremos
			for(IIdioma _idioma : idiomasAprendidosPorPersona) {
				if(_idioma.getClass().getSimpleName() == iIdiomaABuscar.getClass().getSimpleName()) {
					personasQueSabenUnIdioma.add(personaAux);
				}
			}
		
		}
		return personasQueSabenUnIdioma;
	}

}
