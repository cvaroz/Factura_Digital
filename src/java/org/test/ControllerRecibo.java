/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.test;

import entidades.Recibo;
import servicios.ServicioRecibo;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean(name = "controllerRecibo")
@RequestScoped
public class ControllerRecibo {
    ServicioRecibo servicioRecibo = new ServicioRecibo();

    public boolean insertarRecibo(Recibo r) throws Exception {
        if (r != null) {
            return false;
        } else {
            servicioRecibo.insert(r);
            return true;
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
