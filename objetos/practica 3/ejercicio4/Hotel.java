package tema3.ejercicio4;

public class Hotel {
    private Habitacion[] hotel;
    private int max;
    private int DL;
    
    public Hotel (int N){
    hotel = new Habitacion [N];
    max=N;
    DL=0;
    for (int i = 0; i < N; i++) {
            hotel[i] = new Habitacion();
    }
    }
    
    public void agregarCliente (Persona C, int X){
        hotel[X].setCliente(C);
        hotel[X].setEstado("ocupado");
    }
    
    public void aumentarCosto (double cos){
       for (int i=0; i<max ; i++){
          hotel[i].setCostoN(hotel[i].getCostoN() + cos);
       }
    }
    

    public String toString() {
        String aux = "";
        for (int i = 0; i < max; i++) {
            // Habitación N: costo, libre u ocupada, información del cliente si está ocupada
            aux= aux + " Habitacion: " + i + ":" + hotel[i].toString(); 
        }
        return aux;
    }

}  


    
