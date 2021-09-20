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
public class Persona {
    
    private String nombre;
    private int seg;
    private String transaction;
    
    public Persona(){
        //constructor vacio
    }
    
    public Persona(String nombre, String transaction){
        this.nombre=nombre;
        this.transaction=transaction;
    }
    
    public void setTiempo(int seg){
        this.seg=seg;
    }
    
    public String getNombre(){
        return this.nombre;
    }
    
    public int getTiempo(){
        return this.seg;
    }
    
    public String getTransaction(){
        return this.transaction;
    }
    
}
