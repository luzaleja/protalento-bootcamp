package ejercicioAdicionalSemana4;

public class MainTorre {

	public static void main(String[] args) {

		// inicializamos los objetos
		
		Avion avion1 = new Avion("Boeign 737-800",70760f,840f,189,70534f,65317f,20894f,5700f);
		Helicoptero helicoptero1 = new Helicoptero("Cougar",9000f,251f, 4, 350f , 222f, 911f, "Airbus", "AS532SC");
		Superman superman = new Superman("Clark Kent",100f,675000000000f,1.91f);
		Ovni ovni1 = new Ovni("ovni",0.0018f,30f,"globo","amarillo","luces nocturnas");
		
		//creamos un vector 
		
		Voladores[] voladores = new Voladores[] {avion1,helicoptero1,superman,ovni1};
		
		System.out.println("Reporte de los voladores en aproximación: "+"\n");
		
		for (int i = 0; i < voladores.length; i++) {
			voladores[i].detallar();
			if (voladores[i] instanceof Aterrizable) {
				//si es una instancia de Aterrizable, casteamos para usar su metodo abs
				Aterrizable atr = (Aterrizable)voladores[i]; 
				atr.aterrizar(); //usamos la variable creada atr para usar aterrizar
			}else {
				System.out.println("No tiene permiso para aterrizar"+"\n");
			}
		}
		
	}

}
