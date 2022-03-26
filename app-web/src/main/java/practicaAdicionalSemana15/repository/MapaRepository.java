package practicaAdicionalSemana15.repository;

import java.util.HashMap;
import java.util.Map;

import practicaAdicionalSemana15.entidades.Formulario;

public class MapaRepository {
	
	private static Map<Long,Formulario> mapa = new HashMap<>();

	public static void addFormulario(Formulario form) {
		mapa.put(form.getDocumento(), form);
	}
	
	public static Formulario getFormulario(Long documento) {
		Formulario formEncontrado = mapa.get(documento);
		return formEncontrado;
	}
	
	public static Map<Long,Formulario> getMapa() {
		return mapa;
	}
}