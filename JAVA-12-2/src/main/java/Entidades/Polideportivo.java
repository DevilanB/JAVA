/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author joam9
 */
public class Polideportivo extends Edificio {
private boolean techado;

    public Polideportivo(boolean techado, Integer ancho, Integer alto, Integer largo) {
        super(ancho, alto, largo);
        this.techado = techado;
    }
    


    @Override
    public void calcularSuperficie() {
         System.out.println("la superficie del polideportivo es de "+ largo*ancho);
    }

    @Override
    public void calcularVolumen() {
         System.out.println("el volumen del polideportivo es de "+ largo*ancho*alto);
    }

    @Override
    public int auxiliar() {
        int x=0;
       if(techado ==true){
       x=1;
       } 
       return x;
    }
    
}
