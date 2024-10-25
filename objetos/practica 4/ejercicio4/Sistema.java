
package tema4.Ejercicio4;


public abstract class Sistema {
    private Estacion esta;
    private int anioBase;
    private int cantAnios;
    private double [][] tMensual;
    
    public Sistema(Estacion es, int A, int N){
        setEsta(es);
        setAnioBase(A);
        setCantAnios(N);
        tMensual= new double [N][12];
        for (int i=0;i<N; i++){
            for (int j=0; j<12; j++){
                tMensual[i][j]= 100;
            }
        }
    }

    public Estacion getEsta() {
        return esta;
    }

    public void setEsta(Estacion esta) {
        this.esta = esta;
    }

    public int getAnioBase() {
        return anioBase;
    }

    public void setAnioBase(int anioBase) {
        this.anioBase = anioBase;
    }

    public int getCantAnios() {
        return cantAnios;
    }

    public void setCantAnios(int cantAnios) {
        this.cantAnios = cantAnios;
    }
    
  
    public void setTemp (int mes, int anio, double temp){
        tMensual[anio - anioBase][mes-1]= temp;
    }
    
    public double getTemp (int mes, int anio){
        return tMensual [anio-anioBase][mes-1]; 
    }
    
    
    public String getMaxTemp (){
        int maxAnio=-1;
        int maxMes=-1;
        double max= -100; 
        for (int i=0; i<cantAnios; i++){
            for (int j=0; j <12;j++){
                if(tMensual[i][j]> max){
                    max= tMensual[i][j];
                    maxAnio=i;
                    maxMes=j;
                }
            }
    }
     return "la temperatura maxima fue en el año: " + (maxAnio + getAnioBase()) + " y en el mes: " + (maxMes +1);
    }
    
    public abstract String promedio();
    
    public String toString (){
        return esta.toString() + promedio();
    }
}
