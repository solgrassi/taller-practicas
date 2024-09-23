package tema2;

/*Sobre un nuevo programa, modifique el ejercicio anterior para considerar que:
a) Durante el proceso de inscripción se pida a cada persona sus datos (nombre, DNI, edad)
y el día en que se quiere presentar al casting. La persona debe ser inscripta en ese día, en el
siguiente turno disponible. En caso de no existir un turno en ese día, informe la situación.
La inscripción finaliza al llegar una persona con nombre “ZZZ” o al cubrirse los 40 cupos de
casting.
Una vez finalizada la inscripción:
b) Informar para cada día: la cantidad de inscriptos al casting ese día y el nombre de la
persona a entrevistar en cada turno asignado.*/

import PaqueteLectura.GeneradorAleatorio; 

public class TP2EJ4 {
   
    public static void main(String[] args) {
       GeneradorAleatorio.iniciar();
       //variables
       Persona [][] matriz= new Persona[8][5];
       String nom; int dni; int edad; int dia;
       int i; int j=0;
       int totentre=0; 
       int [] dls = new int [5]; 
       
       
       //incializar vector de dls
       for (i=0; i<5; i++){
           dls[i]=0;
       }
       
       //incripción
       nom= GeneradorAleatorio.generarString(3);
       dia= GeneradorAleatorio.generarInt(5); 
       while (!nom.equals("ZZZ") && totentre<40){
           if (dls[dia]<8) {
               matriz [dls[dia]][dia]= new Persona (nom,GeneradorAleatorio.generarInt(1000),GeneradorAleatorio.generarInt(100));
               dls[dia]++;
               totentre++;
           }
           else 
               System.out.println("no queda cupo para ese dia");
           nom= GeneradorAleatorio.generarString(3);
           dia= GeneradorAleatorio.generarInt(5); 
       }
        
       //informar
       for (i=0; i<5; i++){
           System.out.println("la cantidad de inscriptos para el dia " + i + " es de: " + dls[i]);
           for (j=0;j<dls[i];j++){
               System.out.println("la persona en el turno " + j + " se llama: " + matriz[j][i].getNombre());    
           }
       }

      
    }
    
}
 
