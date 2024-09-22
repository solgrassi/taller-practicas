/* Se realizará un casting para un programa de TV. El casting durará a lo sumo 5 días y en
cada día se entrevistarán a 8 personas en distinto turno.
a) Simular el proceso de inscripción de personas al casting. A cada persona se le pide
nombre, DNI y edad y se la debe asignar en un día y turno de la siguiente manera: las
personas primero completan el primer día en turnos sucesivos, luego el segundo día y así
siguiendo. La inscripción finaliza al llegar una persona con nombre “ZZZ” o al cubrirse los
40 cupos de casting.
Una vez finalizada la inscripción:
b) Informar para cada día y turno asignado, el nombre de la persona a entrevistar.*/

package tema2;

import PaqueteLectura.GeneradorAleatorio; 

public class TP2EJ3 {

    public static void main(String[] args) {
       GeneradorAleatorio.iniciar();
       
       //variables
       Persona [][] matriz= new Persona[8][5];
       int DLdia =0;
       String nom; int dni; int edad;
       int i=0; int j;
       
       //a)cargar inscripcion
       nom= GeneradorAleatorio.generarString(3);
        while (!nom.equals("zzz") && i<5){
            j=0;
            while (!nom.equals("zzz") && j<8){
             matriz [j][i]= new Persona ();
             matriz[j][i].setNombre(nom);
             edad= GeneradorAleatorio.generarInt(100);
             matriz[j][i].setEdad(edad);
             dni = GeneradorAleatorio.generarInt(1000);
             matriz[j][i].setDNI(dni); 
             nom= GeneradorAleatorio.generarString(3);
             j++;
            }
         i++;
         DLdia++;
        }
       
        
       //b)informar
       for (i=0; i<DLdia; i++){
           for (j=0; j<8; j++){
               if (matriz[j][i] != null) {
               System.out.println("el nombre de la persona a entrevistar en el dia " + i + "en el turno " + j + " es: " + matriz[j][i].getNombre());
               }
           }
       }
       
    }
    
}
