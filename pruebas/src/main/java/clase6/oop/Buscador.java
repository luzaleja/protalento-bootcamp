package clase6.oop;

public class Buscador {

	private String claveBusqueda;
	private Articulo[] resultados;
	
	private Integer cantidadResultados;
	// al crear clases NO se deben generar atributos publicos!!!!!!
	// a veces se puede con constantes.. pero mejor NO
	
	
	public Buscador() {
		
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
		if(this.cantidadResultados == null) {
			this.setCantidadResultados(0);
		}
		return this.cantidadResultados;
	}
	
	void definirClaveBusqueda(String clave) {
		claveBusqueda = clave;
	}
	
	
	public void mostrarResultados() {
		if(this.resultados.length > 0) {
			for(Articulo aux : this.resultados ) {
				aux.detalleArticulo();
			}
		}else {
			System.out.println("No hay resultados para " + this.claveBusqueda);
		}
	}
}
