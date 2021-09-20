/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto2edd1_valeriacabrera;
import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public abstract class Lista {
  
    protected ArrayList<Persona> personas = new ArrayList();
    protected ArrayList<String> transacciones = new ArrayList();
    
    public Lista(){
        //constructor vacio
    }
    
    abstract void PONE(Persona p, Lista L);
    abstract void METE(String trans, Lista L);
    abstract void QUITA(Lista L);
    abstract void ANULA(Lista L);
    abstract void IMPRIME_LISTA(Lista L);
    abstract boolean VACIA(Lista L);
 
}

