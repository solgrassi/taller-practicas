/*Escriba un programa que defina una matriz de enteros de tamaño 5x5. Inicialice
la matriz con números aleatorios entre 0 y 30.
Luego realice las siguientes operaciones:
- Mostrar el contenido de la matriz en consola.
- Calcular e informar la suma de los elementos de la fila 1
- Generar un vector de 5 posiciones donde cada posición j contiene la suma
de los elementos de la columna j de la matriz. Luego, imprima el vector.
- Leer un valor entero e indicar si se encuentra o no en la matriz. En caso de
encontrarse indique su ubicación (fila y columna) en caso contrario
imprima “No se encontró el elemento”
*/

package tema1;
/**
 *
 * @author estudiante
 */
import PaqueteLectura.Lector;

public class Ej05Restaurante {
   public static void main  (String [] args){
       int [][] restau = new int [4][5];
       
       //leer opinion clientes
       int i; int j;
       for (i=0; i<5; i++){
           System.out.println("cliente numero: " + i); 
           for (j=0; j<4; j++){
               System.out.println("ingrese su opi de la cate: " + j);
               restau[j][i]= Lector.leerInt();
           }
       }
      double prom;
      for (j=0; j<4; j++){
          prom=0;
          for (i=0; i<5; i++){
              prom= prom + restau[j][i];
          }
          System.out.println ("el promedio para la categoria "+ j + " es de: "+ (prom/5));
           
      }
   }
}
