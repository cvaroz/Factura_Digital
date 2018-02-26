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
    Cliente cliente = new Cliente();

    public boolean insertarCliente() {
        servicioCliente.insert(cliente);
        return false;
    }
}
