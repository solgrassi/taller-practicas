
package Ejercicio4;

import PaqueteLectura.Lector;
public class Ejercicio4Main {

    
    public static void main(String[] args) {
        
        Director direc1 = new Director("Matias", 555, 18,3);
        Semicircular corosemic = new Semicircular( "CoroSemic", direc1, 3);
        Corista corista1 = new Corista("Pepe", 23, 4567, 3);
        Corista corista2 = new Corista("Juan",34, 444, 2);
        Corista corista3 = new Corista("Rocio", 56, 666, 1);
        corosemic.agregarCorista(corista1);
        corosemic.agregarCorista(corista2);
        corosemic.agregarCorista(corista3);
        System.out.println(corosemic.toString()); 
        System.out.println("esta el coro semicircular lleno? " + corosemic.estaLLeno());
        System.out.println("esta el coro semicircular bien formado? " + corosemic.estaBienFormado());
        
        System.out.println("-------------------");
        
        Director direc2 = new Director("Lucio", 222, 21,2);
        Hileras corohil = new Hileras("CoroHileras", direc2, 4, 2);
        Corista corista4 = new Corista("Gonzalo", 34,542, 3);
        Corista corista5 = new Corista("Veronica", 45, 324, 3);
        Corista corista6 = new Corista("Laura", 56, 675, 2);
        Corista corista7 = new Corista("Eduardo", 45, 338, 2);
        Corista corista8 = new Corista("Victoria", 19, 427, 1);
        Corista corista9 = new Corista("Cecilia",78, 926, 1);
        corohil.agregarCorista(corista4);
        corohil.agregarCorista(corista5);
        corohil.agregarCorista(corista6);
        corohil.agregarCorista(corista7);
        corohil.agregarCorista(corista8);
        corohil.agregarCorista(corista9);
        System.out.println(corohil.toString());
        System.out.println("esta lleno el coro en hileras? " + corohil.estaLLeno());
        System.out.println("esta bien formado el coro en hileras? " + corohil.estaBienFormado());
       
    
    }
    
}
