
package Ejercicio3;


public abstract class Recital {
   private String nomBanda;
   private String [] temas;
   private int dl;
   
   public Recital(String nom, int cant){
       this.setNomBanda(nom);
       temas = new String [cant];
       dl=0;
   }

    public String getNomBanda() {
        return nomBanda;
    }

    public void setNomBanda(String nomBanda) {
        this.nomBanda = nomBanda;
    }
    
  
    public void agregarTema (String tema){
        temas[dl]= tema;
        dl++;
    }
    
    public String actuar(){
        String aux="";
        for (int i=0; i<dl; i++){
            aux+= " y ahora tocaremos..." + temas[i] + "\n"; 
        }
        return aux;
    }
    
  
    public double calcularCosto(){
        double aux= this.calcularCosto();
        return aux;
    } 
}
