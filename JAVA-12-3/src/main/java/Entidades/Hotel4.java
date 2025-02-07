/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author joam9
 */
public class Hotel4 extends Hoteles {
    protected String gimnasio;
    protected String nomRestaurante;
    protected Integer capRestaurante;

    public Hotel4(String gimnasio, String nomRestaurante, Integer capRestaurante, Integer habitaciones, Integer camas, Integer pisos, Integer precioHab, String nombre, String direccion, String localidad, String gerente) {
        super(habitaciones, camas, pisos, precioHab, nombre, direccion, localidad, gerente);
        this.gimnasio = gimnasio;
        this.nomRestaurante = nomRestaurante;
        this.capRestaurante = capRestaurante;
    }

    @Override
    public void precioHabi() {
        int vr=0;
        if(capRestaurante<30){
        vr=10;
        }else if(capRestaurante>29 && capRestaurante<=50){
        vr=30;
        }else if(capRestaurante>50){
        vr=50;
        }
        
        int vg;
        if(gimnasio.equals("a")){
        vg=50;
        }else if(gimnasio.equals("b")){
        vg=30;
        }else{
        vg = 0;
        }
        this.precioHab = precioHab +(1*habitaciones) + vr + vg;
    }
    
    public String getGimnasio() {
        return gimnasio;
    }

    public String getNomRestaurante() {
        return nomRestaurante;
    }

    public Integer getCapRestaurante() {
        return capRestaurante;
    }

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

    public void setGimnasio(String gimnasio) {
        this.gimnasio = gimnasio;
    }

    public void setNomRestaurante(String nomRestaurante) {
        this.nomRestaurante = nomRestaurante;
    }

    public void setCapRestaurante(Integer capRestaurante) {
        this.capRestaurante = capRestaurante;
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
        return "Hotel4{" + "gimnasio=" + gimnasio + ", nomRestaurante=" + nomRestaurante + ", capRestaurante=" + capRestaurante + '}';
    }

    
    
    

}
