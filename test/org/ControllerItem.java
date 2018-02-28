/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org;

import entidades.Item;
import servicios.ServicioItem;

/**
 *
 * @author Li
 */
public class ControllerItem {

    ServicioItem servicioItem = new ServicioItem();

    public boolean insertarItem(Item i) throws Exception {
        if (i != null) {
            return false;
        } else {
            return servicioItem.modify(i)!=false;
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
}
