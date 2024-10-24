package tema3.ejercicio3;

import tema3.*;

/*- Defina una clase para representar estantes. Un estante almacena a lo sumo 20 libros.
Implemente un constructor que permita iniciar el estante sin libros. Provea métodos para:
(i) devolver la cantidad de libros que almacenados (ii) devolver si el estante está lleno
(iii) agregar un libro al estante (iv) devolver el libro con un título particular que se recibe.*/

public class Estante {
   private Libro[] estante;
   private int DL;
   
   public Estante (){
    estante = new Libro[20];
    DL = 0;    
   }
   
   public int cantLibros (){
     return DL;
   }
   
   public void agregarLibro (Libro libr){
       if (DL < 20 && libr!=null){
           estante[DL]=(libr);
           DL++;
       }
   }
   
   public boolean estaLleno (){
       if (DL==20) {
           return true;
       }
       else 
           return false;
   }
   
   /*devolver el libro con un título particular que se recibe.*/
   
   public Libro buscarLibro (String titulo){
       int i=0;
       boolean esta= false;
       while ((i < DL) && (esta==false)){
           if (estante[i].getTitulo().equals(titulo)){
              esta= true;
           }
           else
               i++;
       } 
     if (esta)
        return estante[i];
     else
         return null;
   }
   
   
 

   
   
}
