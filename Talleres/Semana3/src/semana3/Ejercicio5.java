/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semana3;

/**
 *
 * @author LAURA
 */
public class Ejercicio5 {
    public static void main(String[] args){
        int i;
        int numero=21;
        int contador=0;
        
        for(i=1;i<=numero;i++){
            if((numero % i)== 0){
                contador++;
            }
        }
        
        if(contador <= 2){
            System.out.println("el número es primo");
        }
        else{
            System.out.println("el número no es primo");
        }
    }
    
}
