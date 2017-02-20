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
public class ListaHorizontal {

    NodoM primero;
    NodoM ultimo;

    public ListaHorizontal() {
        primero = null;
        ultimo = null;
    }

    public void insertar(NodoM insert) {
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

    public void insertarFrente(NodoM insert) {
        primero.setIzquierda(insert);
        insert.setDerecha(primero);
        primero = primero.getIzquierda();
    }

    public void insertarFinal(NodoM insert) {
        ultimo.setDerecha(insert);
        insert.setIzquierda(ultimo);
        ultimo = ultimo.getDerecha();
    }

    public void insertarMedio(NodoM insert) {
        NodoM temp1;
        NodoM temp2;

        temp1 = primero;

        while (temp1.getX() < insert.getX()) {
            temp1 = temp1.getDerecha();
        }
        temp2 = temp1.getIzquierda();
        temp2.setDerecha(insert);
        temp1.setIzquierda(insert);
        insert.setDerecha(temp1);
        insert.setIzquierda(temp2);
    }

    public void mostar() {
        if (!esVacio()) {
            NodoM temp = primero;
            while (temp != null) {
                System.out.println("x:  " + temp.getX());
                temp = temp.getDerecha();
            }
        }
    }

}
