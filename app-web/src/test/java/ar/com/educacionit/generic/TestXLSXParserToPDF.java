package ar.com.educacionit.generic;

import java.io.IOException;
import java.util.Collection;

import com.itextpdf.text.DocumentException;

import ar.com.educacionit.domain.Articulos;

public class TestXLSXParserToPDF {

	public static void main(String[] args) throws ParseException, DocumentException, IOException {

		String path = "./src/main/java/ar/com/educacionit/generic/articulos.xlsx"; 
		
		IParser<Collection<Articulos>> xlsxParser = new XLSXFileParser(path);

		Collection<Articulos> articulos = xlsxParser.parse();
	
		String[] columnHeader = new String[] {"TITULO","CODIGO","PRECIO","STOCK","MARCASID","CATEGORIASID"};
		
		PDFCreator<Articulos> pdfCreator = new PDFCreator<>();
		
		String pdfName = "ArticulosHoja2.pdf";
		
		pdfCreator.createPDFwithTable(6, pdfName, columnHeader, articulos);
		
		System.out.println("El archivo PDF se guardó en su escritorio con el nombre ArticulosHoja2.pdf.");
		
	}

}
