package ar.com.educacionit.files;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class FileMain2 {

	public static void main(String[] args) throws IOException {

		File aFile = new File("C:\\Users\\luzal\\Desktop\\JAVA\\categorias\\texto.txt"); //puntero
		
		System.out.println(aFile.exists());
		
		if(aFile.exists()) {//primero tengo que revisar que el archivo exista
			
			//llamamos al lector de archivos
			try (FileReader fr = new FileReader(aFile);) {
				
				//tengo que leer mientras existan datos para leer
				int dato;
				while((dato = fr.read()) != -1) {
					System.out.print((char) dato);
				}
				
			} catch (Exception e) {
				System.err.println(e);
			}
			
		}
		
		//binario
		
		File aBFile = new File("C:\\Users\\luzal\\Desktop\\JAVA\\categorias\\binario.docx"); 
		
		if(aBFile.exists()) {
			
			InputStream is = new FileInputStream(aBFile);
			OutputStream os = new FileOutputStream("C:\\Users\\luzal\\Desktop\\JAVA\\categorias\\binarioCopia.docx");
		
			int length;
			byte[] buffer = new byte[1024];
			
			while((length = is.read(buffer)) > 0) {
				os.write(buffer,0,length);
			}
		
			is.close();
			os.close();
		}
	}	
}