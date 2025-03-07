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
import java.time.*;
public class Cliente {
    private int annoNacimiento;
    private int salarioAnual;
    public Cliente(int annoNacimiento, int salarioAnual) {
        this.annoNacimiento = annoNacimiento;
        this.salarioAnual = salarioAnual;
    }
    int annoActual = LocalDate.now().getYear();
    public int getEdad() {
        return annoActual - annoNacimiento;
    }
    public int getSalarioAnual() {
        return salarioAnual;
    }
    public int getAñoNacimiento() {
        return annoNacimiento;
    }
    public boolean esClienteValido(){
    int anno = LocalDate.now().getYear();
    return (annoNacimiento > 1900 && annoNacimiento < anno);
    }
}
