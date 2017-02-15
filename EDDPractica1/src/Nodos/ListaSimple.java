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
public class ListaSimple {

    private Nodoc inicio;
    private int tamanio;

    public ListaSimple() {
        inicio = null;
        tamanio = 0;
    }

    public boolean esVacia() {
        return inicio == null;
    }

    public int getTamanio() {
        return tamanio;
    }

    public void agregarAlFinal(Object dato) {
        Nodoc nuevo = new Nodoc();
        nuevo.setDato(dato);
        if (esVacia()) {
            inicio = nuevo;
        } else {
            Nodoc aux = inicio;
            while (aux.getSiguiente() != null) {
                aux = aux.getSiguiente();
            }
            aux.setSiguiente(nuevo);
        }
        tamanio++;
    }

    public void agregarAlInicio(Object dato) {
        Nodoc nuevo = new Nodoc();
        nuevo.setDato(dato);

        if (esVacia()) {
            inicio = nuevo;
        } else {
            nuevo.setSiguiente(nuevo);
            inicio = nuevo;
        }
        tamanio++;
    }
    
    public Object getDato(int posicion) throws Exception{
        if(posicion>=0&&posicion<tamanio){
            if(posicion==0){
                return inicio.getDato();
            }else{
                Nodoc aux = inicio;
                
                for(int i=0; i<posicion;i++){
                    aux = aux.getSiguiente();
                }
                return aux.getDato();
                }
        }else{
            throw new Exception("Posicion inexistente en la lista");
        }
    }
    
    public boolean buscar(Object referencia){
        Nodoc aux = inicio;
        boolean encontrado = false;
        
        while(aux!=null && encontrado!=true){
            if(referencia==aux.getDato()){
                encontrado = true;
            }else{
                aux = aux.getSiguiente();
            }
        }
        return encontrado;
    }
    
    public void EliminarporDato(Object dato){
        if(buscar(dato)){
            if(inicio.getDato()==dato){
                inicio = inicio.getSiguiente();
            }else{
                Nodoc aux = inicio;
                
                while(aux.getSiguiente().getDato()!=dato){
                    aux = aux.getSiguiente();
                }
                Nodoc siguiente = aux.getSiguiente().getSiguiente();
                aux.setSiguiente(siguiente);
            }
            tamanio--;
        }
    }
    
    public void Eliminarposicion(int posicion){
        if(posicion==0){
            inicio = inicio.getSiguiente();
        }else{
            Nodoc aux = inicio;
            for(int i=0; i<posicion;i++){
                aux = aux.getSiguiente();
            }
            Nodoc siguiente = aux.getSiguiente();
            aux.setSiguiente(siguiente.getSiguiente());
        }
        tamanio--;
    }
    
    public void Eliminar(){
        inicio=null;
        tamanio=0;
    }
    
    public void MostarLista(){
        if(!esVacia()){
            Nodoc aux = inicio;
            int i=0;
            
            while(aux!=null){
                System.out.println(i+"["+aux.getDato()+"]");
                aux = aux.getSiguiente();
                i++;
            }
        }
    }

}
