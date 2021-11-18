package clase4;

public class CicloFor {

	public static void main(String[] args) {
		
		float[] alturas = new float[] {1,2};
		float aux = alturas [0];
		
		//o
		
		float[] alturas_ = new float [2];
		alturas_[0] = 1;
		alturas_[1] = 2;
		
		// arranca el ciclo for
		
		// for: se el tamaño
		// while: no se el tamaño
		
		
		
		for(int i=0; i< alturas.length;i++) {
		// int i=0 decirle donde inicia
		// i< .. , decirle hasta donde vamos
		// decirle que i se incremente de a 1
			//tambien se puede incrementar como queramos
			//ej, i+=2, de a 2
			
			aux = alturas[i];
			System.out.println("pos: "+ i + "val: "+ aux);	
		}
		
		//// for each
		
		for(float dato : alturas) {
			//damos el tipo, un nombre nuevo, : el array que usaremos
			System.out.println("val: "+dato);
			
			// el for each es bueno cuando no necesitamos la posicion
		}
	}	

}