
package tema4.Ejercicio4;

public class SisAnual extends Sistema {
    
    public SisAnual (Estacion e, int ini, int cant){
        super(e, ini, cant);
    }
    
    public String promedio(){
       String aux= "";
       double tot;
       for (int i=0; i< this.getCantAnios(); i++){
           tot=0;
           for (int j=0; j<12; j++){
               tot+= this.getTemp(j +1, i + this.getAnioBase());
           }
        aux+= "Año: " + (i + this.getAnioBase()) + (double) (tot/12.0) + "°C \n";
       }
       return aux;
    }
    
    public String toString(){
        return super.toString();
    }
    
}
