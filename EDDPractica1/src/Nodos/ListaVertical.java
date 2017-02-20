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
public class ListaVertical {
    
    NodoM primero;
    NodoM ultimo;
    
    public void ListaVertical(){
        primero=null;
        ultimo = null;
    }
    
    public void insertar(NodoM insert){
        if(esVacio()){
            primero=ultimo=insert;
        }else{
            if(insert.getY()<primero.getY()){
                insertarFrente(insert);
            }else if(insert.getY()>ultimo.getY()){
                insertarFinal(insert);
            }else{
                insertarMedio(insert);
            }
        }
    }
    
    public boolean esVacio(){
        if(primero==null){
            return true;
        }else{
            return false;
        }
    }
    
    public void insertarFrente(NodoM insert){
        primero.setArriba(insert);
        insert.setAbajo(primero);
        primero=primero.getArriba();
    }
    
    public void insertarFinal(NodoM insert){
        ultimo.setAbajo(insert);
        insert.setArriba(ultimo);
        ultimo=ultimo.getAbajo();
    }
    
    public void insertarMedio(NodoM insert){
        NodoM temp1;
        NodoM temp2;
        
        temp1=primero;
        
        while(temp1.getY()<insert.getY()){
            temp1 = temp1.getAbajo();
        }
        temp2=temp1.getArriba();
        temp2.setAbajo(insert);
        temp1.setArriba(insert);
        insert.setAbajo(temp1);
        insert.setArriba(temp2);
    }
    
    public void mostar(){
        if(!esVacio()){
            NodoM temp = primero;
            while(temp!=null){
                System.out.println("y:  "+temp.getY());
                temp=temp.getAbajo();
            }
        }
    }
}
