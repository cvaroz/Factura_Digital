/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.util.List;

/**
 *
 * @author Li
 */
public class Plan {
    private int idPlan;
    private int cantidad;
    private String descripcion_Planes;
    private double monto;
    private List<Empresa> empresas;

    public Plan() {
    }

    public Plan(int idPlan, int cantidad, String descripcion_Planes, double monto, List<Empresa> empresas) {
        this.idPlan = idPlan;
        this.cantidad = cantidad;
        this.descripcion_Planes = descripcion_Planes;
        this.monto = monto;
        this.empresas = empresas;
    }

    public int getIdPlan() {
        return idPlan;
    }

    public void setIdPlan(int idPlan) {
        this.idPlan = idPlan;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getDescripcion_Planes() {
        return descripcion_Planes;
    }

    public void setDescripcion_Planes(String descripcion_Planes) {
        this.descripcion_Planes = descripcion_Planes;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public List<Empresa> getEmpresas() {
        return empresas;
    }

    public void setEmpresas(List<Empresa> empresas) {
        this.empresas = empresas;
    }
}
