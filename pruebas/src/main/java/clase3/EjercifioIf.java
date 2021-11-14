package clase3;

public class EjercifioIf {

	public static void main(String[] args) {
		// determinar dado 3 numeros
		//cual es el mayor
		
		//necesito 3 variables
		// if
		// mostrar el mayor
		
		double a,b,c;
		
		a = 11;
		b = 11.2;
		c = 10;
		
		// a > b y a > c
		// b > a y b > c
		// c > < y c > b
		// si a == b Y a == c
		
		if(a > b && a > c) {
			System.out.println(a + " es el mayor");
		}
		if(b > a && b > c) {
			System.out.println(b + " es el mayor");
		}
		if (c > a && c > b) {
			System.out.println(c + " es el mayor");
		}
		if (a == b & a == c) {
			System.out.println(a +", " + b + ", " + c +" son todos iguales");
		}
		

	}

}
