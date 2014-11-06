/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin704;

/**
 *
 * @author mperezmartinez
 */
public class Boletin704 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        double n1,n2;
        String nm1,nm2;
        
        comparar cp = new comparar();
        nm1=cp.Introducirnome();
        n1=cp.Introdicirpeso();
        nm2=cp.Introducirnome();
        n2=cp.Introdicirpeso();
        cp.Condicion(n1, n2, nm1, nm2);
        
        
        
        
    }
    
}
