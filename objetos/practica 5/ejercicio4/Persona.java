
package Ejercicio4;


public abstract class Persona {
    private String nombre;
    private int DNI;
    private int edad;
    
    public Persona (String nom, int ed, int dni){
        this.setDNI(dni);
        this.setEdad(ed);
        this.setNombre(nom);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDNI() {
        return DNI;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    public String toString (){
        return "el nombre es: " + getNombre() + ", el dni es: " + getDNI() + ", la edad es de: " + getEdad() + "." + "\n";
    }
}