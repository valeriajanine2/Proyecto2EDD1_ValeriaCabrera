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
public class Cola extends Lista{
    
    public Cola(){
        super();
    }
 
    
    @Override
    boolean VACIA(Lista L){
        if(L.personas.size()==0){
            return true;
        }else{
            return false;
        }
    }
    
    @Override
    void METE(String trans, Lista L){
        //solo para que no tire error la abstaccion
    }
    
    @Override
    void PONE(Persona P, Lista L){
        
    }
    
    @Override
    void QUITA(Lista L){
        
    }
    
    @Override
    void ANULA(Lista P){
        P.personas.clear();
    }
    
    @Override
    void IMPRIME_LISTA(Lista P){
        
    }
    
}