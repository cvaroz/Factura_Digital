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
public class Empresa {
    private int idEmpresa;
    private int cantidadRestanteFacturas;
    private int cedula;
    private int consecutivo_Ini;
    private String correo;
    private String estado;
    private byte[] logo;
    private int telefono;
    private String tipo_Persona;
    private List<Documento> documentos;
    private Plan plan;
    private List<Empresacliente> empresaclientes;
    private List<Empresausuario> empresausuarios;
    private List<Producto> productos;
}
