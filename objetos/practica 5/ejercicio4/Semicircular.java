
package Ejercicio4;

public class Semicircular extends Coro {
    private Corista [] coristasS;
    private int dl;
    private int cantTot;

   
    
    public Semicircular(String nom, Director dir, int cantCoristas){
        super(nom,dir);
        this.setCantTot(cantCoristas);
        coristasS= new Corista [cantTot]; //incializado por java todo en null;
        dl=0;
    }
    
    public int getCantTot() {
        return cantTot;
    }

    public void setCantTot(int cantTot) {
        this.cantTot = cantTot;
    }
    public void agregarCorista (Corista co){
        if (dl< cantTot){
        coristasS[dl]= co;
        dl++;
    }
    }
    
    public boolean estaLLeno(){
        if (dl== cantTot){
            return true;
        }
        else 
            return false;
    }
    
    /* En el caso del coro semicircular, de izquierda a derecha los coristas
están ordenados de mayor a menor en cuanto a tono fundamental.*/
    public boolean estaBienFormado(){
        boolean sigue=true;
        int i=0;
        int aux=99;
        while (sigue && i<dl){
            if (coristasS[i].getTonoFundamental()< aux){
                aux= coristasS[i].getTonoFundamental(); 
            }
            else
                sigue=false;
            i++;
         }
        return sigue; 
    }
    
    public String listaCorista(){
        String aux="";
        for (int i=0; i<dl; i++){
            aux += coristasS[i].toString() ;
        }
        return aux;
    }
}
