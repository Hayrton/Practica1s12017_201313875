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
public class MatrizOrtogonal {
    
    public Cabecera c;
    public Lateral l;
    
    public MatrizOrtogonal() {
        c = new Cabecera();
        l = new Lateral();
    }
    
    void insertar(int x, int y, int insert) {
        NodoM inser = new NodoM(insert,x,y);
        if (c.existe(x) == false) {
            c.insertar(new NodoCabecera(x));
        }
        if (l.existe(y) == false) {
            l.insertar(new NodoLateral(y));
        }
        
        NodoCabecera Ctemp;
        NodoLateral Ltemp;
        Ctemp = c.Buscar(x);
        Ltemp = l.Buscar(y);
        Ctemp.Columna.insertar(inser);
        Ltemp.Fila.insertar(inser);
    }
    
    public void llenar(int x, int y) {
        int z=0;
        for(int i=0;i<x;i++){
            for(int j=0;j<y;j++){
                insertar(i,j,z);
                z++;
            }
        }
    }
}
