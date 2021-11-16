package pruebas;

public class Ejercicio3 {

	public static void main(String[] args) {
		// Ejercicio 1 Asignacion basica
		
		/*	|	x	|	y
		 A	|	10	|	20
		 B	|	15	|	30
		 C	|	10	|	20
		 D	|	30	|	100
		 E	|	15	|	25
		 
		 
		 OK
		 
		 */
		
		/* Ejercicio 2 Asignacion compacta
		 
		 *	|	x	|	y
		 A	|	10	|	20
		 B	|	15	|	5
		 C	|	16	|	4
		 D	|	64	|	-12
		 E	|	32	|	-3
		 
		 OK
		 
		 */

		/* Ejercicio 3 Operadores aritmeticos
		 
		 *	|	x	|	y
		 A	|	10	|	20
		 B	|	30	|	50
		 C	|	-20	|	70
		 D	|	-1400	|	1960000
		 E	|	1400	|	0
		 
		 OK
		 
		 */
		
		/* Ejercicio 4 Operadores aritmeticos
		 * con asignacion compacta
		 
		 *	|	x	|	y
		 A	|	5	|	10
		 B	|	15	|	25
		 C	|	-10	|	35
		 D	|	-350	|	-12250
		 E	|	0	|	1
		 
		 OK
		 
		 */
		
		/* Ejercicio 5 Operadores aritmeticos
		 * con asignacion multiple (suma y resta)
		 
		 *	|	x		|	y		| suma	| resta
		 A	|	5		|	10		|	0	|	0
		 B	|			|			|	15	|	-5
		 C	|			|			|	10	|	0
		 D	|			|			|	20	|	-20
		 E	|			|			|	20	|	-25
		 
		 OK
		 
		 */
		
		/* Ejercicio 6 Operadores aritmeticos
		 * con asignacion multiple (producto y division)
		 
		 *	|	x		|	y		| suma	| resta
		 A	|	5		|	10		|	1	|	1
		 B	|			|			|	50	|	0
		 C	|			|			|	25	|	1
		 D	|			|			|	250	|	2
		 E	|			|			|	-50	|	-2
		 
		 OK
		 
		 */
		
		/* Ejercicio 7 Resto
		 
		 *	|	n1	|	n2	|	n3	
		 A	|	20	|	2	|	0	
		 B	|	15	|	2	|	1	
		 C	|	3	|	20	|	2	
		 D	|	3	|	15	|	0		
		 
		 OK
		 
		 */
		
		/* Ejercicio 8 Cadena de caracteres
		 
		 *	|	p1	|	p2	 |	frase	
		 A	|	Hola|	Mundo|	""	
		 B	|	Hola|	Mundo|	"HolaMundo"	
		 C	|	Hola|	Mundo|	"Hola	Mundo"	
		 D	|	Hola|	Mundo|	"Hola
		 						Mundo"	
		 E	|		|		 |	"Hola
		 							Mundo"
		 							
		 OK
		 
		 */
		
		/* Ejercicio 9 Operadores logicos
		 
		 *	|	n1	|	n2	|	n3	|	n4
		 A	|	t	|	f	|	f	|	t
		 B	|	t	|	f	|	f	|	t
		 C	|	t	|	f	|	t	|	f
		 D	|	t	|	f	|	f	|	f
		 E 	|	t	|	f	|	t	|	f		 
		 OK
		 
		 */
		
		//----------------------------------
		
		//     BONUS
		
		//----------------------------------
		
		/* Ejercicio 1
		 Resolver los siguientes enunciados
		 
		*/
		
		//Dados
		
		int n1 = 5;
		int n2 = 10;
		int n3 = 20;
		
		System.out.println("a) n1+n2="+ (n1+n2));
		System.out.println("b) n3-n1="+ (n3-n1));
		System.out.println("c) n1*n3="+ (n1*n3));
		System.out.println("d) n3/n2="+ (n3/n2));
		
		/* Ejercicio 2
		 Resolver los siguientes enunciados
		 
		*/
		
		//Dados
		
		int na1 = 10;
		int na2 = 20;
		int na3 = 30;
		
		int total = na1 + na2 + na3;
		double promedio = total/3;
		int resto = na2 % na1;
				
		System.out.println("a) El total es "+ total);
		System.out.println("b) El promedio es "+promedio);
		System.out.println("c) El resto entre n2 y n1 es "+resto);
		
		/* Ejercicio 3
		 Resolver los siguientes enunciados
		 
		*/
		
		//Dados
		
		boolean nb1 = true;
		boolean nb2 = false;
		boolean nb3 = true;
		
		System.out.println("n1 ^ n2 = "+(nb1 ^ nb2));
		System.out.println("(n1 && !n2) || n3 = "+((nb1 && !nb2) || nb3));
		System.out.println("(n1||n2)&&!n3 = " + ((nb1||nb2)&&!nb3));
		
		/* Ejercicio 4
		 Declarar dos variables 
		 n1 = 5 y n2 = 10
		 Utilizando concatenacion entre las variables 
		 y los literales, mostrar en pantalla
		 la siguiente extresión:
		 
		 a) n1 es igual a 5
		 b) n2 es igual a 10
		 c) n1 mas n2 es igual a 15
		*/
		
		int nc1, nc2;
		nc1 = 5;
		nc2 = 10;
		
		System.out.println("a) n1 es igual a "+nc1+"\n"
				+ "n2 es igual a "+nc2+"\n"
				+ "n1 mas n2 es igual a "+(nc1+nc2));
		
		/* Ejercicio 5
		 Haciendo uso de la constante IVA = 21
		 calcular el precio con iva de los siguientes
		 productos e informar:
		 
		 remera: 59.90$
		 pantalon: 99.90$
		 campera: 149.90$
		*/
		
		final int IVA = 21;
		
		double remera, pantalon, campera;
		
		remera = 59.90;
		pantalon = 99.90;
		campera = 149.90;
		
		System.out.println("remera = "+(remera+(remera*IVA)/100));
		System.out.println("pantalon = "+(pantalon+(pantalon*IVA)/100));
		System.out.println("campera = "+(campera+(campera*IVA)/100));
		
		
	}

}
