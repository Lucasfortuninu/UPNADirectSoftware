/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Correduria;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author alumno
 */
public class AdaslesTest {
    @Test
    public void Un_cliente_nacido_en_1970_con_salario_35000_y_vivienda_de_120000() {
        // Dado un cliente nacido en 1970 con salario 35000 y una vivienda con valor 120000
        Cliente cliente = new Cliente(1970, 35000);
        BienCliente bien = new BienCliente("vivienda", 120000);
        Adasles adasles = new Adasles();
        // Cuando compruebo el importe y comision de Adasles
        Boolean importeYComisonCorrecto = (adasles.calcularImporteSeguro(cliente, bien) == 2400 && adasles.calcularComision(adasles.calcularImporteSeguro(cliente, bien)) == 120);
        //Entonces debe devolver cierto
        assertTrue(importeYComisonCorrecto);
    }
    @Test
    public void Un_cliente_nacido_en_1999_con_salario_20000_y_vivienda_de_220000() {
        // Dado un cliente nacido en 1999 con salario 20000 y una vivienda con valor 220000
        Cliente cliente = new Cliente(1999, 20000);
        BienCliente bien = new BienCliente("vivienda", 220000);
        Adasles adasles = new Adasles();
        // Cuando compruebo el importe y comision de Adasles
        Boolean importeYComisonCorrecto = (adasles.calcularImporteSeguro(cliente, bien) == 3600 && adasles.calcularComision(adasles.calcularImporteSeguro(cliente, bien)) == 108);
        //Entonces debe devolver falso
        assertFalse(importeYComisonCorrecto);
    }
    @Test
    public void Un_cliente_mayor_de_60_con_salario_15000_y_vehiculo_de_22000() {
        // Dado un cliente mayor de 60 años con salario 15000 y un vehiculo con valor 22000
        Cliente cliente = new Cliente(1940, 15000);
        BienCliente bien = new BienCliente("vehiculo", 22000);
        Adasles adasles = new Adasles();
        // Cuando compruebo el importe y comision de Adasles
        Boolean importeYComisonCorrecto = (adasles.calcularImporteSeguro(cliente, bien) == 1320 && adasles.calcularComision(adasles.calcularImporteSeguro(cliente, bien)) == 66);
        //Entonces debe devolver cierto
        assertTrue(importeYComisonCorrecto);      
    }
}
