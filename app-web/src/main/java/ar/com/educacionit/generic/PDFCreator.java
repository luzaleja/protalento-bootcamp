package ar.com.educacionit.generic;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Collection;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Font;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.BaseFont;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

public class PDFCreator <T> {

	public Document createPDFwithTable(int numberOfColumns, String pdfName, String[] columnHeader, Collection<T> collection) throws DocumentException, IOException {
		
		//
		Document document = new Document();
		
		File desktopDir = new File(System.getProperty("user.home"), "Desktop");
		String pathToDesktop = desktopDir.getPath();

		PdfWriter.getInstance(document, new FileOutputStream(new File(pathToDesktop,pdfName)));
		
		document.open();
		
		PdfPTable table = new PdfPTable(numberOfColumns);
		
		BaseFont bf = BaseFont.createFont(BaseFont.COURIER,BaseFont.CP1250,false);
		Font courier = new Font(bf, 10, Font.NORMAL, BaseColor.BLACK);
		
		addTableHeader(table,columnHeader,courier);
		addRows(table,collection,courier);
		
		document.add(table);
		
		document.close();
		
		return document;
		
	}
	
	private void addTableHeader(PdfPTable table,String[] columnHeader, Font font) {
		
		for(String column : columnHeader) {
			PdfPCell header = new PdfPCell();
			//lo va haciendo por celda
			header.setBackgroundColor(BaseColor.LIGHT_GRAY);
			header.setBorderWidth(2);
			header.setPhrase(new Phrase(column,font));
			table.addCell(header);
		}
		
	}
	
	private void addRows(PdfPTable table, Collection<T> collection, Font font) {
		for(T element : collection) {
			int elementSize = table.getNumberOfColumns();
			for(int i = 0; i < elementSize; i++) {
				//ahora podemos acceder a las celdas
				Phrase ph = new Phrase(String.valueOf(element),font);
				table.addCell(ph);
			}
		}
	}
}
