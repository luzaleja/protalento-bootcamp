package ar.com.educacionit.generic;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import ar.com.educacionit.domain.Articulos;

public class XLSXFileParser extends BaseFile implements IParser<Collection<Articulos>> {

	public XLSXFileParser(String path) {
		super(path);
	}

	@Override
	public Collection<Articulos> parse() throws ParseException {
		
		//necesito:
		
		//libreria poi de apache
		
		//leer un binario
		File xlsxFile = new File(super.getFilePath());
		
		//creamos la collection que luego regresaremos en el return
		Collection<Articulos> articulos = new ArrayList<Articulos>();
		
		try(	
				InputStream xlsxInputStream = new FileInputStream(xlsxFile);
				Workbook workbook = new XSSFWorkbook(xlsxInputStream)
			) {
			
			//usamos las clases propias de la libreria
			//cambiamos de 0 a 1, para poder usar la hoja 2 del libro
			Sheet hojas = workbook.getSheetAt(1);
			
			//collection
			Iterator<Row> filasDeLaHoja0 = hojas.iterator();
			
			boolean primerFila = true; //decimos que la primera fila es true, para poder
			//saltarla
			
			while(filasDeLaHoja0.hasNext()) {
				Row filaActual = filasDeLaHoja0.next();
				if(primerFila) {
					primerFila = false;
					continue;
				}
				
				//ahora que saltamos la primera fila, empezamos a leer la segunda
				//donde empiezan los datos
				Iterator<Cell> celdas = filaActual.iterator();
				
				//ahora creo el articulo
				Articulos articulo = new Articulos();
				
				while(celdas.hasNext()) {
					
					fromCellToArticulos(celdas, articulo);
				}
				articulos.add(articulo);
			}
			
		} catch (IOException fnfe) {
			throw new ParseException("No se ha podido parsear el archivo: " + getFilePath(),fnfe);
		}
		
		return articulos;
	}

	//alt shift M
	//creamos un nuevo metodo desde el codigo que estaba escrito arriba
	private void fromCellToArticulos(Iterator<Cell> celdas, Articulos articulo) {
		Cell celdaActual = celdas.next();
		String valor;
		int indiceColumna = celdaActual.getColumnIndex(); // de 0 a n
		
		switch(indiceColumna) {
		case 0:
			valor = celdaActual.getStringCellValue();
			articulo.setTitulo(valor);
			break;
		case 1:
			valor = celdaActual.getStringCellValue();
			articulo.setCodigo(valor);
			break;
		case 2:
			Double valorD = celdaActual.getNumericCellValue();
			articulo.setPrecio(valorD);
			break;
		case 3: 
			Double stock = (Double)celdaActual.getNumericCellValue();
			articulo.setStock(stock.longValue());
			break;
		case 4:
			Double marcasId = (Double)celdaActual.getNumericCellValue();
			articulo.setMarcaId(marcasId.longValue());
			break;
		case 5:
			Double categoriasId = (Double)celdaActual.getNumericCellValue();
			articulo.setCategoriaId(categoriasId.longValue());
			break;
		default:
			break;
		}
		articulo.setFechaCreacion(new Date());
	}

	
}
