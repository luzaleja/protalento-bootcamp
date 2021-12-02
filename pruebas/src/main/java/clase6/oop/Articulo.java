package clase6.oop;

public class Articulo {

	//atributos
	private String titulo;
	private float precio;
	private String imagen;
	private boolean favorito;
	private boolean envioGratis;
	private boolean tieneDescuento;
	private boolean tieneCuotas;
	private int cantidad;
	
	//constructor
	public Articulo(String titulo, float precio, String imagen, boolean favorito, int cantidad, boolean tieneCuotas) {
		if(precio > 20000) {
			this.envioGratis = true;
		}
		this.favorito = favorito;
		this.precio = precio;
		this.titulo = titulo;
		this.imagen = imagen;
		this.cantidad = cantidad;
		this.tieneCuotas = tieneCuotas;
	}
	
	//generate getters and setters alt shift s
	//se hacen getters y setters para que se puedan acceder a los atributos desde afuera
	//por ejemplo si quieren ver a la imagen, afuera del buscador, se haría con un get
	
	public boolean isFavorito() {
		return favorito;
	}


	public void setFavorito(boolean favorito) {
		this.favorito = favorito;
	}


	public boolean isEnvioGratis() {
		return envioGratis;
	}


	public void setEnvioGratis(boolean envioGratis) {
		this.envioGratis = envioGratis;
	}


	public boolean isTieneDescuento() {
		return tieneDescuento;
	}


	public void setTieneDescuento(boolean tieneDescuento) {
		this.tieneDescuento = tieneDescuento;
	}


	public String getTitulo() {
		//podriamos poner que todos los titulos se muestren en mayusculas
		// minuscula .toLowerCase();
		return titulo.toUpperCase();
	}


	public float getPrecio() {
		return precio;
	}


	public String getImagen() {
		return imagen;
	}


	public boolean isTieneCuotas() {
		return tieneCuotas;
	}


	public int getCantidad() {
		return cantidad;
	}


	public void agregarAFavorito() {
		this.favorito = !this.favorito;
	}
	
	public void detalleArticulo() {
		System.out.println("Titulo:" + this.titulo);
		System.out.println("Precio:" + this.precio);
		System.out.println("Imagen:" + this.imagen);
		System.out.println("Favorito:" + this.favorito);
		System.out.println("Cantidad:" + this.cantidad);
		System.out.println("Cuotas:" + this.tieneCuotas);
		
	}
}
