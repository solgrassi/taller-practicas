package tema4.ejercicio1;

import tema4.*;


public class Triangulo extends Figura{
    private double ladoA;
    private double ladoB;
    private double ladoC;

    public Triangulo (double a, double b, double c, String relle, String line){
        super(relle, line);
        this.setLadoA(a);
        this.setLadoB(b);
        this.setLadoC(c);
    }
    
    public double getLadoA() {
        return ladoA;
    }

    public void setLadoA(double ladoA) {
        this.ladoA = ladoA;
    }

    public double getLadoB() {
        return ladoB;
    }

    public void setLadoB(double ladoB) {
        this.ladoB = ladoB;
    }

    public double getLadoC() {
        return ladoC;
    }

    public void setLadoC(double ladoC) {
        this.ladoC = ladoC;
    }
    
    public double calcularArea (){
       double s = (this.calcularPerimetro())/2;
       double aux = s*(s-this.getLadoA())*(s-this.getLadoB())*(s-this.getLadoC()); 
       return Math.sqrt(aux);
    }
    
    public double calcularPerimetro (){
        double aux;
        aux = this.getLadoA()+this.getLadoB()+this.getLadoC();
        return (aux);
    }
    
    public String toString (){
        String aux = super.toString() + " lado A: " + this.getLadoA() + " lado B: " + this.getLadoB() + " lado c: " + this.getLadoC();
        return aux;
    }
}
