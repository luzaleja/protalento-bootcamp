package clase4;

public class CicloForConBreak {

	public static void main(String[] args) {


		int[] datos = new int[] {10,0,15};
		
		
		//como usar el break y continue
		for(int dato : datos) {
			if(dato == 0) {
				break;
				//corta el ciclo, no revisa mas datos
				// dentro del ciclo y va a siguiente linea fuera del ciclo!
			}
			System.out.println("dato="+dato);
		}
		
		
		for(int dato: datos) {
			if(dato == 0) {
				continue;
				//salta la linea, no ejecuta la linea 28
				//pero sigue revisando el resto del ciclo
			}
			System.out.println("dato="+dato);
		}
		
		
		
		System.out.println("fin");
	}

}
