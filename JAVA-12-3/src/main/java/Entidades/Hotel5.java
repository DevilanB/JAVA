/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author joam9
 */
public class Hotel5 extends Hotel4 {
    protected Integer Salones;
    protected Integer suites;
    protected Integer limusinas;

    
    public Hotel5(Integer Salones, Integer suites, Integer limusinas, String gimnasio, String nomRestaurante, Integer capRestaurante, Integer habitaciones, Integer camas, Integer pisos, Integer precioHab, String nombre, String direccion, String localidad, String gerente) {
        super(gimnasio, nomRestaurante, capRestaurante, habitaciones, camas, pisos, precioHab, nombre, direccion, localidad, gerente);
        this.Salones = Salones;
        this.suites = suites;
        this.limusinas = limusinas;
    }

    @Override
    public void precioHabi(){
    super.precioHabi();
    this.precioHab = precioHab + (15*limusinas);
    }

    public Integer getSalones() {
        return Salones;
    }

    public Integer getSuites() {
        return suites;
    }

    public Integer getLimusinas() {
        return limusinas;
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

    public void setSalones(Integer Salones) {
        this.Salones = Salones;
    }

    public void setSuites(Integer suites) {
        this.suites = suites;
    }

    public void setLimusinas(Integer limusinas) {
        this.limusinas = limusinas;
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
        return "Hotel5{" + "Salones=" + Salones + ", suites=" + suites + ", limusinas=" + limusinas + '}';
    }
   
    
}
