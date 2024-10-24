/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tema3.ejercicio1;
/*Definir una clase para representar triángulos. Un triángulo se caracteriza por el
tamaño de sus 3 lados (double), el color de relleno (String) y el color de línea (String).
Provea un constructor que reciba todos los datos necesarios para iniciar el objeto.
Provea métodos para:
- Devolver/modificar el valor de cada uno de sus atributos (métodos get y set)
- Calcular el perímetro y devolverlo (método calcularPerimetro)
- Calcular el área y devolverla (método calcularArea):*/


/**
 *
 * @author estudiante
 */
public class Triangulo {
    private double a;
    private double b;
    private double c;
    private String relleno;
    private String linea;
 
    public Triangulo (double ladoA, double ladoB, double ladoC, String re, String li){
        a=ladoA;
        b=ladoB;
        c=ladoC;
        relleno = re;
        linea= li; 
    }
    
    public Triangulo(){
        
    }
    
    public void SetLadoA (double ladoA){
        a = ladoA;
    }
    
    public double GetLadoA (){
        return a;
    }
    
   public void SetLadoB (double ladoB){
       b= ladoB;
   }
  
   public double GetLadoB (){
        return b;
    }
   
   public void SetLadoC (double ladoC){
       c= ladoC;
   }
   
   public double GetLadoC (){
        return c;
    }
   public void SetRelleno (String relle){
       relleno= relle;
   }
   
   public String GetRelleno (){
       return relleno;
   }
   
   public void SetLinea (String line){
       linea = line;
   }
   
   public String GetLinea (){
       return linea;
   }
   
   public double calcularPerimetro(){
       double aux;
       aux = a+b+c;
       return (aux);
   }
   
   public double calcularArea (){
       double s = (a+b+c)/2;
       double aux = s*(s-a)*(s-b)*(s-c); 
       return Math.sqrt(aux);
   }
   
}
