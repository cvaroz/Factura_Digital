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
public class Rol {
    private int idRol;
    private String descripcion_Role;
    private List<Empresausuario> empresausuarios;

    public Rol() {
    }

    public Rol(int idRol, String descripcion_Role, List<Empresausuario> empresausuarios) {
        this.idRol = idRol;
        this.descripcion_Role = descripcion_Role;
        this.empresausuarios = empresausuarios;
    }

    public int getIdRol() {
        return idRol;
    }

    public void setIdRol(int idRol) {
        this.idRol = idRol;
    }

    public String getDescripcion_Role() {
        return descripcion_Role;
    }

    public void setDescripcion_Role(String descripcion_Role) {
        this.descripcion_Role = descripcion_Role;
    }

    public List<Empresausuario> getEmpresausuarios() {
        return empresausuarios;
    }

    public void setEmpresausuarios(List<Empresausuario> empresausuarios) {
        this.empresausuarios = empresausuarios;
    }
}
