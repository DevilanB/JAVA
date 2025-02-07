/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author joam9
 */
public class Profesores extends Empleados {
    protected String departamento;

    public Profesores(String departamento, Integer anioDeIncorporacion, Integer numDespacho, String nombre, String apellido, Integer documento, String estadoCivil) {
        super(anioDeIncorporacion, numDespacho, nombre, apellido, documento, estadoCivil);
        this.departamento = departamento;
    }

    @Override
    public void cambioDeEstadoCivil(String q) {
         this.estadoCivil = q;
    }

    @Override
    public void reasignacionDeDespacho(Integer p) {
        this.numDespacho = p;
    }
    
    public void cambioDepartamentto(String x){
    this.departamento = x;
    }

    @Override
    public String toString() {
        return "Profesores{" + "nombre=" + nombre + ", apellido=" + apellido + ", documento=" + documento + ", estadoCivil=" + estadoCivil + ", anioDeIncorporacion=" + anioDeIncorporacion + ", numDespacho=" + numDespacho + ", departamento=" + departamento + '}';
    }
    
    
}
