/*El dueño de un restaurante entrevista a cinco clientes y les pide que califiquen
(con puntaje de 1 a 10) los siguientes aspectos: (0) Atención al cliente (1) Calidad
de la comida (2) Precio (3) Ambiente.
Escriba un programa que lea desde teclado las calificaciones de los cinco clientes
para cada uno de los aspectos y almacene la información en una estructura. Luego
imprima la calificación promedio obtenida por cada aspecto.
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
