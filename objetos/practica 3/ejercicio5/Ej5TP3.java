
package tema3.ejercicio5;

import tema3.*;
 import PaqueteLectura.Lector;

public class Ej5TP3 {
    
    /* Realizar un programa que instancie un círculo, le cargue información leída de teclado e
informe en consola el perímetro y el área*/ 
    
    public static void main(String[] args) {
        Circulo cir = new Circulo ();
        
        System.out.println("ingrese el radio del circulo");
        cir.setRadio(Lector.leerDouble());
        System.out.println("ingrese el color de relleno");
        cir.setRelleno(Lector.leerString());
        System.out.println("ingrese el color de la linea");
        cir.setLinea(Lector.leerString());
        
        System.out.println("el area del circulo es de: " + cir.calcularArea());
        System.out.println("el perimetro del circulo es de: " + cir.calcularPerimetro());
    }
    
}
