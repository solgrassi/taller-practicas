
package Ejercicio4;


public class Hileras extends Coro {
    private Corista[][] coristasH;
    private int fila;
    private int columna;
    private int i;
    private int j;
    
    public Hileras (String nom, Director dire, int filas, int columnas){
        super(nom,dire);
        this.setColuma(columnas);
        this.setFila(filas);
        coristasH= new Corista[fila][columna];
        i=0; j=0; 
    }

    public int getFila() {
        return fila;
    }

    public void setFila(int fila) {
        this.fila = fila;
    }

    public int getColumna() {
        return columna;
    }

    public void setColuma(int columna) {
        this.columna = columna;
    }
    
    
    public void agregarCorista(Corista co){
        if (i<fila){
        if (j<columna){
        coristasH[i][j]= co;
        j++;
        }
        else {
            i++; j=0;
            coristasH[i][j]=co;
            j++;
        } 
        
        }
    }
    
    public boolean estaLLeno(){
        if ((i== fila) && (j==columna)){
            return true;
        }
        else return false;
    }
    
    /*En el caso del coro por hileras, todos los miembros de una misma hilera
tienen el mismo tono fundamental y además todos los primeros
miembros de cada hilera están ordenados de mayor a menor en cuanto
a tono fundamental*/
    public boolean estaBienFormado() {
        boolean cumple = true;
        int max = -1;
        int tonoActual;
        int a = 0;
        int b;
        while((a<i) && (cumple)) {
            b=0;
            tonoActual = coristasH[a][b].getTonoFundamental();
            while ((b < j) && (cumple) && (tonoActual == coristasH[a][b].getTonoFundamental())) {
                b++;
            }
            if (b<j && coristasH[a][b].getTonoFundamental()  != tonoActual){
                cumple = false;
            }
            
            if (coristasH[a][0].getTonoFundamental()>max){
                max= coristasH[a][0].getTonoFundamental();
            }
            a++;
            }
        return cumple;
    }
    
    public String listaCorista (){
        String aux="";
        for (int a=0; a<i; a++){
            for (int b=0; b<j; b++){
                aux+= coristasH[a][b].toString(); 
            }
        }
       return aux; 
    }

}
