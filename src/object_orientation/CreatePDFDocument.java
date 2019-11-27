package object_orientation;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Font;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.pdf.PdfWriter;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Arrays;

public class CreatePDFDocument {

    public static void main(String[] args) throws DocumentException, FileNotFoundException {
        var doc = new Document();
        PdfWriter.getInstance(doc, new FileOutputStream("ObjectMethods.pdf"));
        doc.open();

        var bold = new Font(Font.FontFamily.HELVETICA, 18, Font.BOLD);
        var paragraph = new Paragraph("Methods in Object Class");

        var table = new PdfPTable(1);

        Arrays.stream(Object.class.getMethods())
              .map(method -> method.toString())
              .forEach(table::addCell);

        paragraph.add(table);
        doc.add(paragraph);
        doc.close();
    }
}