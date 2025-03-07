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
public class Tecnico_Comercial_Presentador {
    private IVistaCorreduria vista;
    public Tecnico_Comercial_Presentador(IVistaCorreduria vista) {
        this.vista = vista;
    }
    public void obtenerOfertaVentajosa(){
        Cliente cliente;
        do{
            int annoNacimiento = vista.consultarAnnoNacimiento();
            int salario = vista.consultarSalario();
            cliente = new Cliente(annoNacimiento, salario);
            vista.validarCliente(cliente);
        } while(!cliente.esClienteValido());
        BienCliente bien;
        do{
            String tipoBien = vista.consultarTipoBien();
            int valorBien = vista.consultarValorBien();
            bien = new BienCliente(tipoBien, valorBien);
            vista.validarBien(bien);
        } while(!bien.esBienValido());
        Aseguradora[] aseguradora = new Aseguradora[4];
        Aseguradora aseguradoraRecomendada;
        aseguradora[0] = new Mafro();
        aseguradora[1] = new Linea_Indirecta();
        aseguradora[2] = new Adasles();
        aseguradora[3] = new Catalana_Oriente();
        aseguradoraRecomendada = aseguradora[0];
        for (int i = 1; i < 4; i++){
            if(aseguradora[i].calcularImporteSeguro(cliente, bien) < aseguradoraRecomendada.calcularImporteSeguro(cliente, bien)){
                aseguradoraRecomendada = aseguradora[i];
            }
            else if(aseguradora[i].calcularImporteSeguro(cliente, bien) == aseguradoraRecomendada.calcularImporteSeguro(cliente, bien)){
                if (aseguradora[i].calcularComision(aseguradora[i].calcularImporteSeguro(cliente, bien)) > aseguradoraRecomendada.calcularComision(aseguradoraRecomendada.calcularImporteSeguro(cliente, bien))){
                    aseguradoraRecomendada = aseguradora[i];
            }
                }
        }
        Oferta ofertaVentajosa = new Oferta(aseguradoraRecomendada.getNombre(),aseguradoraRecomendada.calcularImporteSeguro(cliente, bien), aseguradoraRecomendada.calcularComision(aseguradoraRecomendada.calcularImporteSeguro(cliente, bien)));
        vista.mostrarOferta(ofertaVentajosa.getAseguradora(),ofertaVentajosa.getImporteSeguro(),ofertaVentajosa.getComision());
	}
}
