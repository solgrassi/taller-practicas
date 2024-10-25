
package Ejercicio1;


public class Subsidio {
    private double monto;
    private String motivo;
    private boolean otorgado;
    
    public Subsidio (double mon, String mot){
        setMonto(mon);
        setMotivo(mot);
        setOtorgado(false);
        
    }

    public boolean isOtorgado() {
        return otorgado;
    }

    public void setOtorgado(boolean otorgado) {
        this.otorgado = otorgado;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }
   
}
