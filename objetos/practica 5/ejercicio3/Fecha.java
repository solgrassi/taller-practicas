
package Ejercicio3;


public class Fecha {
    private String ciudad;
    private String dia;
    
    public Fecha (String ciu, String dia){
        this.setCiudad(ciu);
        this.setDia(dia);
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }
}
