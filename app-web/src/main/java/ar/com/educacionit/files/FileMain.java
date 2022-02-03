package ar.com.educacionit.files;

import java.io.File;

public class FileMain {

	public static void main(String[] args) {

		File aFile = new File("C:\\Users\\luzal\\Desktop\\JAVA\\categorias"); //puntero
		
		boolean exists = aFile.exists();
		
		System.out.println(exists);
		
		System.out.println(aFile.isDirectory());
		
		System.out.println(aFile.isFile());
		
		//investigar algoritmo recursivo para mostrar los archivos de las carpetas
		//crear una funcion que devuelve un file recorrer
		//tiene un caso base .. que es lo que hace parar el algoritmo 
		
	}

	public File recorrer(File f) {
		if(!f.isDirectory()) {
			System.out.println(f.getName());
		}
		return f;
	}
}
