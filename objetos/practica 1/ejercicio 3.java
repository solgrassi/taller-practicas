/*Escriba un programa que defina una matriz de enteros de tamaño 5x5. Inicialice
la matriz con números aleatorios entre 0 y 30.
Luego realice las siguientes operaciones:
- Mostrar el contenido de la matriz en consola.
- Calcular e informar la suma de los elementos de la fila 1
- Generar un vector de 5 posiciones donde cada posición j contiene la suma
de los elementos de la columna j de la matriz. Luego, imprima el vector.
- Leer un valor entero e indicar si se encuentra o no en la matriz. En caso de
encontrarse indique su ubicación (fila y columna) en caso contrario
imprima “No se encontró el elemento”.
*/

package tema1;

//Paso 1. importar la funcionalidad para generar datos aleatorios
import PaqueteLectura.GeneradorAleatorio;
import PaqueteLectura.Lector;
public class Ej03Matrices {

    public static void main(String[] args) {
	 //iniciar el generador aleatorio     
	 GeneradorAleatorio.iniciar();
        //definir la matriz de enteros de 5x5 e iniciarla con nros. aleatorios 
        int [][] matriz = new int [5][5];
        int i; int j;
        for (i=0; i<5; i++) {
            for (j=0; j<5; j++)
                matriz[i][j]= GeneradorAleatorio.generarInt(31);
        }
        //mostrar el contenido de la matriz en consola
        for (i=0; i<5; i++) {
            for (j=0; j<5; j++)
                System.out.println("pos"+ i + j + "num" + matriz[i][j]);
        }
        //calcular e informar la suma de los elementos de la fila 1
        int suma=0;
        for (j=0; j<5; j++)
            suma = suma + matriz [1][j];
        System.out.println ("la suma es" + suma);
        //suma el total por columna y lo guarda en el vector.
        int [] sumas = new int [5];
        int total=0;
        for (j=0; j<5; j++) {
            for (i=0; i<5; i++)
                total = total + matriz [i][j];
            sumas[j]= total;   
        }
        // impirme el vector.
        for (i=0; i<5; i++)
            System.out.println(" pos" + i + "suma" + sumas[i]);
        
        //leo un valor y lo busca en la matriz//
       
        System.out.println ("ingrese un valor a buscar");
        int valor = Lector.leerInt(); 
        boolean esta=false;
        
        for (i = 0; (i < 5 && !esta); i++) {
            for (j = 0; j < 5 && !esta; j++) {
                if (valor == matriz[i][j]) {
                    esta = true;
                    System.out.println("El elemento se encuentra en la posición: " + i + ", " + j);
                }
            }
        }
        if (!esta) {
            System.out.println("No se encontró el elemento");
        }
    }
}
