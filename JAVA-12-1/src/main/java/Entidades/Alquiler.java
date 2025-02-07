/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author joam9
 */
public class Alquiler {
    protected String nombre;
    protected Integer documento;
    protected Date falquiler;
    protected Date fdevolucion;
    protected String posAmarre;
    protected Barco barco;
    Scanner leer = new Scanner(System.in);

    public Alquiler() {
    }
    
    public void crearAlquiler(){
        System.out.println("ingrese su nombre");
        this.nombre = leer.next();
        System.out.println("ingrese su numero de documento");
        this.documento = leer.nextInt();
        //////////////////////////////////////////
        Date d1 = new Date();
        this.falquiler = d1;
        System.out.println("fechar de alquiler a partir de hoy "+ d1);
        System.out.println("ingrese fecha de devolucion(año/mes/dia)");
        Date d2 = new Date(leer.nextInt()-1900,leer.nextInt()-1,leer.nextInt());
        this.fdevolucion = d2;
        System.out.println("fecha de devolucion establecida "+ d2);
        int milisecondsByDay = 86400000;
        int dias = (int) ((fdevolucion.getTime()-falquiler.getTime()) / milisecondsByDay);
        System.out.println("el alquiler sera por "+ dias+" dias");
        //////////////////////////////////////////
        System.out.println("ingrese posicion de amarre");
        this.posAmarre = leer.next();
        System.out.println("ahora completaremos los datos de su barco");
         System.out.println("ingrese matricula");
                Integer mat = leer.nextInt();
                System.out.println("ingrese eslora");
                Integer eslora = leer.nextInt();
                System.out.println("ingrese año de fabricacion");
                String aniofabric = leer.next();
        System.out.println("ingrese el tipo de barco que desea amarrar");
        System.out.println("1-barco normal");
        System.out.println("2-velero");
        System.out.println("3-barco a motor");
        System.out.println("4- yate de lujo");
        int resp = leer.nextInt();
        switch(resp){
            case 1:
               Barco bar = new Barco(mat,eslora,aniofabric);
               this.barco = bar;
               break;
            case 2:
                System.out.println("ingrese numero de mastiles");
                int mastiles = leer.nextInt();
                Barco bar1 = new Velero(mastiles,mat,eslora,aniofabric);
                this.barco = bar1;
                break;
            case 3:
                System.out.println("ingrese potencia CV");
                int CV = leer.nextInt();
                Barco bar2 = new BarcoMotor(CV,mat,eslora,aniofabric);
                this.barco = bar2;
                break;
            case 4:
                System.out.println("ingrese potencia CV");
                int CVs = leer.nextInt();
                System.out.println("ingrese numero de camarotes");
                int camarotes= leer.nextInt();
                Barco bar3 = new YateDeLujo(CVs,camarotes,mat,eslora,aniofabric);
                this.barco = bar3;
                break;
        
        }
        
        
        System.out.println("el total del alquiler sera:" + barco.precioPorDia()*dias);
    }

    public String getNombre() {
        return nombre;
    }

    public Integer getDocumento() {
        return documento;
    }

    public Date getFalquiler() {
        return falquiler;
    }

    public Date getFdevolucion() {
        return fdevolucion;
    }

    public String getPosAmarre() {
        return posAmarre;
    }

    public Barco getBarco() {
        return barco;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDocumento(Integer documento) {
        this.documento = documento;
    }

    public void setFalquiler(Date falquiler) {
        this.falquiler = falquiler;
    }

    public void setFdevolucion(Date fdevolucion) {
        this.fdevolucion = fdevolucion;
    }

    public void setPosAmarre(String posAmarre) {
        this.posAmarre = posAmarre;
    }

    public void setBarco(Barco barco) {
        this.barco = barco;
    }

    @Override
    public String toString() {
        return "Alquiler{" + "nombre=" + nombre + ", documento=" + documento + ", falquiler=" + falquiler + ", fdevolucion=" + fdevolucion + ", posAmarre=" + posAmarre + ", barco=" + barco + '}';
    }
    
    
}
