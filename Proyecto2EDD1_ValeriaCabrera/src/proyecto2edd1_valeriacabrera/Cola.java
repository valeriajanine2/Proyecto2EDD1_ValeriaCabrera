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
    void PONE(Persona P,Lista L){
        
        int temp = this.personas.size();//agregar al "final" en la cola
        if(temp==1){
            //se añade por primera vez
            this.personas.add(P);
        }else{
            this.personas.add(temp,P);
        }
        
    }
    
    @Override
    void QUITA(Lista L){
        System.out.print("salio "+this.personas.get(0).getNombre());
        this.personas.remove(0);
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
    
    public Persona getPersona(){
        return this.personas.get(0);
    }
    
}