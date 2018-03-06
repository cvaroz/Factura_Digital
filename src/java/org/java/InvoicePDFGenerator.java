package org.java;

import java.io.FileOutputStream;
import java.io.IOException;
import java.text.DecimalFormat;
import java.util.Date;

import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Image;
import com.itextpdf.text.PageSize;
import com.itextpdf.text.pdf.BaseFont;
import com.itextpdf.text.pdf.PdfContentByte;
import com.itextpdf.text.pdf.PdfWriter;

import entidades.Factura;
import entidades.Item;

public class InvoicePDFGenerator {
	private BaseFont bfBold;
    private BaseFont bf;
    private int pageNumber = 0;

//README README README
/* This class its the pdf generator from the invoice. This class takes a "factura" 
 * object and convert it in a pdf as a Java Document type. It's tested just one time. 
 * It's a generic class from internet working with iText library. It's NOT made by me,
 * just addapted for this project.
 * 
 * I'M SORRY WITH YOU GUYS, I'M REALLY BUSY AT WORK AND WHEN I TAKE THIS PROJECT I
 * CAN'T UNDERSTAND HOW THINGS WORK HERE.
 */
 public Document createPDF (Factura factura){

  Document doc = new Document();
  PdfWriter docWriter = null;
  initializeFonts();

  try {
   String path = "documentos/factura";
   docWriter = PdfWriter.getInstance(doc , new FileOutputStream(path));
   doc.addAuthor(factura.getUsuario().getCorreo());
   doc.addCreationDate();
   doc.addProducer();
   doc.addCreator("Factura_Digital");
   doc.addTitle("Invoice");
   doc.setPageSize(PageSize.LETTER);

   doc.open();
   PdfContentByte cb = docWriter.getDirectContent();
   
   boolean beginPage = true;
   int y = 0;
   
   for(int i=0; i < 100; i++ ){
    if(beginPage){
     beginPage = false;
     generateLayout(doc, cb, factura); 
     generateHeader(doc, cb, factura);
     y = 615; 
    }
    generateDetail(doc, cb, i, y, factura);
    y = y - 15;
    
    if(y < 50){
     printPageNumber(cb);
     doc.newPage();
     beginPage = true;
    }
   }
   printPageNumber(cb);

  }
  catch (DocumentException dex)
  {
   dex.printStackTrace();
  }
  catch (Exception ex)
  {
   ex.printStackTrace();
  }
  finally
  {
   if (doc != null)
   {
    doc.close();
   }
   if (docWriter != null)
   {
    docWriter.close();
   }
  }
  return doc;
 }

 private void generateLayout(Document doc, PdfContentByte cb, Factura factura)  {

  try {

   cb.setLineWidth(1f);

   // Invoice Header box layout
   cb.rectangle(420,700,150,60);
   cb.moveTo(420,720);
   cb.lineTo(570,720);
   cb.moveTo(420,740);
   cb.lineTo(570,740);
   cb.moveTo(480,700);
   cb.lineTo(480,760);
   cb.stroke();

   // Invoice Header box Text Headings 
   createHeadings(cb,422,743,"Usuario ID");
   createHeadings(cb,422,723,"Consecutivo");
   createHeadings(cb,422,703,"Fecha");

   // Invoice Detail box layout 
   cb.rectangle(20,50,550,600);
   cb.moveTo(20,630);
   cb.lineTo(570,630);
   cb.moveTo(50,50);
   cb.lineTo(50,650);
   cb.moveTo(150,50);
   cb.lineTo(150,650);
   cb.moveTo(430,50);
   cb.lineTo(430,650);
   cb.moveTo(500,50);
   cb.lineTo(500,650);
   cb.stroke();

   // Invoice Detail box Text Headings 
   createHeadings(cb, 22, 633, "Cantidad");
   createHeadings(cb, 52, 633, "Codigo");
   createHeadings(cb, 82, 633, "Nombre");
   createHeadings(cb, 102, 633, "Descripcion");
   createHeadings(cb, 302, 633, "Precio");
   createHeadings(cb, 332, 633, "Impuesto");
   
   //add the images
   Image companyLogo = Image.getInstance("../assets/factura-electronica-que-es.png");
   companyLogo.setAbsolutePosition(25,700);
   companyLogo.scalePercent(25);
   doc.add(companyLogo);

  }

  catch (DocumentException dex){
   dex.printStackTrace();
  }
  catch (Exception ex){
   ex.printStackTrace();
  }

 }
 
 private void generateHeader(Document doc, PdfContentByte cb, Factura factura)  {

  try {
	  
   createHeadings(cb,200,750,"Estado: " + factura.getEstado());
   createHeadings(cb,200,735,"Subtotal: " + factura.getSubtotal());
   createHeadings(cb,200,720,"Impuesto: " + factura.getTotalImpuestoVenta());
   createHeadings(cb,200,705,"Total: " + factura.getTotal());
   
   createHeadings(cb,482,743, factura.getUsuario().getNombreUsuario());
   
   String consecutivo = Integer.toString(factura.getConsecutivoFactura());
   createHeadings(cb,482,723, consecutivo);
   
   Date date = new Date();
   String fecha = date.toString();
   createHeadings(cb,482,703, fecha);

  }

  catch (Exception ex){
   ex.printStackTrace();
  }

 }
 
 private void generateDetail(Document doc, PdfContentByte cb, int index, int y, Factura factura)  {
  DecimalFormat df = new DecimalFormat("0.00");
  
  try {
	  for (Item item : factura.getItems()) {
		   createContent(cb, 22, y, Integer.toString(item.getCantidad()), PdfContentByte.ALIGN_CENTER);
		   createContent(cb, 52, y, Integer.toString(item.getId()), PdfContentByte.ALIGN_CENTER);
		   createContent(cb, 82, y, item.getProducto().getNombre(), PdfContentByte.ALIGN_CENTER);
		   createContent(cb, 102, y, item.getProducto().getDescripcion(), PdfContentByte.ALIGN_CENTER);
		   createContent(cb, 302, y, Double.toString(item.getProducto().getPrecio()), PdfContentByte.ALIGN_CENTER);
		   createContent(cb, 332, y, Double.toString(item.getProducto().getImpuestoVenta()), PdfContentByte.ALIGN_CENTER);
	  }
  }

  catch (Exception ex){
	  ex.printStackTrace();
  }

 }

 private void createHeadings(PdfContentByte cb, float x, float y, String text){


  cb.beginText();
  cb.setFontAndSize(bfBold, 8);
  cb.setTextMatrix(x,y);
  cb.showText(text.trim());
  cb.endText(); 

 }
 
 private void printPageNumber(PdfContentByte cb){


  cb.beginText();
  cb.setFontAndSize(bfBold, 8);
  cb.showTextAligned(PdfContentByte.ALIGN_RIGHT, "Page No. " + (pageNumber+1), 570 , 25, 0);
  cb.endText(); 
  
  pageNumber++;
  
 }
 
 private void createContent(PdfContentByte cb, float x, float y, String text, int align){


  cb.beginText();
  cb.setFontAndSize(bf, 8);
  cb.showTextAligned(align, text.trim(), x , y, 0);
  cb.endText(); 

 }

 private void initializeFonts(){


  try {
   bfBold = BaseFont.createFont(BaseFont.HELVETICA_BOLD, BaseFont.CP1252, BaseFont.NOT_EMBEDDED);
   bf = BaseFont.createFont(BaseFont.HELVETICA, BaseFont.CP1252, BaseFont.NOT_EMBEDDED);

  } catch (DocumentException e) {
   e.printStackTrace();
  } catch (IOException e) {
   e.printStackTrace();
  }


 }
}
