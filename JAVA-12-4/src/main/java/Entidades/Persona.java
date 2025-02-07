/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author joam9
 */
public abstract class Persona {
    protected String nombre;
    protected String apellido;
    protected Integer documento;
    protected String estadoCivil;

    public Persona(String nombre, String apellido, Integer documento, String estadoCivil) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.documento = documento;
        this.estadoCivil = estadoCivil;
    }
    
    public abstract void cambioDeEstadoCivil(String q);

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", apellido=" + apellido + ", documento=" + documento + ", estadoCivil=" + estadoCivil + '}';
    }
    
    
}
