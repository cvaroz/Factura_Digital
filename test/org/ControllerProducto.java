/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org;

import entidades.Producto;
import servicios.ServicioProducto;

/**
 *
 * @author Li
 */
public class ControllerProducto {
    ServicioProducto servicioProducto = new ServicioProducto();

    public boolean insertarProducto(Producto p) {
        if (p != null) {
            return false;
        } else {
            return servicioProducto.modify(p)!=false;
        }
    }

    public boolean modificarProducto(Producto p) {
        if (p != null) {
            return servicioProducto.modify(p)!=false;
        } else {
            return false;
        }
    }

    public Producto leerProducto(Producto p) {
        if (p != null) {
            return servicioProducto.read(p);
        }else 
            return null;
    }
    
}
