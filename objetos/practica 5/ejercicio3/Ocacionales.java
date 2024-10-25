package Ejercicio3;

public class Ocacionales  extends Recital {
    private String motivo;
    private String nomContratante;
    private String diaEvento;
    
    public Ocacionales (String nom, int cantTemas, String mot, String contra, String dia){
        super(nom, cantTemas);
        this.setMotivo(mot);
        this.setNomContratante(contra);
        this.setDiaEvento(dia);
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    public String getNomContratante() {
        return nomContratante;
    }

    public void setNomContratante(String nomContratante) {
        this.nomContratante = nomContratante;
    }

    public String getDiaEvento() {
        return diaEvento;
    }

    public void setDiaEvento(String diaEvento) {
        this.diaEvento = diaEvento;
    }
    
    
    public String actuar(){
        String aux="";
        if (this.getMotivo().equals("beneficencia")){
            aux= "Recuerden colaborar con " + this.getNomContratante();
        }
        else 
            if (this.getMotivo().equals("show tv")){
                aux= "saludos amigos televidentes";
            }
        else
                aux= "feliz cumpleaños para " + this.getNomContratante();
           
        aux += super.actuar();
             
        return aux;
     }
    
   
   public double calcularCosto(){
       double aux;
       if (this.getMotivo().equals("beneficencia")){
           aux=0;
       }
       else
          if (this.getMotivo().equals("show tv")){
            aux=50000;  
       }
       else
              aux=150000;
       
      return aux;
   }
   
   
}
