/*
 */
package boletin704;

import java.util.Scanner;

/**
 *
 * @author mperezmartinez
 */
public class comparar {
    
    private double num1,num2;


    public comparar(double num1,double num2){
        this.num1=num1;
        this.num2=num2;
        
        
    }
    
     public comparar(){
      
     }
      public String Introducirnome() {
       
        
        System.out.println("Introducir nombre:");
        Scanner dato = new Scanner(System.in);
        String valor1=dato.nextLine();
        
       return valor1; 
       
      
    }  
     
     
    public double Introdicirpeso() {
       
        
        System.out.println("Introducir peso:");
        Scanner dato = new Scanner(System.in);
       double valor=dato.nextDouble();
        
       return valor; 
     
    }
    
   public void Condicion(double n1, double n2,String nm1,String nm2) {
        if (n1>n2) {
            System.out.println("nombre"+" "+nm1+"peso"+n1+" "+"diferencia"+(n2-n1));
            
        } else {
            System.out.println("nombre"+" "+nm2+"peso"+n2+" "+"diferencia"+(n1-n2));
        }

    } 
    
    
    }  