/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Varios;

import Nodos.ListaCircular;
import Nodos.ListaSimple;
import java.io.File;
import java.io.IOException;
import java.util.List;
import javax.swing.JFileChooser;
import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.JDOMException;
import org.jdom2.input.SAXBuilder;

/**
 *
 * @author Hayrton
 */
public class Metodos {

    public void abrirArchivo() {
        JFileChooser selector = new JFileChooser();
        selector.setFileFilter(new Filtro("xml"));
        selector.setDialogTitle("Leer Archivo");
        selector.setFileSelectionMode(0);
        int opcion = selector.showOpenDialog(selector);
        selector.setVisible(true);
        File archivo = selector.getSelectedFile();
        if (JFileChooser.APPROVE_OPTION == opcion) {
            LeerXML(archivo);
        }
    }

    public void LeerXML(File Archivo) {
        SAXBuilder builder = new SAXBuilder();

        try {
            Document document = builder.build(Archivo);
            Element nodoraiz = document.getRootElement();
            List<Element> list = nodoraiz.getChildren();
            System.out.println("lectura xml");
            for (Element hijo : list) {
                List<Element> list_hijos = hijo.getChildren();
                String name = hijo.getName();
                String dato = hijo.getValue();
                if (name.equals("dimension")) {
                    System.out.println("nombre:  " + name + "   dimension:   " + dato);
                } else if (name.equals("dobles")) {
                    System.out.println("--------dobles------");
                    for (Element hijos : list_hijos) {
                        /*String nombre = hijos.getName();
                        String dimension = hijos.getValue();
                        System.out.println("nombresss:  " + nombre + "   dimension:   " + dimension);
                         */

                        List<Element> listh_hijos = hijos.getChildren();
                        for (Element hi : listh_hijos) {
                            String casillax = hi.getName();
                            String datocasilla = hi.getValue();
                            System.out.println("casilladoble:  " + casillax + "  dato:  " + datocasilla);
                        }
                    }
                } else if (name.equals("triples")) {
                    System.out.println("------triples-----");
                    for (Element hijos : list_hijos) {
                        /*
                        String nombre = hijos.getName();
                        String dimension = hijos.getValue();
                        System.out.println("nombresss:  " + nombre + "   dimension:   " + dimension);
                         */
                        List<Element> listh_hijos = hijos.getChildren();
                        for (Element hi : listh_hijos) {
                            String casillax = hi.getName();
                            String datocasilla = hi.getValue();
                            System.out.println("casillatriple:  " + casillax + "  dato:  " + datocasilla);
                        }
                    }
                } else if (name.equals("diccionario")) {
                    for (Element hijos : list_hijos) {
                        String nombre = hijos.getName();
                        String dat = hijos.getValue();
                        if (nombre.equals("palabra")) {
                            addADiccionario(dat);
                        }
                    }

                }
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } catch (JDOMException jdomex) {
            System.out.println(jdomex.getMessage());
        }
    }

    private void addADiccionario(String palabras) {
        ListaSimple diccionario = new ListaSimple();
        diccionario.agregarAlInicio(palabras);
        diccionario.MostarLista();
    }

    public void usuario(String user) {
        ListaCircular circular = new ListaCircular();
        circular.agregaralInicio(user);
        circular.MostrarLista();
    }

}
