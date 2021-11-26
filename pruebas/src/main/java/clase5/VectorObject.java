package clase5;

public class VectorObject {

	public static void main(String[] args) {

		// la base de todos los tipos de datos en java es OBJECT
		
		Object edad = 10;
		Object nombres = "carlos";
		Object flag = true;
		Object letra = 'a';
		
		// como los vectores deben tener en ellos solo elementos del mismo tipo
		// la unica forma para hacer esto con diferentes tipos de datos arriba
		// se deben definir como Object, y hacer el vector de Object
		
		Object[] datos = new Object[] {edad,nombres,flag,letra};
		
		// determinar que datos son de tipo boolean
		
		for ( Object dato : datos) {
			if (dato instanceof Boolean) {
				
				//casteo
				//como veo que es booleano,
				//lo puedo guardar como cool en otra variable
				boolean aux = (Boolean)dato;
				
				System.out.println("Hay uno boolean" + aux);
				
				// tipos de datos primitivos:
				// byte,short,int,long,float,double, char
				
				// tipos de datos wrapper
				// Byte,Short,Integer,Long,Float,Double, Character
			
				// int a = 15; este es solo el valor
				// Integer a1 = 15; este tiene metodos, etc
				// es decir, puedo hacer a1. (llamar metodo)
				
				
				//autoboxing
				// a1 = a; es 25 = 25
				// a = a1; es 25 = 25
				
				// String valor = "15";
				// a1 = Integer.parseInt(valor);
				
			}
		}

	}

}
