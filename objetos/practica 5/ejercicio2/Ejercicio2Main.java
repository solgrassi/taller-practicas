
package Ejercicio2;

/*Realice un programa que instancie un estacionamiento con 3 pisos y 3 plazas por piso.
Registre 6 autos en el estacionamiento en distintos lugares.
Muestre la representación String del estacionamiento en consola.
Muestre la cantidad de autos ubicados en la plaza 1.
Lea una patente por teclado e informe si dicho auto se encuentra en el estacionamiento
o no. En caso de encontrarse, la información a imprimir es el piso y plaza que ocupa.
*/
import PaqueteLectura.*;

public class Ejercicio2Main {

    
    public static void main(String[] args) {
        GeneradorAleatorio.iniciar();
         Estacionamiento esta= new Estacionamiento ("estacionamiento", "45 y 1", 07.00, 17.30, 3, 3);
        
        int autosAgregados = 0;
        for (int piso = 0; piso < 3; piso++) {
            for (int plaza = 0; plaza < 3; plaza++) {
                if (autosAgregados < 6) {
                    Auto aut = new Auto(GeneradorAleatorio.generarString(10), GeneradorAleatorio.generarString(6));
                    esta.agregarAuto(aut, piso, plaza);
                    autosAgregados++;
                }
            }
        }
        
         
         System.out.println(esta);
         System.out.println("la cantidad de autos en la plaza 1 es de: " + esta.totAutosPlaza(1) );
         System.out.println("ingrese la patente a buscar");
         String aux= Lector.leerString();
         System.out.println(esta.buscarAuto(aux));
         
    }
    
}