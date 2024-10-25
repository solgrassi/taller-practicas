
package tema4.ejercicio2;


public class Jugador extends Empleado {
    private int partidosJ;
    private int goles;

    public Jugador (String nom, double su, int an, int parti, int gol){
        super(nom,su,an);
        setPartidosJ(parti);
        setGoles(gol);
    }
    
    public int getPartidosJ() {
        return partidosJ;
    }

    public void setPartidosJ(int partidosJ) {
        this.partidosJ = partidosJ;
    }

    public int getGoles() {
        return goles;
    }

    public void setGoles(int goles) {
        this.goles = goles;
    }
    
    public double calcularEfectividad(){
        double aux= (double) getGoles() / (double) getPartidosJ();
        return (double) aux;
    }
    
    public double calcularSueldoACobrar (){
        double aux= super.calcularSueldoACobrar();
        if (this.calcularEfectividad()> 0.5){
          aux += getSueldoB();
        }
        return (double) aux;
    }
    
}
