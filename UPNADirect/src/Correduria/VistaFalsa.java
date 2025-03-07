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
public class VistaFalsa implements IVistaCorreduria {
    public int annoNacimiento;
    public int salario;
    public String tipoBien;
    public int valorBien;
    public String mostrarOferta;
    public VistaFalsa (int annoNacimiento, int salarioString, String tipoBien, int valorBien){
        this.annoNacimiento = annoNacimiento;
        this.salario = salario;
        this.tipoBien = tipoBien;
        this.valorBien = valorBien;
    }
    @Override
    public int consultarAnnoNacimiento() {
        return annoNacimiento;
    }
    @Override
    public int consultarSalario() {
        return salario;
    }
    @Override
    public String consultarTipoBien() {
        return tipoBien;
    }
    @Override
    public int consultarValorBien() {
        return valorBien;
    }
    @Override
    public void mostrarOferta(String nombre, int importe, int comision) {
        this.mostrarOferta = nombre + "|" + importe + "|" + comision ;
    }
    @Override
    public void validarBien(BienCliente bien) {
    }
    @Override
    public void validarCliente(Cliente cliente) {
    }
}
