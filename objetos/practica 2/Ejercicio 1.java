/*Realice un programa que cree un objeto persona con datos leídos desde teclado. Luego
muestre en consola la representación de ese objeto en formato String.*/

package tema2;

import PaqueteLectura.Lector; 

public class TP2EJ1 {
    
    public static void main(String[] args) {
        Persona p= new Persona();
        System.out.println("ingrese el nombre");
        String nom = Lector.leerString();
        System.out.println("ingrese DNI");
        int DNI = Lector.leerInt();
        System.out.println("ingrese su edad");
        int ed = Lector.leerInt();
        p.setNombre(nom);
        p.setDNI(DNI);
        p.setEdad(ed);
        System.out.println(p.toString());
    }  
} 
