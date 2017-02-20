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
public class NodoLateral {
    private int y;
    private NodoLateral siguiente;
    private NodoLateral anterior;
    ListaHorizontal Fila;
    
    public NodoLateral(int y){
        Fila = new ListaHorizontal();
        this.y=y;
        this.siguiente=null;
        this.anterior=null;
    }

    /**
     * @return the y
     */
    public int getY() {
        return y;
    }

    /**
     * @param y the y to set
     */
    public void setY(int y) {
        this.y = y;
    }

    /**
     * @return the siguiente
     */
    public NodoLateral getSiguiente() {
        return siguiente;
    }

    /**
     * @param siguiente the siguiente to set
     */
    public void setSiguiente(NodoLateral siguiente) {
        this.siguiente = siguiente;
    }

    /**
     * @return the anterior
     */
    public NodoLateral getAnterior() {
        return anterior;
    }

    /**
     * @param anterior the anterior to set
     */
    public void setAnterior(NodoLateral anterior) {
        this.anterior = anterior;
    }
}
