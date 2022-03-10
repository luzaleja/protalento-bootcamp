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

import ar.com.educacionit.domain.Articulos;

public class PDFCreator {

	public Document createPDFwithTable(String pdfName, String[] columnHeader, Collection<Articulos> collection) throws DocumentException, IOException {
		
		//
		Document document = new Document();
		
		File desktopDir = new File(System.getProperty("user.home"), "Desktop");
		String pathToDesktop = desktopDir.getPath();

		PdfWriter.getInstance(document, new FileOutputStream(new File(pathToDesktop,pdfName)));
		
		document.open();
		
		PdfPTable table = new PdfPTable(columnHeader.length);
		
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
	
	private void addRows(PdfPTable table, Collection<Articulos> collection, Font font) {
		for(Articulos art : collection) {
			//ahora podemos acceder a las celdas
			//titulo
			table.addCell(art.getTitulo());
			//codigo
			table.addCell(art.getCodigo());
			//precio
			String precio = Double.toString(art.getPrecio());
			table.addCell(precio);
			//stock
			String stock = Long.toString(art.getStock());
			table.addCell(stock);
			//marcasid
			String marcasId = Long.toString(art.getMarcaId());
			table.addCell(marcasId);
			//categoriasid
			String categoriasId = Long.toString(art.getCategoriaId());
			table.addCell(categoriasId);
		}
	}
}
