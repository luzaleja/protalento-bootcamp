package pruebas;

public class Ejercicio1 {

	public static void main(String[] args) {
		// Cree un programa en Java que dado un numero entero de horas
		// muestre el equivalente en semanas, dias y horas
		
		int horasTotales = 1500;
		
		int semanas, dias, horas, restoHoras;
		
		// horas en una semana = 24 * 7 = 168
		
		semanas = horasTotales / 168;
		
		restoHoras = horasTotales % 168;
		
		// horas en un dia = 24
		
		dias = restoHoras / 24;
		
		// el resto son las horas restantes 
		
		horas = restoHoras % 24;
		
		System.out.println("Cantidad de horas totales: " + horasTotales
				+ "\n"+ "\n"
				+ "Semanas: " + semanas + "\n"
				+ "Dias : " + dias + "\n"
				+ "Horas: " + horas);

	}

}
