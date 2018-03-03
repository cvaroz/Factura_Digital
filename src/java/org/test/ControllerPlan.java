/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.test;

import entidades.Plan;
import servicios.ServicioPlan;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean(name = "controllerPlan")
@RequestScoped
public class ControllerPlan {

    ServicioPlan servicioPlan = new ServicioPlan();

    public boolean insertarPlan(Plan p) throws Exception {
        if (p != null) {
            return false;
        } else {
            servicioPlan.insert(p);
            return true;
        }
    }

    public boolean modificarPlan(Plan p) throws Exception {
        if (p != null) {
            return servicioPlan.modify(p)!=false;
        } else {
            return false;
        }
    }

    public Plan leerPlan(Plan p) throws Exception {
        if (p != null) {
            return servicioPlan.read(p);
        }else 
            return null;
    }
    
    public boolean eliminarPlan(Plan p) throws Exception{
        if(p != null) {
            servicioPlan.delete(p);
            return true;
        } else {
            return false;
        }
    }
}
