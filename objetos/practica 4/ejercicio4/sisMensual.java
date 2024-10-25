
package tema4.Ejercicio4;

public class sisMensual extends Sistema {
    private String[] meses = new String[]{"Enero", "Febrero", "Marzo",
        "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre",
        "Octubre", "Noviembre", "Diciembre"};
    
    public sisMensual (Estacion es, int aniob, int canta ){
        super(es,aniob,canta);
    }
    
    public String promedio() {
        String aux = "";
        double total;
        for (int j=0;j<12;j++){
            total = 0;
            for(int i=0;i<this.getCantAnios();i++){
                total += getTemp(j+1, i+this.getAnioBase());         
            }
            aux += meses[j]+": "+Math.round((total/this.getCantAnios())*100)/100.0+"°C \n";
        }
        return aux;
    }
    
    @Override
    public String toString() {
        return super.toString();
    }
    
}
