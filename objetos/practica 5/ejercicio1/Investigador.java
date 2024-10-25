
package Ejercicio1;


public class Investigador {
  private String nomInvestigador;
  private int categoria;
  private String especialidad;
  private Subsidio [] subsidios;
  private int cantSubsidios=0;
  
  public Investigador (String nom, int cate, String espe){
      setNomInvestigador(nom);
      setCategoria(cate);
      setEspecialidad(espe);
      subsidios= new Subsidio[5];
  }

    public String getNomInvestigador() {
        return nomInvestigador;
    }

    public void setNomInvestigador(String nomInvestigador) {
        this.nomInvestigador = nomInvestigador;
    }

    public int getCategoria() {
        return categoria;
    }

    public void setCategoria(int categoria) {
        this.categoria = categoria;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }
    
    public void agregarSubsidio(Subsidio unSubsidio){
        if (cantSubsidios<5){
            subsidios[cantSubsidios]= unSubsidio;
            cantSubsidios++;
        }
    }
    
    public double totSubsidios (){
        double aux=0;
        for (int i=0; i< cantSubsidios ; i++){
            if (subsidios[i].isOtorgado()){
                aux+= subsidios[i].getMonto();  
            }
        }
        return aux;
    }
    
    public void siATodo (){
        for (int i=0; i< cantSubsidios; i++){
            subsidios[i].setOtorgado(true);
        }
    }
   
    public String toString(){
        String aux= "el nombre del investigador es " + this.getNomInvestigador() + ", su categoria es: " +
                    this.getCategoria() + ", su especialidad es " + this.getEspecialidad() +
                    ", el total de dinero de subsidios otorgados es de:  " + (double) this.totSubsidios();
        return aux;
    }
    
}
