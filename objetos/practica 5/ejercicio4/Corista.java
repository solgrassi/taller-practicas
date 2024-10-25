
package Ejercicio4;


public class Corista extends Persona{
    private int tonoFundamental;
    
    public Corista (String nom, int edad, int dni, int tono){
        super(nom,edad,dni);
        this.setTonoFundamental(tono);
    }

    public int getTonoFundamental() {
        return tonoFundamental;
    }

    public void setTonoFundamental(int tonoFundamental) {
        this.tonoFundamental = tonoFundamental;
    }
    
    public String toString (){
        return (super.toString() + "soy corista, mi tono fundamental es: " + getTonoFundamental() + "." + "\n"); 
    }
}
