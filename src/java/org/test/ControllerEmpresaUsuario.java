/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.test;

import entidades.Empresausuario;
import servicios.ServicioEmpresausuario;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean(name = "controllerEmpresaUsuario")
@RequestScoped
public class ControllerEmpresaUsuario {
    ServicioEmpresausuario servicioEmpresausuario = new ServicioEmpresausuario();

    public boolean insertarEmpresaUsuario(Empresausuario eU) throws Exception {
        if (eU != null) {
            return false;
        } else {
            servicioEmpresausuario.insert(eU);
            return true;
        }
    }

    public boolean modificarEmpresaUsuario(Empresausuario eU) throws Exception {
        if (eU != null) {
            return servicioEmpresausuario.modify(eU) != false;
        } else {
            return false;
        }
    }

    public Empresausuario leerEmpresaUsuario(Empresausuario eU) throws Exception {
        return servicioEmpresausuario.read(eU);
    }
}
