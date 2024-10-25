
package Ejercicio3;

import PaqueteLectura.GeneradorAleatorio;

public class Ejercicio3Main {

    /*Realice un programa que instancie un evento ocasional y una gira, cargando la
información necesaria. Luego, para ambos, imprima el costo e invoque al mensaje actuar.*/ 
    
    public static void main(String[] args) {
        GeneradorAleatorio.iniciar();
        Ocacionales oca = new Ocacionales ("Lolla", 5, "show privado", "sol grassi", "12/08");
        Giras gir = new Giras ("Harry style", 5, "love on tour", 2 );
        
        for (int i=0; i<5; i++){
            oca.agregarTema(GeneradorAleatorio.generarString(5));
            gir.agregarTema(GeneradorAleatorio.generarString(5));  
        }
        
         Fecha fecha= new Fecha ("buenos aires", "12/08");
         gir.agregarFecha(fecha);
         Fecha fecha2= new Fecha ("santiago del estero", "31/04");
         gir.agregarFecha(fecha2);
         
         System.out.println("el costo de la gira es: " + (double) gir.calcularCosto() );
         System.out.println("el costo del evento es: " + (double) oca.calcularCosto() );
         
         System.out.println(gir.actuar());
         System.out.println(oca.actuar());
    }
    
}
