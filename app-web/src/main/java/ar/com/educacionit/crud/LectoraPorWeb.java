package ar.com.educacionit.crud;

public class LectoraPorWeb implements ILectora {

	private Data data;
	
	public LectoraPorWeb() {
	}

	@Override
	public Data leerDatos() {
		//hacemos como si hubera recibido unos datos de la web
		this.data.setId(1L);
		this.data.setTitulo("mouse");
		return this.data;
	}

}
