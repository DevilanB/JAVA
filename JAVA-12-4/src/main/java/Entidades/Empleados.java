/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author joam9
 */
public abstract class Empleados extends Persona {
    protected Integer anioDeIncorporacion;
    protected Integer numDespacho;

    public Empleados(Integer anioDeIncorporacion, Integer numDespacho, String nombre, String apellido, Integer documento, String estadoCivil) {
        super(nombre, apellido, documento, estadoCivil);
        this.anioDeIncorporacion = anioDeIncorporacion;
        this.numDespacho = numDespacho;
    }

   

    @Override
    public abstract void cambioDeEstadoCivil(String q);
        
    public abstract void reasignacionDeDespacho(Integer p);

    @Override
    public String toString() {
        return "Empleados{" + "nombre=" + nombre + ", apellido=" + apellido + ", documento=" + documento + ", estadoCivil=" + estadoCivil + "anioDeIncorporacion=" + anioDeIncorporacion + ", numDespacho=" + numDespacho + '}';
    }
    
    
}
