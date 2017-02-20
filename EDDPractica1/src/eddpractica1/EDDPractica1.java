/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eddpractica1;

import Nodos.Cabecera;
import Nodos.Lateral;
import Nodos.ListaHorizontal;
import Nodos.ListaVertical;
import Nodos.MatrizOrtogonal;
import Nodos.NodoCabecera;
import Nodos.NodoLateral;
import Nodos.NodoM;
import javax.swing.JFrame;
import javax.swing.UIManager;

/**
 *
 * @author Hayrton
 */
public class EDDPractica1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        JFrame.setDefaultLookAndFeelDecorated(true);
        try{
            UIManager.setLookAndFeel("com.jtattoo.plaf.acryl.AcrylLookAndFeel");
        }catch(Exception e){
            
        }
        Principal prin = new Principal();
        prin.setVisible(true);
        
        MatrizOrtogonal matriz = new MatrizOrtogonal();
        matriz.llenar(3,3);
        
    }
    
}
