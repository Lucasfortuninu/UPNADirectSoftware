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
public class EjecutorTest {
    @Test
    public void Un_cliente_nacido_en_2005_con_salario_15000_y_vehiculo_de_30000() {
        // Dado un cliente nacido en 2005 con salario 15000 y una vehiculo con valor 30000
        VistaFalsa vista = new VistaFalsa(2005, 15000, "vehiculo", 30000);
        Tecnico_Comercial_Presentador tecnico = new Tecnico_Comercial_Presentador(vista);
        tecnico.obtenerOfertaVentajosa();
        // Cuando compruebo la oferta mas ventajosa
        Boolean ofertaVentajosaEsCorrecta = (vista.mostrarOferta.equals("LINEA INDIRECTA|900|9"));
        //Entonces debe devolver cierto
        assertTrue(ofertaVentajosaEsCorrecta);
    }   
}
