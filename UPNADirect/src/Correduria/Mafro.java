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
public class Mafro extends Aseguradora {
    public String getNombre(){
        return "MAFRO";
    }
    public int calcularImporteSeguro(Cliente cliente, BienCliente bien) {
        int importeSeguro = 0;
        importeSeguro = bien.getValor() * 3 / 100;
        if (bien.getTipo().equals("vehiculo") && cliente.getEdad() < 20) {
            importeSeguro = bien.getValor() * 5 / 100;
        } 
        else if (bien.getTipo().equals("vivienda") && bien.getValor() > 200000 && cliente.getSalarioAnual() < 20000) {
            importeSeguro = bien.getValor() * 2 / 100;
        }
        return importeSeguro;
    }
    public int calcularComision(int importeSeguro) {
        double result;
        if (importeSeguro <= 1000) {
            result = (importeSeguro * 0.01);
        }
        else {
            result = (importeSeguro * 0.03);
        }
        return (int) Math.floor(result);
    }
}
