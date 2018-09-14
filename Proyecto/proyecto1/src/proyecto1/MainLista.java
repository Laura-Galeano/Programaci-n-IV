/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto1;

/*
 *
 * @author LAURA
ejericicio d.
 */

public class MainLista {
    public static void main(String[] args) {

        ListaMultimedia lista = new ListaMultimedia(10);
        Pelicula pelicula;
        int posicion;
        lista.add(new Pelicula("The room", "Laura Galeano", Formato.avi, 137, "Laura Galeano","Sofia Ossa"));
        lista.add(new Pelicula("Mar adentro", "Carlos Alberto", Formato.wav, 125, "Melany Serna", "Belen Rueda"));
        lista.add(new Pelicula("El aviador", "Martin Scorsese", Formato.dvd, 168, "Leonardo di Caprio", null));

        System.out.println(lista.toString());

    }
    
    
}
