
package Ejercicio4;


public class Director extends Persona {
    private int antiguedad;
    
    public Director (String nom, int edad, int dni, int anti){
        super(nom,edad,dni);
        this.setAntiguedad(anti);
    }

    public int getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }
    
    public String toString(){
        String aux= super.toString() + "soy director, mi antiguedad es de: " + getAntiguedad() + " años." + "\n";
        return aux;
    }
}
