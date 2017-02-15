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
public class ListaCircular {

    private Nodoc inicio;
    private Nodoc ultimo;
    private int tamanio;

    public void ListaCircular() {
        inicio = null;
        ultimo = null;
        tamanio = 0;
    }

    public Boolean esVacia() {
        return inicio == null;
    }

    public int getTamanio() {
        return tamanio;
    }

    public void agregaralFinal(Object dato) {
        Nodoc nuevo = new Nodoc();
        nuevo.setDato(dato);
        if (esVacia()) {
            inicio = nuevo;
            ultimo = nuevo;
            ultimo.setSiguiente(inicio);
        } else {
            ultimo.setSiguiente(nuevo);
            nuevo.setSiguiente(inicio);
            ultimo = nuevo;
        }
        tamanio++;
    }

    public void agregaralInicio(Object dato) {
        Nodoc nuevo = new Nodoc();
        nuevo.setDato(dato);
        if (esVacia()) {
            inicio = nuevo;
            ultimo = nuevo;
            ultimo.setSiguiente(inicio);
        } else {
            nuevo.setSiguiente(inicio);
            inicio = nuevo;
            ultimo.setSiguiente(inicio);
        }
        tamanio++;
    }

    public void Eliminar() {
        inicio = null;
        ultimo = null;
        tamanio = 0;
    }

    public void MostrarLista() {
        if (!esVacia()) {
            Nodoc aux = inicio;
            int i = 0;
            do {
                System.out.println(i + ".[" + aux.getDato() + "]" + "-->");
                aux = aux.getSiguiente();
                i++;
            } while (aux != inicio);
        }
    }

}
