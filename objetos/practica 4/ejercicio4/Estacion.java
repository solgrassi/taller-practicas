
package tema4.Ejercicio4;


public class Estacion {
    private String nombre;
    private double latitud;
    private double longitud;
    
    public Estacion(String nom, double lat,double longi, int A, int N ){
    setNombre(nom);
    setLatitud(lat);
    setLongitud(longi);
    }
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getLatitud() {
        return latitud;
    }

    public void setLatitud(double latitud) {
        this.latitud = latitud;
    }

    public double getLongitud() {
        return longitud;
    }

    public void setLongitud(double longitud) {
        this.longitud = longitud;
    }
    
    public String toString(){
        return "el nombre de la estacion es " + getNombre() + ",su la lititud es de: " + getLatitud() +
                " y su longitud es de: " + getLongitud();
    }
}
