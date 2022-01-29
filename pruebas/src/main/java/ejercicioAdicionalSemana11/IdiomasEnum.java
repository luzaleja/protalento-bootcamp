package ejercicioAdicionalSemana11;

public enum IdiomasEnum {
	
	ES(new Espanol()),
	EN(new Ingles()),
	FR(new Frances()),
	DE(new Aleman()),;

	private IIdioma idioma;
	
	private IdiomasEnum(IIdioma idioma) {
		this.idioma = idioma;
	}

	public IIdioma getIdioma() {
		return this.idioma;
	}
	
}
