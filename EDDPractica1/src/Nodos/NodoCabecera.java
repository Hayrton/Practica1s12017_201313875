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
public class NodoCabecera {
    private int x;
    private NodoCabecera siguiente;
    private NodoCabecera anterior;
    ListaVertical Columna;
    
    public NodoCabecera(int x){
        Columna = new ListaVertical();
        this.x=x;
        this.siguiente=null;
        this.anterior=null;
    }

    /**
     * @return the x
     */
    public int getX() {
        return x;
    }

    /**
     * @param x the x to set
     */
    public void setX(int x) {
        this.x = x;
    }

    /**
     * @return the siguiente
     */
    public NodoCabecera getSiguiente() {
        return siguiente;
    }

    /**
     * @param siguiente the siguiente to set
     */
    public void setSiguiente(NodoCabecera siguiente) {
        this.siguiente = siguiente;
    }

    /**
     * @return the anterior
     */
    public NodoCabecera getAnterior() {
        return anterior;
    }

    /**
     * @param anterior the anterior to set
     */
    public void setAnterior(NodoCabecera anterior) {
        this.anterior = anterior;
    }
}
