<<<<<<< HEAD
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
=======
package org;


import servicios.ServicioCliente;
import entidades.Cliente;

public class ControllerCliente {
    
    
    Cliente c1 = new Cliente();
    ServicioCliente serviceC = new ServicioCliente(); 
    
   
       
    
    public void crearCliente(Cliente cliente){
    
        
        
        serviceC.insert(cliente);
    
    
    }
    
}

>>>>>>> f0f9af6771d8933691cd676ec3634e76eb8acd93
