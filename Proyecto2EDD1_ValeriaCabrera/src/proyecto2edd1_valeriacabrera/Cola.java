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
        //solo para que no tire error la abstraccion
    }
    
    @Override
    void PONE(Persona P, int opcion, Lista L){
        
        if(opcion==1){
            int temp = this.personas.size();//agregar al "final" en la cola
            if(temp==1){
                //se añade por primera vez
                System.out.println("Se añade "+P.getNombre());
                this.personas.add(P);
            }else{
                this.personas.add(temp,P);
                System.out.println("Se añade "+P.getNombre());
            }
        }else{
            
        }
    }
    
    @Override
    void QUITA(Lista L){
        
    }
    
    @Override
    void ANULA(Lista L){
        L.personas.clear();
    }
    
    @Override
    void IMPRIME_LISTA(Lista L){
        if(L.VACIA(L)){
            System.out.println("La pila esta vacia");
        }else{
            for (int i = 0; i < L.personas.size(); i++) {
                String nombre = L.personas.get(i).getNombre();
                System.out.println(nombre);
            }
        }
    }
    
}