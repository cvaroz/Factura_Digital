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
public class Empresa {
    private int idEmpresa;
    private String nombre;
    private int cantidadRestanteFacturas;
    private int cedula;
    private int consecutivo_Ini;
    private String correo;
    private String estado;
    private byte[] logo;
    private int telefono;
    private String tipo_Persona;
    private List<Documento> documentos;
    private Plan plan;
    private List<Empresacliente> empresaclientes;
    private List<Empresausuario> empresausuarios;
    private List<Producto> productos;

    public Empresa() {
    }

    public Empresa(int idEmpresa, String nombre, int cantidadRestanteFacturas, int cedula, int consecutivo_Ini, String correo, String estado, byte[] logo, int telefono, String tipo_Persona, List<Documento> documentos, Plan plan, List<Empresacliente> empresaclientes, List<Empresausuario> empresausuarios, List<Producto> productos) {
        this.idEmpresa = idEmpresa;
        this.nombre = nombre;
        this.cantidadRestanteFacturas = cantidadRestanteFacturas;
        this.cedula = cedula;
        this.consecutivo_Ini = consecutivo_Ini;
        this.correo = correo;
        this.estado = estado;
        this.logo = logo;
        this.telefono = telefono;
        this.tipo_Persona = tipo_Persona;
        this.documentos = documentos;
        this.plan = plan;
        this.empresaclientes = empresaclientes;
        this.empresausuarios = empresausuarios;
        this.productos = productos;
    }

    public int getIdEmpresa() {
        return idEmpresa;
    }

    public void setIdEmpresa(int idEmpresa) {
        this.idEmpresa = idEmpresa;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidadRestanteFacturas() {
        return cantidadRestanteFacturas;
    }

    public void setCantidadRestanteFacturas(int cantidadRestanteFacturas) {
        this.cantidadRestanteFacturas = cantidadRestanteFacturas;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public int getConsecutivo_Ini() {
        return consecutivo_Ini;
    }

    public void setConsecutivo_Ini(int consecutivo_Ini) {
        this.consecutivo_Ini = consecutivo_Ini;
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

    public byte[] getLogo() {
        return logo;
    }

    public void setLogo(byte[] logo) {
        this.logo = logo;
    }

    public int getTelefono() {
        return telefono;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    public String getTipo_Persona() {
        return tipo_Persona;
    }

    public void setTipo_Persona(String tipo_Persona) {
        this.tipo_Persona = tipo_Persona;
    }

    public List<Documento> getDocumentos() {
        return documentos;
    }

    public void setDocumentos(List<Documento> documentos) {
        this.documentos = documentos;
    }

    public Plan getPlan() {
        return plan;
    }

    public void setPlan(Plan plan) {
        this.plan = plan;
    }

    public List<Empresacliente> getEmpresaclientes() {
        return empresaclientes;
    }

    public void setEmpresaclientes(List<Empresacliente> empresaclientes) {
        this.empresaclientes = empresaclientes;
    }

    public List<Empresausuario> getEmpresausuarios() {
        return empresausuarios;
    }

    public void setEmpresausuarios(List<Empresausuario> empresausuarios) {
        this.empresausuarios = empresausuarios;
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public void setProductos(List<Producto> productos) {
        this.productos = productos;
    }
}
