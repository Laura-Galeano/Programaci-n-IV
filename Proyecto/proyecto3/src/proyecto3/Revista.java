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
public class Revista extends Biblioteca {
    private int numero;

    public Revista(String codigo, String titulo, int publicacion, int numero) {
    super(codigo, titulo, publicacion);
    this.numero = numero;
    }

    @Override
    public String toString() {
    return super.toString() + "Numero: " + numero;
    }
}
