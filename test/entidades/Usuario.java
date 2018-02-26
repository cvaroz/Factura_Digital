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
public class Usuario {
    private int idUsuario;
    private String correo;
    private String estado;
    private String nombreUsuario;
    private int telefono;
    private List<Empresausuario> empresausuarios;
    private List<Factura> facturas;
}
