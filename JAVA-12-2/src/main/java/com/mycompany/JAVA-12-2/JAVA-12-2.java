/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.guia12ejex2;

import Entidades.Edificio;
import Entidades.EdificioDeOficinas;
import Entidades.Polideportivo;
import java.util.ArrayList;

/**
 *
 * @author joam9
 */
public class Guia12ejex2 {

    public static void main(String[] args) {
       Edificio ed1 = new Polideportivo(true,2,2,2);
       Edificio ed2 = new Polideportivo(false,4,4,4);
       Edificio ed3 = new EdificioDeOficinas(6,6,6);
       Edificio ed4 = new EdificioDeOficinas(10,10,10);
       ArrayList<Edificio> ale = new ArrayList();
       ale.add(ed1);
       ale.add(ed2);
       ale.add(ed3);
       ale.add(ed4);
       int techados =0;
        for (Edificio aux : ale) {
            aux.calcularSuperficie();
            aux.calcularVolumen();
            techados = techados +aux.auxiliar();
            
        }
        System.out.println("la cantidad de polideportivos techados es: "+ techados);
    }
}
