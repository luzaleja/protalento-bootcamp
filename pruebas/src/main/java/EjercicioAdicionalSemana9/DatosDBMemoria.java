package EjercicioAdicionalSemana9;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class DatosDBMemoria {

	private Set<Inscripcion> inscrip = new HashSet<>();
	
	public void agregarInscripcion(Inscripcion inscripcion) {
		inscrip.add(inscripcion);
	}
	
	public void borrarInscripcion(Long id) {
		Iterator<Inscripcion> iInscripcion = inscrip.iterator();
		while(iInscripcion.hasNext()) {
			Inscripcion inscripTemp = iInscripcion.next();
			if(inscripTemp.getIdInscripcion() == id) {
				iInscripcion.remove();
			}
		}
	}
	
	public void buscarInscripcion(Long id) {
		Iterator<Inscripcion> iInscripcion = inscrip.iterator();
		while(iInscripcion.hasNext()) {
			Inscripcion inscripTemp = iInscripcion.next();
			if(inscripTemp.getIdInscripcion() == id) {
				System.out.println(inscripTemp);
			}
		}
	}
	
	public boolean buscar(Long id) {
		Iterator<Inscripcion> iInscripcion = inscrip.iterator();
		int repeticiones = 0;
		boolean encontro = false;
		while(iInscripcion.hasNext()) {
			Inscripcion inscripTemp = iInscripcion.next();
			if(inscripTemp.getIdInscripcion() == id) {
				repeticiones++;
			}
		}
		if(repeticiones != 0) {
			encontro = true;
		}
		return encontro;
	}
}