/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto3;

/**
 *
 * @author LAURA
 */
public class Aplicacion {
    public static int cuentaPrestados(Object[] lista) {
        int contador = 0;
        
        for (Object obj : lista) {
            if (obj instanceof Prestable && ((Prestable) obj).prestado()) {
                contador++;
            }
        }
        return contador;
    }
    
     public static int publicacionesAnterioresA(Biblioteca[] lista, int publicacion) {
        int contador = 0;
        for (Biblioteca p : lista) {
            if (p.getPublicacion() < publicacion) {
                contador++;
            }
        }
        return contador;
    }
    
}
