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
public class NodoM {

    private NodoM arriba;
    private NodoM abajo;
    private NodoM derecha;
    private NodoM izquierda;
    
    private int x;
    private int y;
    private int dat;

    private Object dato;

    public NodoM(int dato, int x, int y) {
        this.arriba = null;
        this.abajo = null;
        this.derecha = null;
        this.izquierda = null;
        this.dat=dato;
        this.x=x;
        this.y=y;
    }

    /**
     * @return the arriba
     */
    public NodoM getArriba() {
        return arriba;
    }

    /**
     * @param arriba the arriba to set
     */
    public void setArriba(NodoM arriba) {
        this.arriba = arriba;
    }

    /**
     * @return the abajo
     */
    public NodoM getAbajo() {
        return abajo;
    }

    /**
     * @param abajo the abajo to set
     */
    public void setAbajo(NodoM abajo) {
        this.abajo = abajo;
    }

    /**
     * @return the derecha
     */
    public NodoM getDerecha() {
        return derecha;
    }

    /**
     * @param derecha the derecha to set
     */
    public void setDerecha(NodoM derecha) {
        this.derecha = derecha;
    }

    /**
     * @return the izquierda
     */
    public NodoM getIzquierda() {
        return izquierda;
    }

    /**
     * @param izquierda the izquierda to set
     */
    public void setIzquierda(NodoM izquierda) {
        this.izquierda = izquierda;
    }

    /**
     * @return the dato
     */
    public Object getDato() {
        return dato;
    }

    /**
     * @param dato the dato to set
     */
    public void setDato(Object dato) {
        this.dato = dato;
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

}
