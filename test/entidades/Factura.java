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

    public Factura() {
    }

    public Factura(int idFactura, int consecutivoFactura, int estado, double subtotal, double total, double totalImpuestoVenta, List<Documento> documentos, List<Empresacliente> empresaclientes, Usuario usuario, List<Item> items, List<Recibo> recibos) {
        this.idFactura = idFactura;
        this.consecutivoFactura = consecutivoFactura;
        this.estado = estado;
        this.subtotal = subtotal;
        this.total = total;
        this.totalImpuestoVenta = totalImpuestoVenta;
        this.documentos = documentos;
        this.empresaclientes = empresaclientes;
        this.usuario = usuario;
        this.items = items;
        this.recibos = recibos;
    }

    public int getIdFactura() {
        return idFactura;
    }

    public void setIdFactura(int idFactura) {
        this.idFactura = idFactura;
    }

    public int getConsecutivoFactura() {
        return consecutivoFactura;
    }

    public void setConsecutivoFactura(int consecutivoFactura) {
        this.consecutivoFactura = consecutivoFactura;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public double getSubtotal() {
        return subtotal;
    }

    public void setSubtotal(double subtotal) {
        this.subtotal = subtotal;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public double getTotalImpuestoVenta() {
        return totalImpuestoVenta;
    }

    public void setTotalImpuestoVenta(double totalImpuestoVenta) {
        this.totalImpuestoVenta = totalImpuestoVenta;
    }

    public List<Documento> getDocumentos() {
        return documentos;
    }

    public void setDocumentos(List<Documento> documentos) {
        this.documentos = documentos;
    }

    public List<Empresacliente> getEmpresaclientes() {
        return empresaclientes;
    }

    public void setEmpresaclientes(List<Empresacliente> empresaclientes) {
        this.empresaclientes = empresaclientes;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    public List<Recibo> getRecibos() {
        return recibos;
    }

    public void setRecibos(List<Recibo> recibos) {
        this.recibos = recibos;
    }
}
