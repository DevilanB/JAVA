/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeSet;

/**
 *
 * @author joam9
 */
public class EdificioDeOficinas extends Edificio{
    protected Integer numOficinas;
    protected Integer personasxOficina;
    protected Integer pisos;
    Scanner leer = new Scanner(System.in);

    public EdificioDeOficinas(Integer numOficinas, Integer personasxOficina, Integer pisos, Integer ancho, Integer alto, Integer largo) {
        super(ancho, alto, largo);
        this.numOficinas = numOficinas;
        this.personasxOficina = personasxOficina;
        this.pisos = pisos;
    }

    public EdificioDeOficinas(Integer ancho, Integer alto, Integer largo) {
        super(ancho, alto, largo);
    }
    
    public void cantPersonas(){
        System.out.println("ingrese cantidad de pisos del edificio");
        int cpisos = leer.nextInt();
        System.out.println("ingrese numero de oficinas");
        this.numOficinas = leer.nextInt();
        this.pisos = cpisos;
        System.out.println("ingrese numero de personas por oficina");
        int pxo = leer.nextInt();
        this.personasxOficina = pxo;
        Integer[] arrayp = new Integer[cpisos];
   
        for (int i = 0; i < pisos; i++) {
        System.out.println("ingrese numero de oficinas en  piso "+ i);
        int ofi = leer.nextInt();
        arrayp[i]= ofi*personasxOficina;
        }
        int totalpersonas=0;
        for (int i = 0; i < pisos; i++) {
            totalpersonas= totalpersonas + arrayp[i];
        }
        
         for (int i = 0; i < pisos; i++) {
        System.out.println("Piso "+ i);
             System.out.println(" hay "+ arrayp[i]+" personas trabajando en este piso");
        
    }
         System.out.println("el total de personas trabajando en el edificio es de "+totalpersonas+" personas");
       
    }

    @Override
    public void calcularSuperficie() {
        System.out.println("la superficie del edificio de oficinas es de "+ largo*ancho);
    }

    @Override
    public void calcularVolumen() {
        System.out.println("el volumen del edificio de oficinas es de "+ largo*ancho*alto);
    }

    @Override
    public int auxiliar() {
       cantPersonas();
       return 0;
    }
    
    
}
