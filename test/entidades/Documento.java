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
public class Documento {
    private int idDocumento;
    private String nombreDocumento;
    private String ruta;
    private String tipoDocumento;
    private Empresa empresa;
    private Factura factura;

    public Documento(int idDocumento, String nombreDocumento, String ruta, String tipoDocumento, Empresa empresa, Factura factura) {
        this.idDocumento = idDocumento;
        this.nombreDocumento = nombreDocumento;
        this.ruta = ruta;
        this.tipoDocumento = tipoDocumento;
        this.empresa = empresa;
        this.factura = factura;
    }

    public Documento() {
    }

    public int getIdDocumento() {
        return idDocumento;
    }

    public void setIdDocumento(int idDocumento) {
        this.idDocumento = idDocumento;
    }

    public String getNombreDocumento() {
        return nombreDocumento;
    }

    public void setNombreDocumento(String nombreDocumento) {
        this.nombreDocumento = nombreDocumento;
    }

    public String getRuta() {
        return ruta;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }

    public String getTipoDocumento() {
        return tipoDocumento;
    }

    public void setTipoDocumento(String tipoDocumento) {
        this.tipoDocumento = tipoDocumento;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public Factura getFactura() {
        return factura;
    }

    public void setFactura(Factura factura) {
        this.factura = factura;
    }
}
