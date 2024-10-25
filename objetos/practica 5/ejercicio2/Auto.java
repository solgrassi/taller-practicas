
package Ejercicio2;

public class Auto {
    private String nomDueño;
    private String patente;

    public Auto (String nom, String pat){
        this.setNomDueño(nom);
        this.setPatente(pat);
    }
    
    public String getNomDueño() {
        return nomDueño;
    }

    public void setNomDueño(String nomDueño) {
        this.nomDueño = nomDueño;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }
    
    public String toString(){
        String aux= "el nombre del dueño del auto es: " + this.getNomDueño() + " y la patente es: " + this.getPatente();
        return aux;
    }
}
