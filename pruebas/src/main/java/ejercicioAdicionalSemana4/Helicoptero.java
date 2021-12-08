package ejercicioAdicionalSemana4;

public class Helicoptero extends Voladores implements Aterrizable{

	//atributos
	
	private int numeroMaxDePasajeros;
	private float carga;
	private float velocidadDeCrucero;
	private float autonomia;
	private String marca;
	private String modelo;
	
	//constructor
	
	public Helicoptero(String nombre, Float peso, float velocidadMaxima, int numeroMaxDePasajeros, float carga,
			float velocidadDeCrucero, float autonomia, String marca, String modelo) {
		super(nombre, peso, velocidadMaxima);
		this.numeroMaxDePasajeros = numeroMaxDePasajeros;
		this.carga = carga;
		this.velocidadDeCrucero = velocidadDeCrucero;
		this.autonomia = autonomia;
		this.marca = marca;
		this.modelo = modelo;
	}
	
	//metodos
	
	public void aterrizar() {
	
		System.out.println("Tiene permiso para aterrizar"+"\n");
	}
	
		public String toString() {
		return "Helicoptero [nombre=" + nombre + ", peso=" + peso + ", velocidadMaxima=" + velocidadMaxima
				+ ", numeroMaxDePasajeros=" + numeroMaxDePasajeros + ", carga=" + carga + ", velocidadDeCrucero="
				+ velocidadDeCrucero + ", autonomia=" + autonomia + ", marca=" + marca + ", modelo=" + modelo + "]";
	}

	public void detallar() {
		System.out.println(this.toString());
	}
	
	//getters y setters
	
	public int getNumeroMaxDePasajeros() {
		return numeroMaxDePasajeros;
	}

	public void setNumeroMaxDePasajeros(int numeroMaxDePasajeros) {
		this.numeroMaxDePasajeros = numeroMaxDePasajeros;
	}

	public float getCarga() {
		return carga;
	}

	public void setCarga(float carga) {
		this.carga = carga;
	}

	public float getVelocidadDeCrucero() {
		return velocidadDeCrucero;
	}

	public void setVelocidadDeCrucero(float velocidadDeCrucero) {
		this.velocidadDeCrucero = velocidadDeCrucero;
	}

	public float getAutonomia() {
		return autonomia;
	}

	public void setAutonomia(float autonomia) {
		this.autonomia = autonomia;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	
	
}
