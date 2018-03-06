package org.java;

import entidades.Cliente;
import entidades.Empresacliente;
import entidades.Factura;
import entidades.Item;
import entidades.Usuario;

public class PDFGeneratorTEST {

	public static void main(String[] args) {
		
		//Not completed test
		Factura factura = new Factura(); 
		
		
		Empresacliente empreClien = new Empresacliente();
		Item item = new Item();
		Usuario usuario = new Usuario();
		
		InvoicePDFGenerator pdfCreator = new InvoicePDFGenerator();
		pdfCreator.createPDF(factura);
	}

}
