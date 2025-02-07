/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.guia12ejex4;

import Entidades.Estudiantes;
import Entidades.PersonalDeServicio;
import Entidades.Profesores;

/**
 *
 * @author joam9
 */
public class Guia12ejex4 {

    public static void main(String[] args) {
        Estudiantes es = new Estudiantes("algebra", "alumnopepe", "DAGARRAGO", 12544987, "soltero");
        Profesores pf = new Profesores("matematica", 1992, 12, "profejulian", "dinocsit", 55666999, "casado");
        PersonalDeServicio pds = new PersonalDeServicio("biblioteca", 1990, 4, "pdsNicolas", "larrate", 25669331, "soltero");
    
        System.out.println(es);
        System.out.println("/////////////////////////////////");
        System.out.println(pf);
        System.out.println("/////////////////////////////////");
        System.out.println(pds);
    
    /////////////////////////////////////////////////////////////////////////////////////////
    es.cambioDeEstadoCivil("nimuymuynitantan");
    es.matriculacion("geografia");
    
    pf.cambioDeEstadoCivil("estamos viendo");
    pf.cambioDepartamentto("latin");
    pf.reasignacionDeDespacho(888);
    
    pds.cambioDeEstadoCivil("casadoperonocastrado");
    pds.traslado("baños");
    pds.reasignacionDeDespacho(444);
        System.out.println("----------------------------------------------------------------");
    System.out.println(es);
        System.out.println("/////////////////////////////////");
        System.out.println(pf);
        System.out.println("/////////////////////////////////");
        System.out.println(pds);
    
    }
}
