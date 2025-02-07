/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author joam9
 */
public abstract class Hoteles extends Alojamiento {
    protected Integer habitaciones;
    protected Integer camas;
    protected Integer pisos;
    protected Integer precioHab =50;

    public Hoteles(Integer habitaciones, Integer camas, Integer pisos, Integer precioHab, String nombre, String direccion, String localidad, String gerente) {
        super(nombre, direccion, localidad, gerente);
        this.habitaciones = habitaciones;
        this.camas = camas;
        this.pisos = pisos;
        this.precioHab = precioHab;
    }

    public abstract void precioHabi();
    
    public Integer getHabitaciones() {
        return habitaciones;
    }

    public Integer getCamas() {
        return camas;
    }

    public Integer getPisos() {
        return pisos;
    }

    public Integer getPrecioHab() {
        return precioHab;
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

    public void setCamas(Integer camas) {
        this.camas = camas;
    }

    public void setPisos(Integer pisos) {
        this.pisos = pisos;
    }

    public void setPrecioHab(Integer precioHab) {
        this.precioHab = precioHab;
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
        return "Hoteles{" + "habitaciones=" + habitaciones + ", camas=" + camas + ", pisos=" + pisos + ", precioHab=" + precioHab + '}';
    }
   
    
}
