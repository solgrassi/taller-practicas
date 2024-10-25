package tema4.ejercicio1;

import tema4.*;


public class Circulo extends Figura {
  private double radio;
  
  public  Circulo (double ra, String re, String li){
    super(re,li);
    this.setRadio(ra);
  }
 
    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

 
    public double calcularPerimetro (){
      return (2* Math.PI * radio); 
    }
    
    public double calcularArea (){
        return (Math.PI * Math.pow(radio, 2));
    }

    public String toString() {
        String aux= super.toString() + " el radio: " + this.getRadio(); 
        return aux;
    }
    
    
}
