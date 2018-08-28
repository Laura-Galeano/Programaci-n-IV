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
public class Ejercicio3 {
    public static void main(String[] args){
        //fibonacci
        int fibo1=0;
        int fibo2=0;
        int i;
        int solucion;
        int resultado=0;
        int n=8;

        System.out.println("el fibonacci de " + n + "es: ");
        
        for(i=1;i<=n;i++){
            if(i==1 || i==2){
                System.out.print("1+");
                fibo1=1;
                fibo2=1;
                resultado = fibo1 + fibo2;
            }
            else {
                solucion=fibo1+fibo2;
                    System.out.print(solucion + "+" );
                    fibo1= fibo2;
                    fibo2= solucion;
                    resultado += solucion;
            }  
        }
        System.out.print( "=" + resultado);
       
    }
}
