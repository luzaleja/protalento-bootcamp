package ejercicioAdicionalSemana4;

public abstract class Voladores {

	//atributos
	
	protected String nombre;
	protected Float peso;
	protected float velocidadMaxima;
	
	//constructor
	
	public Voladores(String nombre, Float peso, float velocidadMaxima) {
		super();
		this.nombre = nombre;
		this.peso = peso;
		this.velocidadMaxima = velocidadMaxima;
	}

	//metodos
	
	public abstract void detallar();
	
	public void detalle() {
		detallar();
	}
	
	//getters y setters
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Float getPeso() {
		return peso;
	}

	public void setPeso(Float peso) {
		this.peso = peso;
	}

	public float getVelocidadMaxima() {
		return velocidadMaxima;
	}

	public void setVelocidadMaxima(float velocidadMaxima) {
		this.velocidadMaxima = velocidadMaxima;
	}
	
	
	
}
