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
public class MafroTest {
    @Test
    public void Un_cliente_nacido_en_1970_con_salario_35000_y_vivienda_de_120000() {
        // Dado un cliente nacido en 1970 con salario 35000 y una vivienda con valor 120000
        Cliente cliente = new Cliente(1970, 35000);
        BienCliente bien = new BienCliente("vivienda", 120000);
        Mafro mafro = new Mafro();
        // Cuando compruebo el importe y comision de Mafro
        Boolean importeYComisonCorrecto = (mafro.calcularImporteSeguro(cliente, bien) == 3600 && mafro.calcularComision(mafro.calcularImporteSeguro(cliente, bien)) == 108);
        //Entonces debe devolver cierto
        assertTrue(importeYComisonCorrecto);
    }
    @Test
    public void Un_cliente_nacido_en_1999_con_salario_20000_y_vivienda_de_220000() {
        // Dado un cliente nacido en 1999 con salario 20000 y una vivienda con valor 220000
        Cliente cliente = new Cliente(1999, 20000);
        BienCliente bien = new BienCliente("vivienda", 220000);
        Mafro mafro = new Mafro();
        // Cuando compruebo el importe y comision de Mafro
        Boolean importeYComisonCorrecto = (mafro.calcularImporteSeguro(cliente, bien) == 3600 && mafro.calcularComision(mafro.calcularImporteSeguro(cliente, bien)) == 108);
        //Entonces debe devolver falso
        assertFalse(importeYComisonCorrecto);
    }
    @Test
    public void Un_cliente_menor_de_20_años_con_salario_17000_y_vehiculo_de_16000() {
        // Dado un cliente menor de 20 años con salario 17000 y un vehiculo con valor 16000
        Cliente cliente = new Cliente(2004, 17000);
        BienCliente bien = new BienCliente("vehiculo", 16000);
        Mafro mafro = new Mafro();
        // Cuando compruebo el importe y comision de Mafro
        Boolean importeYComisonCorrecto = (mafro.calcularImporteSeguro(cliente, bien) == 800 && mafro.calcularComision(mafro.calcularImporteSeguro(cliente, bien)) == 8);
        //Entonces debe devolver cierto
        assertTrue(importeYComisonCorrecto);     
    }   
}
