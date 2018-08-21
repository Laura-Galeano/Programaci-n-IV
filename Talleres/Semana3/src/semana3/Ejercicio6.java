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
public class Ejercicio6 {
    public static void main(String[] args){
        int dias;
        int mes;
        int semana;
        int horas= 3200;
        
        dias= horas/24;
        semana= dias/7;
        mes= semana/4;
        System.out.println(horas + " horas equivalen a: " + dias + " días," + semana + " semanas, y " + mes + " meses.");
        
    }
}
