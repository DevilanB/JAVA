/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author joam9
 */
public class Estudiantes extends Persona {
    protected String curso;

    public Estudiantes(String curso, String nombre, String apellido, Integer documento, String estadoCivil) {
        super(nombre, apellido, documento, estadoCivil);
        this.curso = curso;
    }

    @Override
    public void cambioDeEstadoCivil(String q) {
        this.estadoCivil = q;
    }
    
    public void matriculacion(String x){
    this.curso = x;
    }

    @Override
    public String toString() {
        return "Estudiantes{" + "nombre=" + nombre + ", apellido=" + apellido + ", documento=" + documento + ", estadoCivil=" + estadoCivil + ", curso=" + curso + '}';
    }
    
    
}
