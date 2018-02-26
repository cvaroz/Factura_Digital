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
public class Producto {
    private int idProducto;
    private String descripcion;
    private double impuestoVenta;
    private String nombre;
    private double precio;
    private List<Item> items;
    private Empresa empresa;
}
