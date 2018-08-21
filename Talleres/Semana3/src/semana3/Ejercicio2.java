/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana3;

/**
 *
 * @author utp
 */
public class Ejercicio2 {
    
    public static void main(String[] args){
        
        // factorial
        int x=5;
        int a;
        int facto=1;
        
       for(a=1;a<=x;a++){
           facto*=a;
       }
       System.out.println("el factorial es: " + facto);
       
    }
}
