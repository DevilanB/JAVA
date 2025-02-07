/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author joam9
 */
public class PersonalDeServicio extends Empleados {
    protected String seccion;

    public PersonalDeServicio(String seccion, Integer anioDeIncorporacion, Integer numDespacho, String nombre, String apellido, Integer documento, String estadoCivil) {
        super(anioDeIncorporacion, numDespacho, nombre, apellido, documento, estadoCivil);
        this.seccion = seccion;
    }

    @Override
    public void cambioDeEstadoCivil(String q) {
         this.estadoCivil = q;
    }

    @Override
    public void reasignacionDeDespacho(Integer p) {
        this.numDespacho = p;
    }
    
    public void traslado(String x){
    this.seccion = x;
    }

    @Override
    public String toString() {
        return "PersonalDeServicio{" + "nombre=" + nombre + ", apellido=" + apellido + ", documento=" + documento + ", estadoCivil=" + estadoCivil + ", anioDeIncorporacion=" + anioDeIncorporacion + ", numDespacho=" + numDespacho + ", seccion=" + seccion + '}';
    }
    
    
}
