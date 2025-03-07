/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Correduria;

/**
 *
 * @author alumno
 */
public interface IVistaCorreduria {
    int consultarAnnoNacimiento();
    int consultarSalario();
    String consultarTipoBien();
    int consultarValorBien();
    void mostrarOferta(String nombre, int importe, int comision);
    void validarBien(BienCliente bien);
    void validarCliente(Cliente cliente);
}
