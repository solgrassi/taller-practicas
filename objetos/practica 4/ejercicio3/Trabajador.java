
package tema4.ejercicio3;


public class Trabajador extends Persona{
    private String rol;
    
   
    public Trabajador (String nom, int ed, int dni, String ro){
        super(nom,ed,dni);
        setRol(ro);
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }
    
    
    public String toString (){
        String aux = super.toString() + "Soy: " + getRol() +".";
        return aux;
    }
}
