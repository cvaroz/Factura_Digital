/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.util.Date;

/**
 *
 * @author Li
 */
public class Recibo {
    private int idRecibo;
    private Date fecha;
    private double montoPagado;
    private double montoRestante;
    private Factura factura;

    public Recibo() {
    }

    public Recibo(int idRecibo, Date fecha, double montoPagado, double montoRestante, Factura factura) {
        this.idRecibo = idRecibo;
        this.fecha = fecha;
        this.montoPagado = montoPagado;
        this.montoRestante = montoRestante;
        this.factura = factura;
    }

    public int getIdRecibo() {
        return idRecibo;
    }

    public void setIdRecibo(int idRecibo) {
        this.idRecibo = idRecibo;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public double getMontoPagado() {
        return montoPagado;
    }

    public void setMontoPagado(double montoPagado) {
        this.montoPagado = montoPagado;
    }

    public double getMontoRestante() {
        return montoRestante;
    }

    public void setMontoRestante(double montoRestante) {
        this.montoRestante = montoRestante;
    }

    public Factura getFactura() {
        return factura;
    }

    public void setFactura(Factura factura) {
        this.factura = factura;
    }
}
