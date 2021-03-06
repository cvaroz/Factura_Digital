/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.test;

import entidades.Rol;
import servicios.ServicioRol;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean(name = "controllerRol")
@RequestScoped
public class ControllerRol {
    ServicioRol servicioRol = new ServicioRol();

    public boolean insertarRol(Rol r) throws Exception {
        if (r != null) {
            return false;
        } else {
            servicioRol.insert(r);
            return true;
        }
    }

    public boolean modificarRol(Rol r) throws Exception {
        if (r != null) {
            return servicioRol.modify(r)!=false;
        } else {
            return false;
        }
    }

    public Rol leerRol(Rol r) throws Exception {
        if (r != null) {
            return servicioRol.read(r);
        }else 
            return null;
    }
    
    public boolean eliminarRol(Rol r) throws Exception{
        if(r != null) {
            servicioRol.delete(r);
            return true;
        } else {
            return false;
        }
    }
}
