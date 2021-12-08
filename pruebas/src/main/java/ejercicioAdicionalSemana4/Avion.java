package ejercicioAdicionalSemana4;

public class Avion extends Voladores implements Aterrizable{

	//atributos
	
	private int cantidadAsientos;
	private float pesoMaxAlDespegue;
	private float pesoMaxDeAterrizaje;
	private float cargaDeCombustibleMax;
	private float alcanceMaximo;
	
	//constructor
	
	public Avion(String nombre, Float peso, float velocidadMaxima, int cantidadAsientos, float pesoMaxAlDespegue,
			float pesoMaxDeAterrizaje, float cargaDeCombustibleMax, float alcanceMaximo) {
		super(nombre, peso, velocidadMaxima);
		this.cantidadAsientos = cantidadAsientos;
		this.pesoMaxAlDespegue = pesoMaxAlDespegue;
		this.pesoMaxDeAterrizaje = pesoMaxDeAterrizaje;
		this.cargaDeCombustibleMax = cargaDeCombustibleMax;
		this.alcanceMaximo = alcanceMaximo;
	}

	//metodos
	
	public void aterrizar() {

		System.out.println("Tiene permiso para aterrizar"+"\n");
	}
	
	public void detallar() {
		System.out.println(this.toString());
	}
	
	public String toString() {
		return "Avion [nombre=" + nombre + ", peso=" + peso + ", velocidadMaxima=" + velocidadMaxima
				+ ", cantidadAsientos=" + cantidadAsientos + ", pesoMaxAlDespegue=" + pesoMaxAlDespegue
				+ ", pesoMaxDeAterrizaje=" + pesoMaxDeAterrizaje + ", cargaDeCombustibleMax=" + cargaDeCombustibleMax
				+ ", alcanceMaximo=" + alcanceMaximo + "]";
	}

	//getters y setters

	public int getCantidadAsientos() {
		return cantidadAsientos;
	}

	public void setCantidadAsientos(int cantidadAsientos) {
		this.cantidadAsientos = cantidadAsientos;
	}



	public float getPesoMaxAlDespegue() {
		return pesoMaxAlDespegue;
	}



	public void setPesoMaxAlDespegue(float pesoMaxAlDespegue) {
		this.pesoMaxAlDespegue = pesoMaxAlDespegue;
	}



	public float getPesoMaxDeAterrizaje() {
		return pesoMaxDeAterrizaje;
	}



	public void setPesoMaxDeAterrizaje(float pesoMaxDeAterrizaje) {
		this.pesoMaxDeAterrizaje = pesoMaxDeAterrizaje;
	}



	public float getCargaDeCombustibleMax() {
		return cargaDeCombustibleMax;
	}



	public void setCargaDeCombustibleMax(float cargaDeCombustibleMax) {
		this.cargaDeCombustibleMax = cargaDeCombustibleMax;
	}



	public float getAlcanceMaximo() {
		return alcanceMaximo;
	}



	public void setAlcanceMaximo(float alcanceMaximo) {
		this.alcanceMaximo = alcanceMaximo;
	}

	
	
}
