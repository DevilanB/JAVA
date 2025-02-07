/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.guia12ejex3;

import Entidades.Alojamiento;
import Entidades.Camping;
import Entidades.Hotel4;
import Entidades.Hotel5;
import Entidades.Hoteles;
import Entidades.Residencia;
import Utilidades.Comparador;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 *
 * @author joam9
 */
public class Guia12ejex3 {

    public static void main(String[] args) {
      Scanner leer = new Scanner(System.in);
      Alojamiento h4 = new Hotel4("b", "restoB", 10, 10, 20, 3, 50, "hotelcuatro", "chacabuco112", "bahia", "carlitos");
      (((Hotel4)h4)).precioHabi();
      Alojamiento h5 = new Hotel5(4, 5, 4, "a", "restoA", 35, 20, 30, 5, 50, "HotelCinco", "zelarayan225", "ituzaingo", "pedrito");
      (((Hotel5)h5)).precioHabi();
      Alojamiento camp = new Camping(15, 15, true, true, 200, "Campito", "Chiclana554", "PuntaAlta", "josesito");
      Alojamiento resi = new Residencia(10, true, true, false, 100, "Resident", "Vieytes789", "Hurlingam", "pablito");
    
        System.out.println(h4);
        System.out.println(h5);
        System.out.println(camp);
        System.out.println(resi);
        
        ArrayList<Hoteles> hlist = new ArrayList();
       
        
        ArrayList<Alojamiento> alojlist = new ArrayList();
        alojlist.add(h4);
        alojlist.add(h5);
        alojlist.add(camp);
        alojlist.add(resi);
        
        int resp= 0;
        while (resp != 5){
        System.out.println("Que tipo de alojamiento desea buscar?");
        System.out.println("1-todos los alojamientos");
        System.out.println("2-todos los hoteles de más caro a más barato");
        System.out.println("3-todos los campings con restaurante");
        System.out.println("4-todos las residencias que tienen descuento");
        System.out.println("5-salir");
        resp = leer.nextInt();
        switch(resp){
            case 1:
                for (Alojamiento aux : alojlist) {
                    System.out.println(aux);
                }
                break;
            case 2:
                
                for (Alojamiento aux : alojlist) {
                   
                    if(aux instanceof Hotel4 || aux instanceof Hotel5){
                    //Hotel4 aux2 = (Hotel4)aux; 
                    /*(((Hotel4)aux)).getGimnasio()*/
                        hlist.add((Hoteles)aux);
                       
                    
                    }
                }
                Collections.sort(hlist, Comparador.ordenarxPrecio);
                for (Hoteles hot : hlist) {
                    System.out.println(hot+" //precio: "+ hot.getPrecioHab());
                }
                break;
            case 3:
                for (Alojamiento aux : alojlist) {
                   if(aux instanceof Camping){
                   if((((Camping)aux)).isRestaurante()== true)
                           System.out.println(aux);
                   } 
                    
                }
            case 4:
                for (Alojamiento aux : alojlist) {
                   if(aux instanceof Residencia){
                   if((((Residencia)aux)).isDescuentos()== true)
                           System.out.println(aux);
                   } 
                    
                }

        
        
        }
  
        }
    
    
    }
    
    
}
