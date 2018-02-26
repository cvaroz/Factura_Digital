/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

/**
 *
 * @author Li
 */
public class Item {
    private int idItem;
    private int cantidad;
    private double descuento;
    private int producto_Empresa_Cedula;
    private int producto_Empresa_idEmpresa;
    private Factura factura;
    private Producto producto;

    public Item() {
    }

    public Item(int idItem, int cantidad, double descuento, int producto_Empresa_Cedula, int producto_Empresa_idEmpresa, Factura factura, Producto producto) {
        this.idItem = idItem;
        this.cantidad = cantidad;
        this.descuento = descuento;
        this.producto_Empresa_Cedula = producto_Empresa_Cedula;
        this.producto_Empresa_idEmpresa = producto_Empresa_idEmpresa;
        this.factura = factura;
        this.producto = producto;
    }

    public int getIdItem() {
        return idItem;
    }

    public void setIdItem(int idItem) {
        this.idItem = idItem;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
    }

    public int getProducto_Empresa_Cedula() {
        return producto_Empresa_Cedula;
    }

    public void setProducto_Empresa_Cedula(int producto_Empresa_Cedula) {
        this.producto_Empresa_Cedula = producto_Empresa_Cedula;
    }

    public int getProducto_Empresa_idEmpresa() {
        return producto_Empresa_idEmpresa;
    }

    public void setProducto_Empresa_idEmpresa(int producto_Empresa_idEmpresa) {
        this.producto_Empresa_idEmpresa = producto_Empresa_idEmpresa;
    }

    public Factura getFactura() {
        return factura;
    }

    public void setFactura(Factura factura) {
        this.factura = factura;
    }

    public Producto getProducto() {
        return producto;
    }

    public void setProducto(Producto producto) {
        this.producto = producto;
    }
}
