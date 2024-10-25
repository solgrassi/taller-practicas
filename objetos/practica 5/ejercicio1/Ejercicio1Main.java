
package Ejercicio1;

/*Escriba un programa que instancie un proyecto con tres investigadores. Agregue dos
subsidios a cada investigador y otorgue los subsidios de uno de ellos. Luego imprima
todos los datos del proyecto en pantalla*/ 

public class Ejercicio1Main {

   
    public static void main(String[] args) {
        Investigador inv1 = new Investigador ("juan", 5, "analista");
        Investigador inv2 = new Investigador ("sol", 3, "programadora");
        Investigador inv3 = new Investigador ("luis", 2, "apu");
        Subsidio sub= new Subsidio (500, " rotura de chip"); 
        Subsidio sub2= new Subsidio (250, " falta de materiales"); 
        Subsidio sub3= new Subsidio (250, " cnoferencia"); 
        Proyecto proye = new Proyecto("R-info", 2345, "Sol Grassi");
        
        proye.agregarInvestigador(inv1);
        proye.agregarInvestigador(inv2);
        proye.agregarInvestigador(inv3);
       
        inv1.agregarSubsidio(sub);
        inv2.agregarSubsidio(sub2);
        inv3.agregarSubsidio(sub3);
        
        inv1.siATodo();
        inv3.siATodo();
        
        System.out.println(proye.toString());
    }
    
}
