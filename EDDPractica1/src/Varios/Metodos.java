/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Varios;

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
        selector.setFileFilter(new Filtro("XML"));
        selector.setDialogTitle("Leer Archivo");
        selector.setFileSelectionMode(0);
        int opcion = selector.showOpenDialog(selector);
        selector.setVisible(true);
        File archivo = selector.getSelectedFile();
        if(JFileChooser.APPROVE_OPTION==opcion){
            LeerXML(archivo);
        }
    }

    public void LeerXML(File Archivo) {
        SAXBuilder builder = new SAXBuilder();

        try {
            Document document = (Document) builder.build(Archivo);
            Element nodoraiz = document.getRootElement();
            List list = nodoraiz.getChildren("scrabble");
            for (int i = 0; i < list.size(); i++) {
                Element scrabble = (Element) list.get(i);
                String dimension = scrabble.getChildTextTrim("dimension");
                List list_dobles = scrabble.getChildren();
                List list_triples = scrabble.getChildren();
                List diccionario = scrabble.getChildren();
                for (int j = 0; j < list_dobles.size(); j++) {
                    Element casilla = (Element) list_dobles.get(j);
                    String x = casilla.getChildTextTrim("x");
                    String y = casilla.getChildTextTrim("y");
                }
                for (int tri = 0; tri < list_dobles.size(); tri++) {
                    Element casillat = (Element) list_triples.get(tri);
                    String xt = casillat.getChildText("x");
                    String yt = casillat.getChildText("y");
                }
                for (int d = 0; d < diccionario.size(); d++) {
                    Element palabra = (Element) diccionario.get(d);
                    String pal = palabra.getChildText("palabraq");
                }

            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } catch (JDOMException jdomex) {
            System.out.println(jdomex.getMessage());
        }
    }

}
