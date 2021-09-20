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
public class Pila extends Lista{
    
    public Pila(){
        super();
    }
 
    
    @Override
    boolean VACIA(Lista L){
        if(L.transacciones.size()==0){
            return true;
        }else{
            return false;
        }
    }
    
    @Override
    void METE(String trans, Lista L){
        
    }
    
    @Override
    void PONE(Persona P, Lista L){
        //solo para que no tire error la abstaccion
    }
    
    @Override
    void QUITA(Lista L){
        //solo para que no tire error la abstaccion
    }
    
    @Override
    void ANULA(Lista P){
        P.transacciones.clear();
    }
    
    @Override
    void IMPRIME_LISTA(Lista P){
        
    }
    
}
