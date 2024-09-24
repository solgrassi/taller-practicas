package tema2;

/*Implemente un programa que cargue un vector con a lo sumo 20 partidos disputados en
el campeonato. La información de cada partido se lee desde teclado hasta ingresar uno con
nombre de visitante “ZZZ” o alcanzar los 20 partidos. Luego de la carga:
- Para cada partido, armar e informar una representación String del estilo:
{EQUIPO-LOCAL golesLocal VS EQUIPO-VISITANTE golesVisitante }
- Calcular e informar la cantidad de partidos que ganó River.
- Calcular e informar el total de goles que realizó Boca jugando de local
(parametros de Partido: nombre del equipo local, el nombre del visitante, la cantidad de goles del local y del visitante)*/

import PaqueteLectura.Lector;

public class TP2EJ5 {

    public static void main(String[] args) {
       //variables 
       Partido [] partidos = new Partido [20];
       int DL=0;
       String visitante;
       String local;
       int golesL;
       int golesV;
       int cantRiver=0; 
       int golesBoca=0;
       int i; 
        
        //cargar vector.
        System.out.println("ingrese el nombre del equipo visitante");
        visitante= Lector.leerString();
        while (DL<20 && !visitante.equals("ZZZ") ){
            System.out.println("ingrese el nombre del equipo local");
            local=Lector.leerString();
            System.out.println("ingrese la cantidad de goles del local");
            golesL= Lector.leerInt();
            System.out.println("ingrese la cantidad de goles del visitante");
            golesV= Lector.leerInt();
            partidos[DL]= new Partido (local,visitante,golesL, golesV);
            DL++;
            System.out.println("ingrese el nombre del equipo visitante");
            visitante= Lector.leerString();
        }
        
        //representacion de partido
        for (i=0; i<DL; i++){
            System.out.println(partidos[i].getLocal() +" " + partidos[i].getGolesLocal() + " VS " + partidos[i].getVisitante() + " " + partidos[i].getGolesVisitante());
            if (partidos[i].getGanador().equals("River")){
                cantRiver++;
            }
             if (partidos[i].getLocal().equals("Boca")){
                golesBoca= golesBoca + partidos[i].getGolesLocal();
            }
        }
        
        //cant partidos ganados por River
        System.out.println("la cantidad de partidos ganados por River es de: " + cantRiver);
        
        //cant goles de Boca como local
        System.out.println("la cantidad de goles de Boca como local es de: " + golesBoca);
    }
    
}
