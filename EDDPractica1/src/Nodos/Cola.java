/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Nodos;

/**
 *
 * @author Hayrton
 */
public class Cola {
    
   private Nodoc inicio;
   private Nodoc ultimo;
   
   public boolean esVacia(){
       return inicio==null;
   }
   
   public void acolar(Object dato){
       Nodoc nuevo = new Nodoc();
       nuevo.setDato(dato);
       if(esVacia()){
           inicio=nuevo;
       }else{
           ultimo.setSiguiente(nuevo);
           ultimo = nuevo;
       }
   }
   
   public Object desacolar(){
       Object aux;
       aux = inicio.getDato();
       inicio = inicio.getSiguiente();
       return aux;
   }
   
}
