package clase9.oop.interfaces;

public class MainInterfaces {

	public static void main(String[] args) {
		
		Avion a = new Avion();
		Helicoptero h = new Helicoptero();
		Superman s = new Superman();
		
		Volador[] voladores = new Volador[] {a,h,s};
		
		
		
		// Interace nombre = Interface();
		// no!!! porque las interfaces no se pueden instanciar.
		
		for(Volador v : voladores) {
			
			if (v instanceof Aterrizable) {
				
				Aterrizable atr = (Aterrizable)v;
				
				atr.aterrizar();
			}else {
				System.out.println(v+" - No puede aterrizar, no cumple contrato");
			}
		}
	}
}
