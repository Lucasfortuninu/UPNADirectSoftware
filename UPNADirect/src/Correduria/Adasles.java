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
public class Adasles extends Aseguradora {
    public String getNombre(){
        return "ADASLES";
    }
    public int calcularImporteSeguro(Cliente cliente, BienCliente bien) {
        int importeSeguro = 0;
        importeSeguro = bien.getValor() * 2 / 100;
        if (bien.getTipo().equals("vehiculo") && (cliente.getEdad() < 20 || cliente.getEdad() > 60 )) {
        importeSeguro = bien.getValor() * 6 / 100;
        } 
        return importeSeguro;
    }
    public int calcularComision(int importeSeguro) {
        double result;
        if (importeSeguro <= 1000) {
            result = (importeSeguro * 0.01);
        }
        else {
            result = (importeSeguro * 0.05);
        }
        return (int) Math.floor(result);
    }
}
