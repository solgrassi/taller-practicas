
package Ejercicio4;


public abstract class Coro {
    private String nombre;
    private Director direc;
    
    public Coro (String nom, Director dir){
        this.setNombre(nom);
        this.setDirec(dir);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Director getDirec() {
        return direc;
    }

    public void setDirec(Director direc) {
        this.direc = direc;
    }
    
    public abstract void agregarCorista(Corista x);
    
   
    public abstract boolean estaLLeno();

    public abstract boolean estaBienFormado();
    
    public abstract String listaCorista();
    
    
    public String toString (){
        String aux= "El nombre del coro es " + getNombre() + "." + "\n";
        aux += getDirec().toString();
        aux += this.listaCorista();
        return aux;
    }
}
