
package Clases;

public class PruebaPila{

    public static void rellenar(ColeccionInterfaz Nuevo){
        for(int i=0;i<=10;i++){
            Nuevo.añadir(i);
        }
    }
    
    public static void imprimirYVaciar(ColeccionInterfaz objeto) {
        while (!objeto.estaVacia()) {
            System.out.println(objeto.extraer());
        }
    }
    
    
    public static void main(String[] args) {
        Pila Prueba = new Pila(10);
        rellenar(Prueba);
        System.out.println("La pila: " + Prueba);
        imprimirYVaciar(Prueba);
        System.out.println("Ahora la pila es: " + Prueba);
    }
}
