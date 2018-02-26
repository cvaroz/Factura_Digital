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
public class Empresausuario {
    private int idEmpresaUsuario;
    private Empresa empresa;
    private Rol rol;
    private Usuario usuario;

    public Empresausuario() {
    }

    public Empresausuario(int idEmpresaUsuario, Empresa empresa, Rol rol, Usuario usuario) {
        this.idEmpresaUsuario = idEmpresaUsuario;
        this.empresa = empresa;
        this.rol = rol;
        this.usuario = usuario;
    }

    public int getIdEmpresaUsuario() {
        return idEmpresaUsuario;
    }

    public void setIdEmpresaUsuario(int idEmpresaUsuario) {
        this.idEmpresaUsuario = idEmpresaUsuario;
    }

    public Empresa getEmpresa() {
        return empresa;
    }

    public void setEmpresa(Empresa empresa) {
        this.empresa = empresa;
    }

    public Rol getRol() {
        return rol;
    }

    public void setRol(Rol rol) {
        this.rol = rol;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }
}
