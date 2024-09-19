/* Analice el programa Ej01Tabla2.java, que carga un vector que representa la tabla
del 2.
Genere enteros aleatorios hasta obtener el número 11. Para cada número muestre
el resultado de multiplicarlo por 2 (accediendo al vector). */

package tema1;

import PaqueteLectura.GeneradorAleatorio;

public class Ej01Tabla2 {

    /**
      *@param args
     */
     
    public static void main(String[] args) {
        GeneradorAleatorio.iniciar();
        int DF=11;  
        int [] tabla2 = new int[DF]; // indices de 0 a 10
        int i;
        for (i=0;i<DF;i++) 
            tabla2[i]=2*i;
        System.out.println("2x" + "5" + "="+ tabla2[5]);
        int num= GeneradorAleatorio.generarInt(12);
        while (num!= 11){
           System.out.println("2x" + num + "="+ tabla2[num]);
           num= GeneradorAleatorio.generarInt(12);
        }
    }
    
}
