/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto1;

/**
 *
 * @author LAURA
 * Ejericicio c.
 */
public class ListaMultimedia {

    private Multimedia[] lista;
    private int contador;

    public ListaMultimedia(int capacidad) {
        lista = new Multimedia[capacidad];
        contador = 0;
    }

    public int size() {
        return contador;
    }

    private boolean llena() {
        return contador == lista.length;
    }

    public boolean add(Multimedia m) {
        if (llena()) {
            return false;
        } else {
            lista[contador] = m;
            contador++;
            return true;
        }
    }

    public Multimedia get(int posicion) {
        if (posicion == contador){
            throw new IndexOutOfBoundsException();
        }
        return lista[posicion];
    }

    public String toString() {
        String p = "";
        for (int i = 0; i < contador; i++) {
            p += lista[i].toString() + "\n";

        }
        return p;
    }

}
