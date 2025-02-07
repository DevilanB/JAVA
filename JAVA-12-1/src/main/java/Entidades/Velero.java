/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author joam9
 */
public class Velero extends Barco {
    protected Integer numDeMastiles;

    public Velero() {
    }

    public Velero(Integer numDeMastiles) {
        this.numDeMastiles = numDeMastiles;
    }

    public Velero(Integer numDeMastiles, Integer matricula, Integer eslora, String aniodefabricacion) {
        super(matricula, eslora, aniodefabricacion);
        this.numDeMastiles = numDeMastiles;
    }

    public Integer getNumDeMastiles() {
        return numDeMastiles;
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

    public void setNumDeMastiles(Integer numDeMastiles) {
        this.numDeMastiles = numDeMastiles;
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
    
    
    
    @Override
     public Integer precioPorDia(){
    int precio = (eslora *10) + numDeMastiles;
    return precio;
     }
}
