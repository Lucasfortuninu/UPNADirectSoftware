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
import java.util.Scanner;
public class Vista_Consola_Evolucion implements IVistaCorreduria{
    private final String ANSI_PURPLE = "\u001B[35m";
    private final String ANSI_RESET = "\u001B[0m";
    private final Scanner scanner = new Scanner(System.in);
    @Override
    public int consultarAnnoNacimiento() {
        System.out.print(ANSI_PURPLE + "//Año de Nacimiento> " + ANSI_RESET);
        String annoNacimiento = scanner.nextLine();
        return Integer.parseInt(annoNacimiento);
    }
    @Override
    public int consultarSalario() {
        System.out.print(ANSI_PURPLE + "//Salario> " + ANSI_RESET);
        String salario = scanner.nextLine();
        return Integer.parseInt(salario);
    }
    @Override
    public String consultarTipoBien() {
        return "vehiculo";
    }
    @Override
    public int consultarValorBien() {
        return 25000;
    }
    @Override
    public void mostrarOferta(String nombre, int importe, int comision) {
        System.out.println(nombre + "|" + importe + "|" + comision );
    }
    @Override
    public void validarBien(BienCliente bien) {
        if(!bien.esBienValido()){
            System.out.println("Valor o tipo de bien incorrecto, introduzca una vivienda de mas de 50000 o un vehiculo de menos de 50000.");
        }
    }
    @Override
    public void validarCliente(Cliente cliente) {
        if(!cliente.esClienteValido()){
            System.out.println("Edad del cliente no valida, introduzca un edad entre 1901 y el año actual.");
        }
    }
}
