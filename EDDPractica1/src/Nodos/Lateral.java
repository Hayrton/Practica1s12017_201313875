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
public class Lateral {
    NodoLateral primero;
    NodoLateral ultimo;
    
    public Lateral(){
        primero = null;
        ultimo = null;
    }
    
    public void insertar(NodoLateral insert) {
        if (esVacio()) {
            primero = ultimo = insert;
        } else {
            if (insert.getY() < primero.getY()) {
                insertarFrente(insert);
            } else if (insert.getY() > ultimo.getY()) {
                insertarFinal(insert);
            } else {
                insertarMedio(insert);
            }
        }
    }

    public boolean esVacio() {
        if (primero == null) {
            return true;
        } else {
            return false;
        }
    }

    public void insertarFrente(NodoLateral insert) {
        primero.setAnterior(insert);
        insert.setSiguiente(primero);
        primero = primero.getAnterior();
    }

    public void insertarFinal(NodoLateral insert) {
        ultimo.setSiguiente(insert);
        insert.setAnterior(ultimo);
        ultimo = ultimo.getSiguiente();
    }

    public void insertarMedio(NodoLateral insert) {
        NodoLateral temp1;
        NodoLateral temp2;

        temp1 = primero;

        while (temp1.getY() < insert.getY()) {
            temp1 = temp1.getSiguiente();
        }
        temp2 = temp1.getAnterior();
        temp2.setSiguiente(insert);
        temp1.setAnterior(insert);
        insert.setSiguiente(temp1);
        insert.setAnterior(temp2);
    }

    public void mostar() {
        if (!esVacio()) {
            NodoLateral temp = primero;
            while (temp != null) {
                System.out.println("y:  " + temp.getY());
                temp = temp.getSiguiente();
            }
        }
    }
    
    public boolean existe(int y){
        if(esVacio()){
            return false;
        }else{
            NodoLateral temp;
            temp =  primero;
            while(temp!=null){
                if(temp.getY()==y){
                    System.out.println("existe");
                    return true;
                }else if(temp.getSiguiente()==null){
                    System.out.println("no encontrado");
                    return false;
                }
                temp = temp.getSiguiente();
            }
        }
        return false;
    }
    
    public NodoLateral Buscar(int y){
        if(existe(y)){
            NodoLateral temp;
            temp = primero;
            while(temp.getY()!=y){
                temp = temp.getSiguiente();
            }
            return temp;
        }else{
            System.out.println("nodo no existe");
            return (new NodoLateral(-1));
        }
    }
    
}
