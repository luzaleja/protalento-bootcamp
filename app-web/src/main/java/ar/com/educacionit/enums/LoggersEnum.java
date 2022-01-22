package ar.com.educacionit.enums;

public enum LoggersEnum {

	//Tiene un nombre y un valor de tipo String
	//los enum no necesitan valores! podria ser solo FS y CONSOLE, sin los parametros
	FS("FS"), //0 ("FS",1)
	CONSOLE("CONSOLE"); //1 ("CONSOLE",2)
	
	//un enum tiene un ordinal de valores, el primero esta guardado en 0, el siguiente en 1, etc
	
	//private String descripcion;
	private String valor;
	
	private LoggersEnum(String valor) { //(String descripcion, Integer valor)
		//necesito poder guardar el valor en algun lado, entonces defino un atributo
		//en este caso el constructor dice que recibe un String, entonces solo puede recibir strings en los parentesis
		this.valor = valor;
		//this.descripcion  = descripcion;
	}
	
	public String getValor() {
		return this.valor;
	}
	
	//le damos un metodo para poder pasarle al enum un valor desde afuera, para que lo revise y devuelva o no
	public static LoggersEnum getEnumFromStr (String strEnum) {
		LoggersEnum aux = null;
		if(strEnum != null) {
			LoggersEnum[] enums = LoggersEnum.values(); //values devuelve un vector de enums
			for(LoggersEnum _enum : enums) {
				if(strEnum.equalsIgnoreCase(_enum.getValor())) {
					aux = _enum;
					break;
				}
			}
		}
		return aux;
	}
	
}
