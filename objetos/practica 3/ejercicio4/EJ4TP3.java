package tema3.ejercicio4;


public class EJ4TP3 {

    /*Realice un programa que instancie un hotel, ingrese clientes en distintas habitaciones,
muestre el hotel, aumente el precio de las habitaciones y vuelva a mostrar el hotel.*/
    
    public static void main(String[] args) {
        Hotel hote = new Hotel(5);
        
        
        Persona cli= new Persona("sol", 45863690, 20);
        hote.agregarCliente(cli, 4);
        Persona cli2= new Persona("mariano", 40678897, 21);
        hote.agregarCliente(cli2, 0);
        Persona cli3 = new Persona("natalia", 30575127, 41);
        hote.agregarCliente(cli3, 3);
        System.out.println(hote.toString());
        
        hote.aumentarCosto(100.0);
        System.out.println(hote.toString());
    }
    
}
