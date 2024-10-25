package tema4.ejercicio3;

import tema2.*;


public class Persona{
    private String nombre;
    private int DNI;
    private int edad; 
    
    public Persona(String unNombre, int unaEdad, int unDNI){
        nombre = unNombre;
        DNI = unDNI;
        edad = unaEdad; 
    }
    
    public Persona(){
     
    }

    public int getDNI() {
        return DNI;
    }

    public int getEdad() {
        return edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setDNI(int unDNI) {
        DNI = unDNI;
    }

    public void setEdad(int unaEdad) {
        edad = unaEdad;
    }

    public void setNombre(String unNombre) {
        nombre = unNombre;
    }
    
    public String toString(){
     String aux= " Mi nombre es: " + this.getNombre() +
                   ", mi edad es: " + this.getEdad() +
                 ", mi dni es: " + this.getDNI() + ". "; 
     return aux;
    }
    
    
    
}
