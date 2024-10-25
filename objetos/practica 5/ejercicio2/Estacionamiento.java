
package Ejercicio2;


public class Estacionamiento {
    private String nombre;
    private String direccion;
    private double horaApertura;
    private double horaCierre;
    private Auto [][] autos;
    private int pisos;
    private int plazas;

    
    public Estacionamiento (String nom, String dir){
       this.setNombre(nom);
       this.setDireccion(dir);
       this.setHoraApertura(8.00);
       this.setHoraCierre(21.00);
       autos = new Auto [5][10];// java inicializa toda la matriz en null
    }
  
    public Estacionamiento (String nom, String dir, double horaA,double horaC, int pisos, int plazas ){
        this.setNombre(nom);
       this.setDireccion(dir);
       this.setHoraApertura(horaA);
       this.setHoraCierre(horaC);
       this.setPisos(pisos);
       this.setPlazas(plazas);
       autos = new Auto [pisos][plazas];// java inicializa toda la matriz en null
    }

    public int getPisos() {
        return pisos;
    }

    public void setPisos(int pisos) {
        this.pisos = pisos;
    }

    public int getPlazas() {
        return plazas;
    }

    public void setPlazas(int plazas) {
        this.plazas = plazas;
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public double getHoraApertura() {
        return horaApertura;
    }

    public void setHoraApertura(double horaApertura) {
        this.horaApertura = horaApertura;
    }

    public double getHoraCierre() {
        return horaCierre;
    }

    public void setHoraCierre(double horaCierre) {
        this.horaCierre = horaCierre;
    }
    
    public void agregarAuto (Auto a, int X, int Y){
        autos[X][Y]=a;
    }
    
   
   public String buscarAuto(String pat) {
    int i = 0;
    boolean esta = false;
    String aux = "";
    while (i < pisos && !esta) {
        int j = 0;
        while (j < plazas && !esta) {
            if (autos[i][j] != null && autos[i][j].getPatente().equals(pat)) {
                esta = true;
                aux = "El número de piso es " + i + " y el número de plaza es " + j;
            }
            j++;
        }
        i++;
    }
    if (!esta) {
        aux = "Auto inexistente";
    }
    return aux;
}
    
    public int totAutosPlaza (int Y){
        int aux=0;
        for (int i=0; i< pisos; i++){
            if (autos[i][Y]!= null){
                aux++;
            }
        }
        return aux;
    }
    
    public String toString (){
        String aux="";
        for (int i=0; i<pisos; i++){
            for (int j=0; j<plazas; j++){
                if (autos[i][j]==null){
                    aux+= "Piso " + i + " Plaza" + j + " libre \n"; 
                }
                else 
                    aux+= "Piso " + i + " Plaza" + j + autos[i][j].toString() +"\n";
            }
        }
        return aux;
    }
    
}
