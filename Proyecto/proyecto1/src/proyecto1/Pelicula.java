/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto1;

/**
 *
 * @author LAURA
 * Ejercicio b.
 */
public class Pelicula extends Multimedia{
    public String actor;
    public String actriz;
    
    public Pelicula(String titulo,String autor,Formato formato, int duracion,String actor, String actriz){
        super(titulo,autor,formato,duracion);
        if (actor == null && actriz == null) {
            throw new IllegalArgumentException("tienes los dos parametros vacios");
        }
        this.actor = actor;
        this.actriz = actriz;
    
}
    public String getActor (){
        return actor;
    }
    public void setActor(String actor) {
        this.actor = actor;
    }
    public String getActriz (){
        return actriz;
    }
    public void setActriz(String actriz) {
        this.actriz = actriz;
    }
    public String toString() {
        String p = "pelicula{";
        if (actriz != null) {
            p += " Actriz principal: " + actriz;
            if (actor != null) {
                p += " y Actor principal: " + actor + "}";
            }
        } else {
            assert actor != null;
            p += actor;
        }
        return super.toString() + p;
    }
 
   
    
 
}   
