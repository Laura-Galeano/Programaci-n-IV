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
public class Biblioteca {

    private String codigo;
    private String titulo;
    private int publicacion;

    public Biblioteca(String codigo, String titulo, int publicacion) {

    this.codigo = codigo;
    this.titulo = titulo;
    this.publicacion = publicacion;
    }
    
    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    
     public int getPublicacion() {
        return publicacion;
    }

    public void setPublicacion(int publicacion) {
        this.publicacion = publicacion;
    }
    @Override
    public String toString() {
        return "Publicacion {codigo=" + codigo + ", titulo=" + titulo + ", año de publicacion=" + publicacion + "}";
    }
    
    public static void main(String[] args) {
        Biblioteca[] biblioteca = { 
                new Libro("HKTF", "Cien años de soledad", 1967),
                new Revista("CCC5", "Condorito", 1949, 8234), 
                new Libro("CC3", "Amor en los tiempos de colera", 1985),
                new Revista("DRSL", "Semana", 1936, 856) 
        };
        
        Libro l = (Libro) biblioteca[0];
        l.prestar();
        for (Biblioteca p : biblioteca) {
            System.out.println(p);
        }
        System.out.println("Numero de publicaciones anteriores al año 1990: "+ Aplicacion.publicacionesAnterioresA(biblioteca, 1990));
        System.out.println("Numero de libros y revistas prestados: " + Aplicacion.cuentaPrestados(biblioteca));
    }
    
}
