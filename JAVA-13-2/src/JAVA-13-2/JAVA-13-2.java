/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia13ej2;

/**
 *
 * @author joam9
 */
public class Guia13ej2 {

    
    public static void main(String[] args) {
        int[] vec = new int[3];
        try{
        for (int i = 0; i < 10; i++) {
            vec[i] = (int) (Math.random()*7);
        }
        }catch(Exception a){
            System.out.println(a);
            System.out.println(a.getLocalizedMessage());
        }
        finally{
            for (int i = 0; i < 3; i++) {
                System.out.println(vec[i]);
            }
        }
    }
    
}
