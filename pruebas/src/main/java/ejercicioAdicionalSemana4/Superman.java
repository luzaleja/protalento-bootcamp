package ejercicioAdicionalSemana4;

public class Superman extends Voladores{

	//atributos
	
	float altura;

	//constructor
	
	public Superman(String nombre, Float peso, float velocidadMaxima, float altura) {
		super(nombre, peso, velocidadMaxima);
		this.altura = altura;
	}

	//metodos

	public String toString() {
		return "Superman [nombre=" + nombre + ", peso=" + peso + ", velocidadMaxima=" + velocidadMaxima + ", altura="
				+ altura + "]";
	}

	public void detallar(){
		System.out.println(this.toString());
	}
	
	//getters y setters

	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}

	
}
