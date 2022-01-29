package ar.com.educacionit.files;

import java.io.File;

public class FileMain {

	public static void main(String[] args) {

		File aFile = new File("c:/carpeta"); //puntero
		
		boolean exists = aFile.exists();
		
		System.out.println(exists);
		
		System.out.println(aFile.isDirectory());
		
		//investigar algoritmo recursivo para mostrar los archivos de las carpetas
		//crear una funcion que devuelve un file recorrer
		//tiene un caso base .. que es lo que hace parar el algoritmo 
		
		
		System.out.println(aFile.isFile());
	}

	public File recorrer(File f) {
		if(!f.isDirectory()) {
			System.out.println(f.getName());
		}
		return f;
	}
}
