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
public class Empresacliente {
    private int idEmpresaCliente;
    private Cliente cliente;
    private Empresa empresa;
    private Factura factura;

    public Empresacliente() {
    }

    public Empresacliente(int idEmpresaCliente, Cliente cliente, Empresa empresa, Factura factura) {
        this.idEmpresaCliente = idEmpresaCliente;
        this.cliente = cliente;
        this.empresa = empresa;
        this.factura = factura;
    }

    public int getIdEmpresaCliente() {
        return idEmpresaCliente;
    }

    public void setIdEmpresaCliente(int idEmpresaCliente) {
        this.idEmpresaCliente = idEmpresaCliente;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
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
