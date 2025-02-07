/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author joam9
 */
public class BarcoMotor extends Barco {
    protected Integer potenciaCV;

    public BarcoMotor() {
    }

    public BarcoMotor(Integer potenciaCV) {
        this.potenciaCV = potenciaCV;
    }

    public BarcoMotor(Integer potenciaCV, Integer matricula, Integer eslora, String aniodefabricacion) {
        super(matricula, eslora, aniodefabricacion);
        this.potenciaCV = potenciaCV;
    }

    public Integer getPotenciaCV() {
        return potenciaCV;
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

    public void setPotenciaCV(Integer potenciaCV) {
        this.potenciaCV = potenciaCV;
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
    int precio = eslora *10 + potenciaCV;
    return precio;
     }
}
