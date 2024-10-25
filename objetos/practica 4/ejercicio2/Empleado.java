
package tema4.ejercicio2;

public abstract class Empleado {
    private String nombre;
    private double sueldoB;
    private int antiguedad;
    
    public Empleado (String nom, double suel, int anti){
       setNombre(nom);
       setSueldoB(suel);
       setAntiguedad(anti);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSueldoB() {
        return sueldoB;
    }

    public void setSueldoB(double sueldoB) {
        this.sueldoB = sueldoB;
    }

    public int getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }
    
    public String toString (){
        String aux= " el nombre del empleado es " + getNombre() + " su sueldo a cobrar es de:"
                + this.calcularSueldoACobrar() + " y su efectividad es de: " + this.calcularEfectividad(); 
        return aux;
    }
    
    public abstract double calcularEfectividad();
    
    public double calcularSueldoACobrar(){
        double antigu= (this.getSueldoB() * (0.10 * this.getAntiguedad()));
        double aux= (this.getSueldoB() + antigu);
        return (double) aux;
    }
    
}
