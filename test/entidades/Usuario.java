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
public class Usuario {
    private int idUsuario;
    private String correo;
    private String estado;
    private String nombreUsuario;
    private int telefono;
    private List<Empresausuario> empresausuarios;
    private List<Factura> facturas;

    public Usuario() {
    }

    public Usuario(int idUsuario, String correo, String estado, String nombreUsuario, int telefono, List<Empresausuario> empresausuarios, List<Factura> facturas) {
        this.idUsuario = idUsuario;
        this.correo = correo;
        this.estado = estado;
        this.nombreUsuario = nombreUsuario;
        this.telefono = telefono;
        this.empresausuarios = empresausuarios;
        this.facturas = facturas;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
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

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public List<Empresausuario> getEmpresausuarios() {
        return empresausuarios;
    }

    public void setEmpresausuarios(List<Empresausuario> empresausuarios) {
        this.empresausuarios = empresausuarios;
    }

    public List<Factura> getFacturas() {
        return facturas;
    }

    public void setFacturas(List<Factura> facturas) {
        this.facturas = facturas;
    }
}
