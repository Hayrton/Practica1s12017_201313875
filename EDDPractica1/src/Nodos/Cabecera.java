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
public class Cabecera {
    NodoCabecera primero;
    NodoCabecera ultimo;
    
    public Cabecera(){
        primero = null;
        ultimo = null;
    }
    
    public void insertar(NodoCabecera insert) {
        if (esVacio()) {
            primero = ultimo = insert;
        } else {
            if (insert.getX() < primero.getX()) {
                insertarFrente(insert);
            } else if (insert.getX() > ultimo.getX()) {
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

    public void insertarFrente(NodoCabecera insert) {
        primero.setAnterior(insert);
        insert.setSiguiente(primero);
        primero = primero.getAnterior();
    }

    public void insertarFinal(NodoCabecera insert) {
        ultimo.setSiguiente(insert);
        insert.setAnterior(ultimo);
        ultimo = ultimo.getSiguiente();
    }

    public void insertarMedio(NodoCabecera insert) {
        NodoCabecera temp1;
        NodoCabecera temp2;

        temp1 = primero;

        while (temp1.getX() < insert.getX()) {
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
            NodoCabecera temp = primero;
            while (temp != null) {
                System.out.println("x:  " + temp.getX());
                temp = temp.getSiguiente();
            }
        }
    }
    
    public boolean existe(int x){
        if(esVacio()){
            return false;
        }else{
            NodoCabecera temp;
            temp =  primero;
            while(temp!=null){
                if(temp.getX()==x){
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
    
    public NodoCabecera Buscar(int x){
        if(existe(x)){
            NodoCabecera temp;
            temp = primero;
            while(temp.getX()!=x){
                temp = temp.getSiguiente();
            }
            return temp;
        }else{
            System.out.println("nodo no existe");
            return (new NodoCabecera(-1));
        }
    }
}
