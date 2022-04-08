package ar.com.educacionit.domain;

import java.util.Date;

public class Articulos implements Entity {
	
	private Long id;
	private String titulo;
	private Date fechaCreacion;
	private String codigo;
	private Double precio;
	private Long stock;
	private Long marcasId;
	private Marcas marca;
	// un articulo puede tener una marca (objeto)
	private Long categoriasId;
	private Categorias categoria;
	
	
	// sobrecarga del constructor
	// dos constructores, uno tiene id y el otro no
	// si están desordenados, pueden tener los mismos atributos
	// el que no tiene el id no lo tiene porque al insertar un articulo en la base de
	// datos, esa generacion del id se hará de forma automática
	
	
	// hacia la base de datos
	// no es para generar un registro

	public Articulos(String titulo, Date fechaCreacion, String codigo, Double precio, Long stock, Long marcasId,
			Long categoriasId) {
		this.titulo = titulo;
		this.fechaCreacion = fechaCreacion;
		this.codigo = codigo;
		this.precio = precio;
		this.stock = stock;
		this.marcasId = marcasId;
		this.categoriasId = categoriasId;
	}

	public Articulos() {
		
	}

	// desde la base de datos
	public Articulos(Long id, String titulo, Date fechaCreacion, String codigo, Double precio, Long stock,
			Long marcasId, Long categoriasId) {
		this.id = id;
		this.titulo = titulo;
		this.fechaCreacion = fechaCreacion;
		this.codigo = codigo;
		this.precio = precio;
		this.stock = stock;
		this.marcasId = marcasId;
		this.categoriasId = categoriasId;
	}
	
	// constructor lo construimos con alt shift s: 
	// generate constructor using fields
	
	
	// puede haber sobrecarga de metodos también
	// se pueden llamar igual
	// el retorno no cuenta
	// los parametros tendrían que ser diferentes
	
	public Articulos(Long id, String titulo, Double precio) {
		this.id = id;
		this.titulo = titulo;
		this.precio = precio;
	}

	public Double getPrecio() {
		return this.precio;
	}
	
	public String getPrecio(String pattern) {
		//##,###,00
		return this.precio.toString();
	}
	
	public String getTitulo() {
		return titulo;
	}
	
	public String getTitulo(boolean isUpperCase) {
		if(isUpperCase) {
			return this.titulo.toUpperCase();
		}else {
			return this.titulo;
		}
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Date getFechaCreacion() {
		return fechaCreacion;
	}

	public void setFechaCreacion(Date fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public Long getStock() {
		return stock;
	}

	public void setStock(Long stock) {
		this.stock = stock;
	}

	public Long getMarcasId() {
		return marcasId;
	}

	public void setMarcasId(Long marcasId) {
		this.marcasId = marcasId;
	}

	public Long getCategoriasId() {
		return categoriasId;
	}

	public void setCategoriasId(Long categoriasId) {
		this.categoriasId = categoriasId;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getId() {
		return id;
	}

	public void setPrecio(Double precio) {
		this.precio = precio;
	}

	public Marcas getMarca() {
		return marca;
	}

	public void setMarca(Marcas marca) {
		this.marca = marca;
	}

	public Categorias getCategoria() {
		return categoria;
	}

	public void setCategoria(Categorias categoria) {
		this.categoria = categoria;
	}
	
 	public String toString() {
		return "Articulo [id=" + id + ", titulo=" + fechaCreacion + ", codigo=" + titulo + ", fechaCreacion=" + codigo
				+ ", precio=" + precio + ", stock=" + stock + ", marcasId=" + marcasId + ", categoriasId=" + categoriasId
				+ "]";
	}
	
}
