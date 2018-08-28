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
        float dias;
        float semana;
        float horas;
        float tiempo = 1000;
        
        semana = tiempo/(24*7);
        dias = (semana - (int)semana)*7;
        horas = (dias - (int)dias)*24;
        System.out.println(tiempo + " horas equivalen a: " + (int)semana + " semanas," + (int)dias + " dias, y " + (int)horas + " horas.");
        
    }
}
