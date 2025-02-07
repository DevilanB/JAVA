/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia13ej3;

import Entidades.Division;
import static java.lang.Integer.parseInt;
import java.util.Scanner;

/**
 *
 * @author joam9
 */
public class Guia13ej3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
       Division d = new Division();
       String n1 = leer.next();
       String n2 = leer.next();
       d.num1 = parseInt(n1);
       d.num2 = parseInt(n2);
       d.division();
    }
    
}
