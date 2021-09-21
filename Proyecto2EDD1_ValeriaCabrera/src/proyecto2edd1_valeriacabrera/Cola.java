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
    void PONE(Persona P, int opcion, Lista L){
        if(opcion==1){
            int temp = this.personas.size()+1;//agregar al "final" en la cola
            if(temp==1){
                //se añade por primera vez
                this.personas.add(P);
            }else{
                this.personas.add(temp,P);
            }
        }
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