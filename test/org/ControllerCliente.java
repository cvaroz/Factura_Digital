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

