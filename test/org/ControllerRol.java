/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org;

import entidades.Rol;
import servicios.ServicioRol;

/**
 *
 * @author Li
 */
public class ControllerRol {
    ServicioRol servicioRol = new ServicioRol();

    public boolean insertarPlan(Rol r) {
        if (r != null) {
            return false;
        } else {
            return servicioRol.modify(r)!=false;
        }
    }

    public boolean modificarPlan(Rol r) {
        if (r != null) {
            return servicioRol.modify(r)!=false;
        } else {
            return false;
        }
    }

    public Rol leerPlan(Rol r) {
        if (r != null) {
            return servicioRol.read(r);
        }else 
            return null;
    }
    
    public boolean eliminarPlan(Rol r){
        if(r != null) {
            servicioRol.delete(r);
            return true;
        } else {
            return false;
        }
    }
}
