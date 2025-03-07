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
public class BienCliente {
    private String tipo;
    private int valor;
    public BienCliente(String tipo, int valor) {
        this.tipo = tipo;
        this.valor = valor;
    }
    public String getTipo() {
        return tipo;
    }
    public int getValor() {
        return valor;
    }
    public boolean esBienValido(){
        return((tipo.equals("vehiculo") && (valor<=50000)) || (tipo.equals("vivienda") && (valor>=50000)));
    }
}
