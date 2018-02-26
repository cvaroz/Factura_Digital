/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org;

import entidades.Documento;
import servicios.ServicioDocumento;

/**
 *
 * @author Li
 */
public class ControllerDocumento {
    ServicioDocumento servicioDocumento = new ServicioDocumento();

    public boolean insertarDocumento(Documento d) {
        if (d != null) {
            return false;
        } else {
            return servicioDocumento.insert(d)!=false;
        }
    }

    public boolean modificarDocumento(Documento d) {
        if(d != null){
            return servicioDocumento.modify(d)!=false;
        }else
            return false;
    }
    
    public Documento leerDocumento(Documento d){
        return servicioDocumento.read(d);
    }
}
