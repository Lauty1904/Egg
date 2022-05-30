/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo7;


import poo7.persona.persona;

/**
 *
 * @author Ventas Electrouno
 */
public class Poo7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        persona a1=new persona();
        
        
        for(int i=1; i<5; i++){
        a1.crearpersona();
        a1.calculo();
        a1.mayor();}
        
        
    }
    
}
