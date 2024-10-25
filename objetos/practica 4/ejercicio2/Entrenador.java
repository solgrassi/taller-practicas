
package tema4.ejercicio2;


public class Entrenador extends Empleado {
    private int campeonatos;

    
    public Entrenador (String nom, double sueldo, int antig, int camp){
        super(nom,sueldo,antig);
        setCampeonatos(camp);      
    }
    
    
    public int getCampeonatos() {
        return campeonatos;
    }

    public void setCampeonatos(int campeonatos) {
        this.campeonatos = campeonatos;
    }
    
    public double calcularEfectividad(){
        double aux= (double) getCampeonatos()/ (double ) this.getAntiguedad(); 
        return (double) aux;
    }
    
    public double calcularSueldoACobrar(){
        double aux= super.calcularSueldoACobrar();
        if (getCampeonatos()>= 1 && getCampeonatos()<= 4){
            aux+= 5000;
        }
        else 
            if (getCampeonatos()>= 5 && getCampeonatos()<= 10){
                aux+=30000;
            }
            else 
                if (getCampeonatos()> 10){
                    aux+= 50000;
                }
        return (double) aux;
    }    
}
