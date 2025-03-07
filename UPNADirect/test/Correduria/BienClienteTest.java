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
public class BienClienteTest {
    @Test
    public void bien_vivienda_precio_por_debajo_permitido() {
        BienCliente bien = new BienCliente("vivienda", 40000); 
	assertFalse(bien.esBienValido());    
    }   
    @Test
    public void bien_vehiculo_precio_por_encima_permitido() {
        BienCliente bien = new BienCliente("vehiculo", 60000);
        assertFalse(bien.esBienValido());       
    } 
   @Test
    public void bien_vivienda_precio_permitido() {
        BienCliente bien = new BienCliente("vivienda", 400000);
        assertTrue(bien.esBienValido());       
    }   
}
