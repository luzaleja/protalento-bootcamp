package practicaAdicionalSemana16.entities;

public class Carrousel {
	
	private Long id;
	private String descripcion;
	private String imagen;
	private Integer activo;
	
	
	public Carrousel() {

	}

	public Carrousel(Long id, String descripcion, String imagen, Integer activo) {
		this.id = id;
		this.descripcion = descripcion;
		this.imagen = imagen;
		this.activo = activo;
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

	public String getImagen() {
		return imagen;
	}

	public void setImagen(String imagen) {
		this.imagen = imagen;
	}

	public Integer getActivo() {
		return activo;
	}

	public void setActivo(Integer activo) {
		this.activo = activo;
	}

	@Override
	public String toString() {
		return "Carrousel [id=" + id + ", descripcion=" + descripcion + ", imagen=" + imagen + ", activo=" + activo
				+ "]";
	}
	
}
