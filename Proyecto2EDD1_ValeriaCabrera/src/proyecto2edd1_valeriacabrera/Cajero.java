/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto2edd1_valeriacabrera;

/**
 *
 * @author Usuario
 */
public class Cajero {
    
    private Pila transacciones;
    
    public Cajero(){
        //constructor vacio
    }
    
    public Pila getPila(){
        return this.transacciones;
    }
    
}
