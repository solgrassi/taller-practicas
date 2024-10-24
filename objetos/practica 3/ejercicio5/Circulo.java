package tema3.ejercicio5;

import tema3.*;


public class Circulo {
  private double radio;  
  private String relleno;
  private String linea;
  
  public  Circulo (double ra, String re, String li){
    radio=ra;
    relleno=re;
    linea=li;
  }
  
 public Circulo(){
     
 }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public String getRelleno() {
        return relleno;
    }

    public void setRelleno(String relleno) {
        this.relleno = relleno;
    }

    public String getLinea() {
        return linea;
    }

    public void setLinea(String linea) {
        this.linea = linea;
    }
 
    public double calcularPerimetro (){
      return (2* Math.PI * radio); 
    }
    
    public double calcularArea (){
        return (Math.PI * Math.pow(radio, 2));
    }

    @Override
    public String toString() {
        return "el circulo tiene un radio de: " + this.getRadio() + "su relleno es de color " + this.getRelleno() + "y su linea " + this.getLinea();
    }
    
    
}
