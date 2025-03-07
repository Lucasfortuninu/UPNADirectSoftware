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
public class ClienteTest {
   @Test
    public void cliente_edad_menor_a_la_permitida() {
        Cliente cliente = new Cliente(2023, 40000);
        assertFalse(cliente.esClienteValido());    
    }
    @Test
    public void cliente_edad_mayor_a_la_permitida() {
        Cliente cliente = new Cliente(1900, 30000);
        assertFalse(cliente.esClienteValido());   
    }
    @Test
    public void cliente_edad_permitida() {
        Cliente cliente = new Cliente(2002, 30000);
        assertTrue(cliente.esClienteValido());    
    }  
}
