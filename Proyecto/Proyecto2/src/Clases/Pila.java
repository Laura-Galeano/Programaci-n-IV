
package Clases;

public class Pila implements ColeccionInterfaz {
    
    private Object[] array;
    
    private int C;
    
    public Pila(int tamaño) {
        array = new Object[tamaño];
        C = 0;
}

    public boolean estaVacia() {
        return C == 0;        
    }

    
    public Object extraer() {
        if(estaVacia()){
            return ("El elemento que desea extraer no existe");
        }else{
            
            return array[-C];
        }
    }
    
    
    public Object primero() {
        if (estaVacia()) {
            return ("El elemento que desea extraer no existe");
        }else{
           return array[C-1];
        }
    }
    
    
    public boolean añadir(Object objeto) {
        if (C == array.length) {
            return false;
        }else{
            array[C] = objeto;
            C++;
            return true;
        }
    }
    
    
    public String toString() {
        String s ="";
        
        for (int i = C-1; i >= 0;i--) {
        s += array[i].toString();
        }      
        return s;
    }  
}
