/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.test;

import java.io.Serializable;


public class UsuarioData implements Serializable {
    
    private String user;
    private String nombre;
    private String descripcion;

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    
    public UsuarioData(String user, String nombre, String descripcion) {
        this.user = user;
        this.nombre = nombre;
        this.descripcion = descripcion;
    }
    
    
}
