package ejercicioAdicionalSemana11;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class IdiomasMain {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);
		
		MenuObtener op = new MenuObtener();
		
		System.out.println("Por favor ingrese cuantas personas son: ");
		int cantidadPersonas = teclado.nextInt();
		
		Map<Integer,Persona> personas = new HashMap<>();
		
		for(int i = 0; i < cantidadPersonas; i++) {
			Persona persona = op.obtenerDatosPersona(teclado);
			Integer codigo = Integer.valueOf(i + 1);
			personas.put(codigo,persona);
		}
		
		int opcion = 3;
		
		while(opcion != 0) {
			
			System.out.println("Por favor ingrese: "
					+ "\n" + "1 - Aprender Idioma"
					+ "\n" + "2 - Hablar"
					+ "\n" + "3 - Consultar personas que hablan un idioma"
					+ "\n" + "0 - Finalizar");

			opcion = teclado.nextInt();
		
			Set<Map.Entry<Integer, Persona>> entrySet = personas.entrySet();
		
			if(opcion == 1) {
				int codigoPersona;
				System.out.println("Elija la persona que aprenderá un idioma: ");

				//imprimimos la lista de las personas existentes para que escoja
				for(Map.Entry<Integer, Persona> entry : entrySet) {
					Integer codigoAux = entry.getKey();
					Persona personaAux = entry.getValue();
					String nombre = personaAux.getNombre();
					String apellido = personaAux.getApellido();
					String idiomaNat = personaAux.getIdiomaNativo().getClass().getSimpleName();
					System.out.println(codigoAux + " - Nombre completo: " + nombre + " " + apellido + ", Idioma nativo: " + idiomaNat);
				}
				//guardamos el numero 
				codigoPersona = teclado.nextInt();
				//obtenemos la persona con la clave
				Persona personaSeleccionada = personas.get(codigoPersona);
				//obtenemos la implementacion de IIdioma correspondiente
				IIdioma idioma = op.obtenerIdiomaAAprender(teclado);
				//tratamos de agregar el idioma a la lista de aprendidos
				try {
					personaSeleccionada.aprender(idioma);
				} catch (IdiomaYaAprendidoException e) {
					e.printStackTrace();
				}
				
			} else if(opcion == 2) {
				int codigoPersona;
				System.out.println("Elija la persona que hablará: ");

				//imprimimos la lista de las personas existentes para que escoja
				for(Map.Entry<Integer, Persona> entry : entrySet) {
					Integer codigoAux = entry.getKey();
					Persona personaAux = entry.getValue();
					String nombre = personaAux.getNombre();
					String apellido = personaAux.getApellido();
					String idiomaNat = personaAux.getIdiomaNativo().getClass().getSimpleName();
					System.out.println(codigoAux + " - Nombre completo: " + nombre + " " + apellido + ", Idioma nativo: " + idiomaNat);
				}
				//guardamos el numero
				codigoPersona = teclado.nextInt();
				//obtenemos la persona con la clave
				Persona personaSeleccionada = personas.get(codigoPersona);
				//hacemos que la persona seleccionada hable segun el idioma que escoja
				op.hablar(personaSeleccionada, teclado);
				
			} else if(opcion == 3) {
				Collection<Persona> personasQueHablanIdioma = new ArrayList<>();
				personasQueHablanIdioma = op.obtenerPersonasQueHablanUnIdioma(personas,teclado);
				System.out.println("Personas que hablan el idioma: ");
				for(Persona personaAux : personasQueHablanIdioma) {
					System.out.println("Nombre completo: " + personaAux.getNombre()+" "+personaAux.getApellido());
				}
			} else if(opcion == 0) {
				System.out.println("Aplicación finalizada");
			} else {
				System.out.println("Por favor ingrese una opción correcta");
			}
		}
		
		teclado.close();
	}

}
