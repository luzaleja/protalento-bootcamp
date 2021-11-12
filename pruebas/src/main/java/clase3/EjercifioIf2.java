package clase3;

public class EjercifioIf2 {

	public static void main(String[] args) {
		// determinar dado 3 numeros
		//cual es el mayor
		
		//necesito 3 variables
		// if
		// mostrar el mayor
		
		double a,b,c;
		
		a = 18;
		b = 18;
		c = 19;
		
		// a > b y a > c
		// b > a y b > c
		// c > < y c > b
		
		if(a > b && a > c) {
			System.out.println(a + " es el mayor");
		}
		if(b > a && b > c) {
			System.out.println(b + " es el mayor");
		}
		if (c > a && c > b) {
			System.out.println(c + " es el mayor");
		}
		
		if (a==b && a > c) {
			System.out.println(a + " es el mayor");
		}
		if (b==c && b > a) {
			System.out.println(b + " es el mayor");
		}
		if (a==c && c > b) {
			System.out.println(c + " es el mayor");
		}
		
		

	}

}
