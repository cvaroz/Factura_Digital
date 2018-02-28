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
import servicios.ServicioEmpresa;
import entidades.Empresa;

public class ControllerEmpresa {

    ServicioEmpresa servicioEmpresa = new ServicioEmpresa();

    public boolean insertarEmpresa(Empresa e) throws Exception {
        if (e != null) {
            return false;
        } else {
            return servicioEmpresa.modify(e) != false;
        }
    }

    public boolean modificarEmpresa(Empresa e) throws Exception {
        if (e != null) {
            return servicioEmpresa.modify(e) != false;
        } else {
            return false;
        }
    }

    public Empresa leerEmpresa(Empresa e) throws Exception {
        return servicioEmpresa.read(e);
    }
}
