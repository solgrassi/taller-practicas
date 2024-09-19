/* Un edificio de oficinas está conformado por 8 pisos (1..8) y 4 oficinas por piso
(1..4). Realice un programa que permita informar la cantidad de personas que
concurrieron a cada oficina de cada piso. Para esto, simule la llegada de personas al
edificio de la siguiente manera: a cada persona se le pide el nro. de piso y nro. de
oficina a la cual quiere concurrir. La llegada de personas finaliza al indicar un nro.
de piso 9. Al finalizar la llegada de personas, informe lo pedido.
*/
package tema1;

/**
 *
 * @author estudiante
 */

import PaqueteLectura.Lector;

public class Ej04Edificio {
    public static void main(String[] args) {
    int [][] edificio= new int [8][4];
    //incializo en 0.
    int i;
    int j;
    for (i=0; i<8; i++){
        for (j=0; j<4; j++){
            edificio[i][j]= 0;
        }
    }
    //leo personas. 
    int piso;
    int ofi;
    System.out.println("ingrese el numero de piso y ofi");
    piso = Lector.leerInt();
    ofi = Lector.leerInt();
    while (piso != 9){ 
        edificio[piso][ofi]++;
        System.out.println("ingrese el numero de piso y ofi");
        piso = Lector.leerInt();
        ofi = Lector.leerInt();
    }
    
    //informar
    for (i=0; i<8; i++){
        for (j=0; j<4; j++)
            System.out.println("la cant de personas en el piso " + i + " en la ofi " + j + " es de: "+ edificio[i][j]);
    }
    }

}
