/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto2edd1_valeriacabrera;
import java.util.Random;
/**
 *
 * @author Usuario
 */
public class Persona {
    
    private String nombre;
    private int seg;
    private String transaction;
    private int numC;
    
    public Persona(){
        //constructor vacio
    }
    
    public Persona(String nombre, String transaction){
        this.nombre=nombre;
        this.transaction=transaction;
        Random rand = new Random();
        int temp = rand.nextInt(3)+1;
        this.seg=temp;
    }
 
    public String getNombre(){
        return this.nombre;
    }
    
    public int getTiempo(){
        return this.seg;
    }
    
    public void setCajero(int numC){
        this.numC=numC;
    }
    
    public int getCajero(){
        return this.numC;
    }
    
    public String getTransaction(){
        return this.transaction;
    }
    
}
