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
public class Cliente {
    private int idClientes;
    private String correo;
    private String estado;
    private String nombreCliente;
    private int telefono;
    private List<Empresacliente> empresaclientes;

    public Cliente(int idClientes, String correo, String estado, String nombreCliente, int telefono, List<Empresacliente> empresaclientes) {
        this.idClientes = idClientes;
        this.correo = correo;
        this.estado = estado;
        this.nombreCliente = nombreCliente;
        this.telefono = telefono;
        this.empresaclientes = empresaclientes;
    }

    public Cliente() {
        
    }

    public int getIdClientes() {
        return idClientes;
    }

    public void setIdClientes(int idClientes) {
        this.idClientes = idClientes;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public List<Empresacliente> getEmpresaclientes() {
        return empresaclientes;
    }

    public void setEmpresaclientes(List<Empresacliente> empresaclientes) {
        this.empresaclientes = empresaclientes;
    }

}
