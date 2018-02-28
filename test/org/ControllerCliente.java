
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org;

/**
 *
 * @author Li
 */
import entidades.Cliente;
import servicios.ServicioCliente;

public class ControllerCliente {

    ServicioCliente servicioCliente = new ServicioCliente();

    public boolean insertarCliente(Cliente c) throws Exception {
        if (c != null) {
            return false;
        } else {
            return servicioCliente.insert(c)!=false;
        }
    }

    public boolean modificarCliente(Cliente c) throws Exception {
        if(c != null){
            return servicioCliente.modify(c)!=false;
        }else
            return false;
    }
    
    public Cliente leerCliente(Cliente c) throws Exception{
        return servicioCliente.read(c);
    }
}
