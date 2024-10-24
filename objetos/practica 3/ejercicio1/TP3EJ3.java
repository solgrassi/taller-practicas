
package tema3.ejercicio3;

/*Realice un programa que instancie un estante. Cargue varios libros. A partir del estante,
busque e informe el autor del libro “Mujercitas”.*/
import tema3.*;
import PaqueteLectura.GeneradorAleatorio;
public class TP3EJ3 {

    public static void main(String[] args) {
        GeneradorAleatorio.iniciar();
        Estante estante1 = new Estante();
        int i;
       
        for (i=0;i <20; i++){
            Autor aut = new Autor (GeneradorAleatorio.generarString(10), GeneradorAleatorio.generarString(50), GeneradorAleatorio.generarString(10)); 
            String tit= GeneradorAleatorio.generarString(5);
            String edi = GeneradorAleatorio.generarString(5);
            int anioed = GeneradorAleatorio.generarInt(2024);
            String isbn = GeneradorAleatorio.generarString(4);
            double precio = GeneradorAleatorio.generarDouble(10000);
           Libro li = new Libro (tit, edi,anioed ,aut, isbn, precio );
           estante1.agregarLibro(li);
        }
        
        Libro lib = estante1.buscarLibro("mrtea");
        if (lib != null) {
            System.out.println(lib.getPrimerAutor());
        } else {
            System.out.println("El libro no se encontró.");
        }
        
    }
    }
    
