/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia13ej4;

import static java.lang.Integer.parseInt;
import java.util.Scanner;

/**
 *
 * @author joam9
 */
public class Guia13ej4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
       try{
       String n1 = leer.next();
       
       int num1 = parseInt(n1);
       int num2 = leer.nextInt();
       int num3 = num1/num2;
       }catch(Exception a){
           System.out.println(a);
           System.out.println(a.fillInStackTrace());
           System.out.println(a.getLocalizedMessage());
       }finally{
           System.out.println("final del trycatch");
       }
    }
    
}
