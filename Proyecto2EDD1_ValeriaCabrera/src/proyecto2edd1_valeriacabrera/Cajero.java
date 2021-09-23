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
    
    private Pila transacciones = new Pila();
    private Cola personas;
    boolean vacio=true;
    
    public Cajero(){
        //constructor vacio
    }
    
    public Pila getPila(){
        return this.transacciones;
    }
    
    public void opcion2(){
        
    }
    
    void setVacio(boolean vacio){
        this.vacio=vacio;
    }
    
    boolean getVacio(){
        return this.vacio;
    }
    
    
}
