/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author joam9
 */
public class Barco {
    protected Integer matricula;
    protected Integer eslora;
    protected String aniodefabricacion;

    public Barco() {
    }

    public Barco(Integer matricula, Integer eslora, String aniodefabricacion) {
        this.matricula = matricula;
        this.eslora = eslora;
        this.aniodefabricacion = aniodefabricacion;
    }

    public Integer getMatricula() {
        return matricula;
    }

    public Integer getEslora() {
        return eslora;
    }

    public String getAniodefabricacion() {
        return aniodefabricacion;
    }

    public void setMatricula(Integer matricula) {
        this.matricula = matricula;
    }

    public void setEslora(Integer eslora) {
        this.eslora = eslora;
    }

    public void setAniodefabricacion(String aniodefabricacion) {
        this.aniodefabricacion = aniodefabricacion;
    }
    
    
    
    
    public Integer precioPorDia(){
    int precio = eslora *10;
    return precio;
    }
}
