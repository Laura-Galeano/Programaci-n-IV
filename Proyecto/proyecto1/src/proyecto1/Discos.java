/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto1;

/**
 *
 * @author LAURA
 * Ejericicio F.
 */
public class Discos {
    public static void main(String[] args) {
        ListaMultimedia lista = new ListaMultimedia(20);
        Disco disco;
        lista.add(new Disco("Hopes and Fears", "Keane", Formato.mp3, 45, Genero.pop));
        lista.add(new Disco("Impossible", "James Arthur", Formato.dvd, 45, Genero.pop));

        lista.add(new Disco("Ahora quien", "Marc Anthony", Formato.cdAudio, 50, Genero.salsa));
        System.out.println(lista.toString());
        disco = new Disco("Ahora quien","Marc Anthony", null, 0, null);

    }
}
