package ar.com.educacionit.generic;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

import javax.servlet.http.Part;

import ar.com.educacionit.domain.Articulos;

public class CSVFileParser extends BaseFile implements IParser<Collection<Articulos>> {
	
	public CSVFileParser(Part filePart) {
		super(filePart);
	}
	public CSVFileParser(String path) {
		super(path);
	}

	//implementar el metodo generico de IFileParser, dandode un tipo concreto
	public Collection<Articulos> parseV2() throws ParseException {
		
		//armamos la coleccion donde vamos a guardar los datos
		Collection<Articulos> articulos = new ArrayList<>();
		
		//aca va la logica de lectura del file
		File file = new File(super.getFilePath());
		
		//verifico si existe el file
		if(!file.exists()) {
			//el negocio dice que pasa si no existe el archivo
			throw new ParseException("No existe el archivo: " + super.getFilePath());
		}
		
		//leemos archivos
		try (FileReader fileReader = new FileReader(file);){
			
			try(BufferedReader br = new BufferedReader(fileReader);) {
				
				//leer la primer linea para descartar los titulos
				String lineaLeida = br.readLine();
				
				//seguimos a la siguiente linea
				//si la siguiente linea no tiene nada, lineaLeida sería null
				lineaLeida = br.readLine();
				
				//leemos el resto de lineas
				while(lineaLeida != null) {
					//ahora que tengo la linea (linea 51), tengo que partirlo
					//por el ; , y guardar en un array de String
					
					//logica de parseo
					String[] datos = lineaLeida.split(";");
					
					String id = datos[0];
					String titulo = datos[1];
					String precio = datos[2];
					
					//creo el articulo con los datos que lei del file
					Articulos unArticulo = new Articulos(Long.parseLong(id),titulo,Double.parseDouble(precio));
					
					//agregamos el articulo a la coleccion del metodo
					articulos.add(unArticulo);
					
					//paso a la siguiente linea
					lineaLeida = br.readLine();
				}
			}
		} catch (IOException e) {
			throw new ParseException(e.getMessage(),e);
		} 
		
		return articulos;
	}
	
	public Collection<Articulos> parse() throws ParseException {
		
		InputStream is = null;
		FileReader fileReader = null;
		BufferedReader br = null;
		
		try {
			//detectar si tiene path como String o Part
			if(this.filePart != null) {
				is = filePart.getInputStream();
				br = new BufferedReader(new InputStreamReader(is));
			}else {
				File file = new File(super.getFilePath());
				if(!file.exists()) {
					throw new ParseException("No existe el archivo: " + super.getFilePath());
				}			
				fileReader = new FileReader(file);
				br = new BufferedReader(fileReader);
			}	
			return this.buildArchivos(br);
		} catch (IOException ie) {
			throw new ParseException(ie.getMessage(),ie);
		} finally {
			if(br != null) {
				try {
					br.close();
				} catch (IOException e) {
					throw new ParseException(e.getMessage(),e);
				}
			}
		}
	}

	private Collection<Articulos> buildArchivos(BufferedReader br) throws IOException {
		Collection<Articulos> articulos = new ArrayList<>();

		String lineaLeida = br.readLine();
		
		//vuelvo a leer para tomar los "registros"
		lineaLeida = br.readLine();
		
		Date fechaCrecion = new Date();
		while(lineaLeida != null) {
			
			String[] datos = lineaLeida.split(";"); 
			String titulo = datos[0];// => titulo
			String codigo = datos[1];// => titulo
			String precio = datos[2];// => precio
			String stock = datos[3];// => stock
			String categoria = datos[4];// => categoria
			String marca = datos[5];// => marca
		
			//validador!!
			//Validador.getValidar(Enum.paraArticulo).validate(datos);
						
			Articulos unArticulo = new Articulos(
				titulo,fechaCrecion,codigo,Double.parseDouble(precio),Long.parseLong(stock),Long.parseLong(marca), Long.parseLong(categoria)
			);
			
			articulos.add(unArticulo);
			lineaLeida = br.readLine();
		}
				
		return articulos;
	}
}
