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
public class Ejercicio7 {
    public static void main(String[] args){
        //programa que calcula las raices de la ecuación de segundo grado de coeficientes reales (ax^2+bx+c)
        
        int a=2;
        int b=5;
        int c=3;
        double x1;
        double x2;
        double discriminante;
        
        discriminante= ((b*b) - (4*a*c));
        
            x1 = ((-b + Math.sqrt(discriminante))/(2*a));
            x2 = ((-b - Math.sqrt(discriminante))/(2*a));
            System.out.print("Soluciones de la ecuacion de segundo grado: ");
            System.out.println(a + "x2 + " + b + "x + " + c);
            System.out.println("Tiene dos raices reales");
            System.out.println("La primera raiz es x1 = " + x1);
            System.out.println("La segunda raiz es x2 = " + x2);
            
            
 
        
    }
    
}
