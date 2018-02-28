/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org;

import entidades.Recibo;
import servicios.ServicioRecibo;

/**
 *
 * @author Li
 */
public class ControllerRecibo {
    ServicioRecibo servicioRecibo = new ServicioRecibo();

    public boolean insertarRecibo(Recibo r) throws Exception {
        if (r != null) {
            return false;
        } else {
            return servicioRecibo.modify(r)!=false;
        }
    }

    public boolean modificarRecibo(Recibo r) throws Exception {
        if (r != null) {
            return servicioRecibo.modify(r)!=false;
        } else {
            return false;
        }
    }

    public Recibo leerRecibo(Recibo r) throws Exception {
        if (r != null) {
            return servicioRecibo.read(r);
        }else 
            return null;
    }
}
