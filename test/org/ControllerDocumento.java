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

    public boolean insertarDocumento(Documento d) throws Exception {
        if (d != null) {
            return false;
        } else {
            servicioDocumento.insert(d);
            return true;
        }
    }

    public boolean modificarDocumento(Documento d) throws Exception {
        if(d != null){
            return servicioDocumento.modify(d)!=false;
        }else
            return false;
    }
    
    public Documento leerDocumento(Documento d) throws Exception{
        return servicioDocumento.read(d);
    }
}
