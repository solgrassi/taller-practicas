
package tema4.ejercicio2;

/*Realizar un programa que instancie un jugador y un entrenador. Informe la
representación String de cada uno.*/ 

public class ejercicio2tp4 {

    public static void main(String[] args) {
        Jugador juga = new Jugador ("Juan", 1000, 5, 10, 5);
        Entrenador entre = new Entrenador ("Hector", 2000, 15, 6);
        
        System.out.println(juga);
        System.out.println(entre);
    }
    
}
