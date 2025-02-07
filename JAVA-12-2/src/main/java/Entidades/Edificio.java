/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author joam9
 */
public abstract class Edificio {
    protected Integer ancho;
    protected Integer alto;
    protected Integer largo;

    public Edificio(Integer ancho, Integer alto, Integer largo) {
        this.ancho = ancho;
        this.alto = alto;
        this.largo = largo;
    }

    public Integer getAncho() {
        return ancho;
    }

    public Integer getAlto() {
        return alto;
    }

    public Integer getLargo() {
        return largo;
    }

    public void setAncho(Integer ancho) {
        this.ancho = ancho;
    }

    public void setAlto(Integer alto) {
        this.alto = alto;
    }

    public void setLargo(Integer largo) {
        this.largo = largo;
    }
    
    public abstract int auxiliar();
    
    public abstract void calcularSuperficie();
    
    public abstract void calcularVolumen();
}
