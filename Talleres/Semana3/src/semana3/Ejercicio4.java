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
public class Ejercicio4 {
    public static void main(String[] args){
        //n^m= n*n*n.. (m veces)
        int i;
        int m=6;
        int n=4;
        int resultado=1;
        
        for(i=1;i<=m;i++){
            resultado *= n;
        }
        System.out.println("el resultado es: " + resultado);
    }
    
}
