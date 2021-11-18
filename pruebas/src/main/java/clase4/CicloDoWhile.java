package clase4;

public class CicloDoWhile {

	public static void main(String[] args) {
		
		byte [] edades = new byte [] {25,78,15,20,12};
		
		int i = 0;
		
		do {
			// este codigo se ejecutara al menos 1 vez
			System.out.println("pos:"+i+", val:"+edades[i]);
			i++;
		} while (i< edades.length );
		System.out.println("FIN");
	}

}
