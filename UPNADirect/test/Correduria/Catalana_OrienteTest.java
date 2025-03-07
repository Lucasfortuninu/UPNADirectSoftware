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
public class Catalana_OrienteTest {
    @Test
    public void Un_cliente_nacido_en_con_salario_35000_y_vivienda_de_120000() {
        // Dado un cliente nacido en 1970 con salario 35000 y una vivienda con valor 120000
        Cliente cliente = new Cliente(1970, 35000);
        BienCliente bien = new BienCliente("vivienda", 120000);
        Catalana_Oriente catalana_oriente = new Catalana_Oriente();
        // Cuando compruebo el importe y comision de Catalana Oriente
        Boolean importeYComisonCorrecto = (catalana_oriente.calcularImporteSeguro(cliente, bien) == 2400 && catalana_oriente.calcularComision(catalana_oriente.calcularImporteSeguro(cliente, bien)) == 144);
        //Entonces debe devolver cierto
        assertTrue(importeYComisonCorrecto);
    }
    @Test
    public void Un_cliente_nacido_en_1999_con_salario_20000_y_vivienda_de_220000() {
        // Dado un cliente nacido en 1999 con salario 20000 y una vivienda con valor 220000
        Cliente cliente = new Cliente(1999, 20000);
        BienCliente bien = new BienCliente("vivienda", 220000);
        Catalana_Oriente catalana_oriente = new Catalana_Oriente();
        // Cuando compruebo el importe y comision de Catalana Oriente
        Boolean importeYComisonCorrecto = (catalana_oriente.calcularImporteSeguro(cliente, bien) == 3600 && catalana_oriente.calcularComision(catalana_oriente.calcularImporteSeguro(cliente, bien)) == 108);
        //Entonces debe devolver falso
        assertFalse(importeYComisonCorrecto);
    }
    @Test
    public void Un_cliente_menor_de_20_años_con_salario_15000_y_vehiculo_de_40000() {
        // Dado un cliente menor de 20 años con salario 15000 y un vehiculo con valor 40000
        Cliente cliente = new Cliente(2005, 15000);
        BienCliente bien = new BienCliente("vehiculo", 40000);
        Catalana_Oriente catalana_oriente = new Catalana_Oriente();
        // Cuando compruebo el importe y comision de Catalana Oriente
        Boolean importeYComisonCorrecto = (catalana_oriente.calcularImporteSeguro(cliente, bien) == 2800 && catalana_oriente.calcularComision(catalana_oriente.calcularImporteSeguro(cliente, bien)) == 168);
        //Entonces debe devolver cierto
        assertTrue(importeYComisonCorrecto);
    }    
}
