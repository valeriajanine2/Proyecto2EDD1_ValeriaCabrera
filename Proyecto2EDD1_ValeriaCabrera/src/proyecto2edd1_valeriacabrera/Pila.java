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
        this.transacciones.add(trans);
    }
    
    @Override
    void PONE(Persona P, int opcion, Lista L){
        //solo para que no tire error la abstraccion
    }
    
    @Override
    void QUITA(Lista L){
        //solo para que no tire error la abstraccion
    }
    
    @Override
    void ANULA(Lista L){
        L.transacciones.clear();
    }
    
    @Override
    void IMPRIME_LISTA(Lista L){
        if(L.VACIA(L)){
            System.out.println("La pila esta vacia");
        }else{
            for (int i = 0; i < L.transacciones.size(); i++) {
                System.out.println(L.transacciones.get(i));
            }
        }
    }
    
    public String toString(Lista L){
        String resp = "";
        for (int i = 0; i < L.transacciones.size(); i++) {
                String temp = L.transacciones.get(i);
                resp = resp + temp + "\n";
            }
        return resp;
    }
    
}
