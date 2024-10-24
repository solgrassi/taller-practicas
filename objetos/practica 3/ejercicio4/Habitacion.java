package tema3.ejercicio4;

import PaqueteLectura.GeneradorAleatorio; 
public class Habitacion {
    private double costoN;
    private String estado;
    private Persona cliente;
   
  
    public Habitacion (){
       GeneradorAleatorio.iniciar();
       costoN= GeneradorAleatorio.generarDouble(6001) + 2000;
       estado="desocupada";
    }

    public Persona getCliente() {
        return cliente;
    }

    public void setCliente(Persona cliente) {
        this.cliente = cliente;
    }

    public double getCostoN() {
        return costoN;
    }

    public void setCostoN(double costoN) {
        this.costoN = costoN;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
   
    public String toString (){
        String aux= "El costo por noche es de: " + getCostoN() + ", su estado es: " + getEstado();
        if (getEstado().equals("ocupado")){
            aux += ", la info del cliente es:" + getCliente().toString();
    }
        return aux; 
        
    }
    
}
