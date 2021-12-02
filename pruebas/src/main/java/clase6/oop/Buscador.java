package clase6.oop;

public class Buscador {

	private String claveBusqueda;
	private Articulo[] resultados;
	
	private Integer cantidadResultados;
	// al crear clases NO se deben generar atributos publicos!!!!!!
	// a veces se puede con constantes.. pero mejor NO
	
	
	public Buscador() {
		System.out.println("Creando buscador...");
	}
	
	public void buscar() {
		System.out.println("buscando..." + this.claveBusqueda);
		
		// como mi buscador necesita usar un objeto de la clase DB
		// debe instanciar un objeto de dicha clase
		DB db = new DB();
		
		this.resultados = db.consultar(claveBusqueda);
		
		//invocamos a un metodo interno (privado)
		// pasando el tamaño del vector como parametro
		this.setCantidadResultados(this.resultados.length);
	}
	
	// el propio buscador dice cuantos resultados encontró
	// por eso puede ser privado
	private void setCantidadResultados(int cantidad) {
		if(cantidad < 0 ) { // porque no puede encontrar -1 resultados
			this.cantidadResultados = 0;
		}else {
			this.cantidadResultados = cantidad;
		}
	}
	
	public Integer getCantidadResultados() {
		// como cantidadResultados es un objeto, el default es null
		// como no queremos que regrese cantidad null, 
		// le decimos que si encuentra null, nos diga que los resultados son 0
		if(this.cantidadResultados == null) {
			this.setCantidadResultados(0);
		}
		return this.cantidadResultados;
	}
	
	/*void definirClaveBusqueda(String clave) {
		claveBusqueda = clave;
	}
	*/
	
		public void mostrarResultados() {
		if(this.resultados.length > 0) {
			for(Articulo aux : this.resultados ) {
				aux.detalleArticulo();
			}
		}else {
			System.out.println("No hay resultados para " + this.claveBusqueda);
		}
	}

	public String getClaveBusqueda() {
		return claveBusqueda;
	}

	public void setClaveBusqueda(String claveBusqueda) {
		this.claveBusqueda = claveBusqueda;
	}

	public Articulo[] getResultados() {
		return resultados;
	}
	
	// No setResultados porque los resultados se definen dentro de la clase
	// no se definiran desde afuera, sino por medio del buscador y la DB
}
