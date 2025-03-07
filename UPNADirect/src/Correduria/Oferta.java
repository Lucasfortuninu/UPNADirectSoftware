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
public class Oferta {
    private String aseguradora;
    private int importeSeguro;
    private int comision;
    public Oferta(String aseguradora, int importeSeguro, int comision) {
        this.aseguradora = aseguradora;
        this.importeSeguro = importeSeguro;
        this.comision = comision;
    }
    public String getAseguradora() {
        return aseguradora;
    }
    public int getImporteSeguro() {
        return importeSeguro;
    }
    public int getComision() {
        return comision;
    }
}
