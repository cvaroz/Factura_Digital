/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.util.List;

/**
 *
 * @author Li
 */
public class Factura {
    private int idFactura;
    private int consecutivoFactura;
    private int estado;
    private double subtotal;
    private double total;
    private double totalImpuestoVenta;
    private List<Documento> documentos;
    private List<Empresacliente> empresaclientes;
    private Usuario usuario;
    private List<Item> items;
    private List<Recibo> recibos;
}
