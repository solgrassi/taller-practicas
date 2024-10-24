package tema3.ejercicio1;

import tema3.ejercicio1.Triangulo;
import PaqueteLectura.Lector; 

public class TP3EJ1B {

    /* Realizar un programa que instancie un triángulo, le cargue información leída desde
teclado e informe en consola el perímetro y el área.
    parametros: double ladoA, double ladoB, double ladoC, String re, String li*/
    
    public static void main(String[] args) {
     //variables
     double ladoA;
     double ladoB;
     double ladoC;
     String relleno;
     String linea;
     
     // leer info.
        System.out.println("ingrese la longitud del lado A, B y C");
            ladoA= Lector.leerDouble();
            ladoB= Lector.leerDouble();
            ladoC= Lector.leerDouble();
        System.out.println("ingresar color de relleno");
            relleno= Lector.leerString();
        System.out.println("ingresar color de linea");
            linea = Lector.leerString();
            
            
       // crear tringualo.
       Triangulo trian = new Triangulo (ladoA,ladoB, ladoC, relleno, linea); 
       
      //infromar perimetro 
        System.out.println("el perimetro del triangulo es de:" + trian.calcularPerimetro());
        
      //infromar perimetro 
        System.out.println("el area del triangulo es de:" + trian.calcularArea()); 
    }
    
}
