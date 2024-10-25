
package Ejercicio1;


public class Proyecto {
   private String nomProyecto;
   private int codigo;
   private String nomDirector;
   private Investigador [] investigadores;
   private int cantInvestigadores=0;
   
   public Proyecto ( String nom, int codigo, String dire){
       setNomProyecto(nom);
       setCodigo(codigo);
       setNomDirector(dire);
       investigadores = new Investigador [50];
   }

    public String getNomProyecto() {
        return nomProyecto;
    }

    public void setNomProyecto(String nomProyecto) {
        this.nomProyecto = nomProyecto;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNomDirector() {
        return nomDirector;
    }

    public void setNomDirector(String nomDirector) {
        this.nomDirector = nomDirector;
    }
    
    public void agregarInvestigador (Investigador inv){
        if (cantInvestigadores<50) {
        investigadores[cantInvestigadores]= inv;
        cantInvestigadores++; 
        }
    }
     
    public double dineroTotalOtorgado(){
       double aux=0;
       for (int i=0; i<cantInvestigadores; i++){
       aux += investigadores[i].totSubsidios();
       }
       return aux;
    }
    
    public void otorgarTodos(String unNombre){
        int i=0;
        while (!investigadores[i].getNomInvestigador().equals(unNombre) && i< cantInvestigadores){
            i++;
        }
        if ( i<cantInvestigadores){
            investigadores[i].siATodo();
        }
    }
   
    
    public String toString(){
        String aux= "el nombre del proyecto es: " + this.getNomProyecto() + ", el codigo es" + this.getCodigo() +
                    ", el nombre del director es: " + this.getNomDirector() + ", el total del dinero otorgado del proyecto es de: " +
                    this.dineroTotalOtorgado() + ". " +
                    "\n" + " la informacion de cada investigador: \n " ;
        String aux2="";
        for (int i=0; i<cantInvestigadores;i++ ){
            aux2+= investigadores[i].toString() + " \n";
        }
        return aux + aux2;
    }
   
}
