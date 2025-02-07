/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author joam9
 */
public class Camping extends ExtraHoteleros {
    protected Integer carpas;
    protected Integer banios;
    protected boolean restaurante;

    public Camping(Integer carpas, Integer banios, boolean restaurante, boolean privado, Integer m2, String nombre, String direccion, String localidad, String gerente) {
        super(privado, m2, nombre, direccion, localidad, gerente);
        this.carpas = carpas;
        this.banios = banios;
        this.restaurante = restaurante;
    }

    public Integer getCarpas() {
        return carpas;
    }

    public Integer getBanios() {
        return banios;
    }

    public boolean isRestaurante() {
        return restaurante;
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

    public void setCarpas(Integer carpas) {
        this.carpas = carpas;
    }

    public void setBanios(Integer banios) {
        this.banios = banios;
    }

    public void setRestaurante(boolean restaurante) {
        this.restaurante = restaurante;
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
        return "Camping{" + "carpas=" + carpas + ", banios=" + banios + ", restaurante=" + restaurante + '}';
    }
    
    

}
