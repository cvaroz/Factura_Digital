/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org;

import entidades.Usuario;
import servicios.ServicioUsuario;

/**
 *
 * @author Li
 */
public class ControllerUsuario {
    ServicioUsuario servicioUsuario = new ServicioUsuario();

    public boolean insertarRecibo(Usuario u) {
        if (u != null) {
            return false;
        } else {
            return servicioUsuario.modify(u)!=false;
        }
    }

    public boolean modificarRecibo(Usuario u) {
        if (u != null) {
            return servicioUsuario.modify(u)!=false;
        } else {
            return false;
        }
    }

    public Usuario leerRecibo(Usuario u) {
        if (u != null) {
            return servicioUsuario.read(u);
        }else 
            return null;
    }
}
