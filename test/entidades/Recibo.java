/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.util.Date;

/**
 *
 * @author Li
 */
public class Recibo {
    private int idRecibo;
    private Date fecha;
    private double montoPagado;
    private double montoRestante;
    private Factura factura;
}
