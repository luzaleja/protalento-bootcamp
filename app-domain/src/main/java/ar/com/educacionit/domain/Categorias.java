package ar.com.educacionit.domain;

public class Categorias implements Entity {

	// atributos
	private Long id;
	private String descripcion;
	private String codigo;
	private Long habilitada;
	
	// constructor
	
	public Categorias () {
		//por defecto
	}
	
	
	public Categorias(Long id, String descripcion, String codigo) {
		super();
		this.id = id;
		this.descripcion = descripcion;
		this.codigo = codigo;
	}


	public Categorias(String descripcion, String codigo, Long habilitada) {
		super();
		this.descripcion = descripcion;
		this.codigo = codigo;
		this.habilitada = habilitada;
	}

	public Categorias(Long id,String descripcion, String codigo, Long habilitada) {
		super();
		this.id = id;
		this.descripcion = descripcion;
		this.codigo = codigo;
		this.habilitada = habilitada;
	}
	

	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getDescripcion() {
		return descripcion;
	}


	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}


	public String getCodigo() {
		return codigo;
	}


	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public Long getHabilitada() {
		return habilitada;
	}
	
	
	public void setHabilitada(Long habilitada) {
		this.habilitada = habilitada;
	}

	public String toString() {
		return "Categorias [id=" + id + ", descripcion=" + descripcion + ", codigo=" + codigo + "]";
	}


	
	
	
	
	
}
