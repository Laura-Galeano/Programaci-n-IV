/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto1;

/**
 *
 * @author LAURA
 * Ejercicio E.
 */
public class Disco extends Multimedia {
    private Genero genero;

    public Disco(String titulo, String autor, Formato formato, int duracion, Genero genero) {
        super(titulo, autor, formato, duracion);
        this.genero = genero;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public String toString() {
        return super.toString() + "\nGenero: " + genero;
    }
    
}
