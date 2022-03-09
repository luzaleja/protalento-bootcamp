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
	
	public static void encontrarTodosLosArchivosDeUnaCarpeta(File folder) {
		for(File file : folder.listFiles()) {
			//Si no es un directorio, para e imprime el nombre del archivo
			//lo hace para los archivos pertenecientes a la lista de archivos 
			//encontrada por folder.listFiles()
			//cuando todo lo que encuentre sean archivos, terminará la ejecución
			//si encuentra un directorio dentro de folder.listFiles(), entrará a ese
			//directorio con el else
			if(!file.isDirectory()) {
				System.out.println(file.getName());
			} else {
			//si es un directorio, vuelve a usar el metodo para encontrar todos
				//los archivos que se encuentran dentro del directorio (carpeta/folder)
				encontrarTodosLosArchivosDeUnaCarpeta(file);
			}
		}
	}
}
