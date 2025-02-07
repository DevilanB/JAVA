/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author joam9
 */
public class Residencia extends ExtraHoteleros{
    protected Integer habitaciones;
    protected boolean descuentos;
    protected boolean campoDeportivo;

    public Residencia(Integer habitaciones, boolean descuentos, boolean campoDeportivo, boolean privado, Integer m2, String nombre, String direccion, String localidad, String gerente) {
        super(privado, m2, nombre, direccion, localidad, gerente);
        this.habitaciones = habitaciones;
        this.descuentos = descuentos;
        this.campoDeportivo = campoDeportivo;
    }

    public Integer getHabitaciones() {
        return habitaciones;
    }

    public boolean isDescuentos() {
        return descuentos;
    }

    public boolean isCampoDeportivo() {
        return campoDeportivo;
    }

    public boolean isPrivado() {
        return privado;
    }

    public Integer getM2() {
        return m2;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getLocalidad() {
        return localidad;
    }

    public String getGerente() {
        return gerente;
    }

    public void setHabitaciones(Integer habitaciones) {
        this.habitaciones = habitaciones;
    }

    public void setDescuentos(boolean descuentos) {
        this.descuentos = descuentos;
    }

    public void setCampoDeportivo(boolean campoDeportivo) {
        this.campoDeportivo = campoDeportivo;
    }

    public void setPrivado(boolean privado) {
        this.privado = privado;
    }

    public void setM2(Integer m2) {
        this.m2 = m2;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public void setGerente(String gerente) {
        this.gerente = gerente;
    }

    @Override
    public String toString() {
        return "Residencia{" + "habitaciones=" + habitaciones + ", descuentos=" + descuentos + ", campoDeportivo=" + campoDeportivo + '}';
    }
   
    
}
