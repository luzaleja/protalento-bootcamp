package ar.com.educacionit.crud;

import java.util.HashMap;
import java.util.Map;

public class CreadorDeEjecutables {
	
	private static Map<Integer,Ejecutable> opcionesMap = crearOpciones();

	private static Map<Integer,Ejecutable> crearOpciones() {
		//creo el mapa que asocia opcion con una accion determinada
		Map<Integer, Ejecutable> opciones = new HashMap<>();
				
		//cargo el mapa con las opciones
		//cargo un objeto instanciado que implementa ejecutable
		//por ejemplo, new Alta()
		//no podria ser directamente la clase Alta(), porque esa es una clase por si misma
		//por eso tenemos que traer una instancia nueva de Alta()
		opciones.put(1, new Alta());
		opciones.put(2, new Baja());
		opciones.put(3, new Modificar());
		opciones.put(4, new Eliminar());
		
		return opciones;
	}
	
	public static Ejecutable obtenerEjecutable(Integer opcionBuscada) throws Exception {
		if(opcionesMap.containsKey(opcionBuscada)) {
			return opcionesMap.get(opcionBuscada);
		}
		throw new Exception("No existe Ejecutable asociado a la clave: " + opcionBuscada);
	}
}
