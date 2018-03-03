/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.test;

import entidades.Item;
import servicios.ServicioItem;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean(name = "controllerItem")
@RequestScoped
public class ControllerItem {

    ServicioItem servicioItem = new ServicioItem();

    public boolean insertarItem(Item i) throws Exception {
        if (i != null) {
            return false;
        } else {
            servicioItem.insert(i);
            return true;
        }
    }

    public boolean modificarItem(Item i) throws Exception {
        if (i != null) {
            return servicioItem.modify(i)!=false;
        } else {
            return false;
        }
    }

    public Item leerItem(Item i) throws Exception {
        if(i!=null){
                return servicioItem.read(i);
            }else 
                return null;
    }
    public boolean eliminarItem(Item i) throws Exception {
        if (i != null) {
            return servicioItem.delete(i);
        } else {
            return false;
        }
    }
}
