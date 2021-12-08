package ejercicioAdicionalSemana4;

public class Ovni extends Voladores{

	//atributos
	
	private String origen;
	private String color;
	private String formaDelOvni;
	
	//constructor
	
	public Ovni(String nombre, Float peso, float velocidadMaxima, String origen, String color, String formaDelOvni) {
		super(nombre, peso, velocidadMaxima);
		this.origen = origen;
		this.color = color;
		this.formaDelOvni = formaDelOvni;
	}

	//metodos

	public String toString() {
		return "Ovni [nombre=" + nombre + ", peso=" + peso + ", velocidadMaxima=" + velocidadMaxima + ", origen="
				+ origen + ", color=" + color + ", formaDelOvni=" + formaDelOvni + "]";
	}
	
	public void detallar() {
		System.out.println(this.toString());
	}

	//getters y setters
	
	public String getOrigen() {
		return origen;
	}

	public void setOrigen(String origen) {
		this.origen = origen;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getFormaDelOvni() {
		return formaDelOvni;
	}

	public void setFormaDelOvni(String formaDelOvni) {
		this.formaDelOvni = formaDelOvni;
	}
	
	
}
