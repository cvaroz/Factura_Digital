/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.test;

/**
 *
 * @author Li
 */
import entidades.Empresacliente;
import servicios.ServicioEmpresacliente;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean(name = "controllerEmpresaCliente")
@RequestScoped
public class ControllerEmpresaCliente {

    ServicioEmpresacliente servicioEmpresacliente = new ServicioEmpresacliente();

    public boolean insertarEmpresa(Empresacliente eC) throws Exception {
        if (eC != null) {
            return false;
        } else {
            servicioEmpresacliente.insert(eC);
            return true;
        }
    }

    public boolean modificarEmpresa(Empresacliente eC) throws Exception {
        if (eC != null) {
            return servicioEmpresacliente.modify(eC) != false;
        } else {
            return false;
        }
    }

    public Empresacliente leerEmpresa(Empresacliente eC) throws Exception {
        return servicioEmpresacliente.read(eC);
    }

}
