/*Escriba un programa que lea las alturas de los 15 jugadores de un equipo de
básquet y las almacene en un vector. Luego informe:
- la altura promedio
- la cantidad de jugadores con altura por encima del promedio
*/
package tema1;

import PaqueteLectura.Lector;


public class Ej02Jugadores {

  
    public static void main(String[] args) {
        int DF=7;
        double altura;
        double [] jugadores = new double [DF]; //vector de alturas.
         int i;  
         double prom=0;
         int cumplen=0;
        //cargar vector y sumar.
        for (i=0; i<DF; i++){
        System.out.println("ingrese la altura del jugador");
        altura = Lector.leerDouble();
        jugadores[i]= altura;
        prom= prom + altura;
        }
        // calcular promedio e infromar.
        prom= prom/DF; 
        System.out.println("el promedio de altura entre los jug es de: " + prom);
        //Paso 8: Recorrer el vector calculando lo pedido (cant. alturas que están por encima del promedio)
        for (i=0; i< DF; i++){
            if (jugadores[i]> prom)
              cumplen++;  
        }
        //informar la cantidad que cumplen con la condicion.
        System.out.println("la cantidad de jugadores que superan el promedio es: " + cumplen);
    }   
}

