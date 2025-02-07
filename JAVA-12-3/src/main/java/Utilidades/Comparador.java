/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Utilidades;

import Entidades.Alojamiento;
import Entidades.Hoteles;
import java.util.Comparator;

/**
 *
 * @author joam9
 */
public class Comparador {
    public static Comparator<Hoteles> ordenarxPrecio = new Comparator<Hoteles>() {
        @Override
        public int compare(Hoteles t, Hoteles t1) {
            return t1.getPrecioHab().compareTo(t.getPrecioHab());
        }
    };
}
