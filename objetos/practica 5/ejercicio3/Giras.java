
package Ejercicio3;


public class Giras extends Recital{
    private String nombreG;
    private Fecha [] fechas;
    private int actual;
    private int dl;
    
    public Giras(String nom, int listaTemas, String giraN, int cantFechas){
        super(nom,listaTemas);
        this.setNombreG(giraN);
        fechas = new Fecha [cantFechas];
        dl=0; 
        actual=0;
    }

    public String getNombreG() {
        return nombreG;
    }

    public void setNombreG(String nombreR) {
        this.nombreG = nombreR;
    }

    public int getActual() {
        return actual;
    }

    public void setActual(int actual) {
        this.actual = actual;
    }
    
  
    public void agregarFecha (Fecha fec){
        fechas[dl]= fec;
        dl++;
    }
    
    public String actuar(){
        String aux= "buenas noches " + fechas[actual].getCiudad();
        aux += "\n" + super.actuar();
        actual++;
        
       return aux;  
    }
    
    
    public double calcularCosto(){
        double aux= (3000 * dl);
        return (double) aux;
    }
    
}
