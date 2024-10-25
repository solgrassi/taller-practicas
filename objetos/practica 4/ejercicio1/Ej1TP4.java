
package tema4.ejercicio1;

import tema4.*;

public class Ej1TP4 {

    
    public static void main(String[] args) {
        Circulo cir = new Circulo (10, "Amarillo", "Negro");
        Triangulo tri = new Triangulo (5,4,3, "negro", "violeta");
        
        System.out.println(cir);
        System.out.println(tri);
        
        cir.despintar();
        
        System.out.println(cir);
    }
    
}
