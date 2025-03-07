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
public class Ejecutor {
    public static void main (String[] args) {
        Tecnico_Comercial_Presentador tecnico = new Tecnico_Comercial_Presentador(new VistaConsola());
        tecnico.obtenerOfertaVentajosa();
    }
}
