/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
Ejercicio A.
 */
package proyecto1;



public class Multimedia{

    protected String titulo;
    protected String autor;
    protected Formato formato;
    protected int duracion;
    
   public Multimedia(){
       
   }
 
    public Multimedia(String titulo,String autor,Formato formato,int duracion){
        this.titulo = titulo;
        this.autor = autor;
        this.formato = formato;
        this.duracion = duracion;
        
    }
    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    
    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
    public Formato getFormato() {
        return formato;
    }

    public void setFormato(Formato formato) {
        this.formato = formato;
    }
    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }
    
      public String toString(){
         return "Multimedia{"
                 + "Titulo=" + titulo
                 + ", Autor=" + autor
                 + ", Formato=" + formato
                 + ", Duracion=" + duracion
                 + "}"
                 ;
                 
     }
     public boolean equals(Multimedia m) {
        return titulo.equals(m.getTitulo()) && autor.equals(m.getAutor());
    }
   

    public static void main(String[] args) { 
        Multimedia ml = new Multimedia("pe","laura",Formato.mp3,13);
        Pelicula pel = new Pelicula("ho","lau",Formato.avi,2,"Juan","Sofia");
        
        System.out.println(ml);
        System.out.println(pel);


        
    }
    
   
  
    
}
