/*Utilizando la clase Persona. Realice un programa que almacene en un vector a lo sumo
15 personas. La información (nombre, DNI, edad) se debe generar aleatoriamente hasta
obtener edad 0. Luego de almacenar la información:
- Informe la cantidad de personas mayores de 65 años.
- Muestre la representación de la persona con menor DNI.*/

package tema2;

import PaqueteLectura.GeneradorAleatorio; 
        
public class TP2EJ2 {
    
    public static void main(String[] args) {
        GeneradorAleatorio.iniciar();
      
        //variables
        Persona [] vector = new Persona [14];
       int DL =0;
       int edad; int dni; String nombre;
       int cont=0;
       int i;
       int min= 2000;
       int aux=0;
      
       //cargar vector
       edad= GeneradorAleatorio.generarInt(80);
       while (edad != 0 && DL <14) {
           vector[DL] = new Persona();
           vector[DL].setEdad(edad);
           nombre= GeneradorAleatorio.generarString(10);
           vector[DL].setNombre(nombre);
           dni = GeneradorAleatorio.generarInt(1000);
           vector[DL].setDNI(dni); 
           DL++;
           edad= GeneradorAleatorio.generarInt(80);
          
       }
       
       //cant personas mayores a 65
       for (i=0; i<DL; i++) {
           if (vector[i].getEdad()> 65)
               cont++;
       }
       System.out.println(" la cantidad de personas mayores a 65 años es de: " + cont);
       
       //persona con menor dni
       for (i=0; i<DL; i++) {
           if (vector[i].getDNI() < min) {
               min= vector[i].getDNI();
               aux=i;
           }
       }
       System.out.println(vector[aux].toString());
       
       //control
       for (i=0; i<DL; i++){
           System.out.println(vector[i].toString());
       }
       
    }
}
