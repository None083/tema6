/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package museo;

import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author FX506
 */
public class Main {

    public static void main(String[] args) {
        
        Museo m1 = new Museo("Picasso", "Calle lienzo");
        
        Temperatura t1 = new Temperatura(17, 15, "01");
        Humedad h1 = new Humedad(58, 56, "02");
        Fija salaFija = new Fija(true, t1, h1);
        Pintura p1 = new Pintura("Miguelito el que no tiene abuela", "Miguelito");
        salaFija.aniadirObra(p1);
        m1.aniadirSala(salaFija);
        
        
        Temperatura t2 = new Temperatura(18, 13, "03");
        Humedad h2 = new Humedad(59, 54, "04");
        Fija salaFija2 = new Fija(true, t2, h2);
        Escultura e1 = new Escultura("Moj*n en llamas", "Noelia P.");
        salaFija.aniadirObra(e1);
        m1.aniadirSala(salaFija2);
        
        Map<String, Obra> obrasUnicas = new TreeMap<>();
        obrasUnicas.put(p1.getId(), p1);
        obrasUnicas.put(e1.getId(), e1);
        for (String id : obrasUnicas.keySet()) {
            System.out.println(obrasUnicas.get(id));
        }
        
        ConservEscultorico c1 = new ConservEscultorico("09078645P", "Monty");
        ConservPictorico c2 = new ConservPictorico("08964539L", "Adi");
        
        m1.contratar(c1);
        m1.contratar(c2);
        
        c1.restaurar(p1);
        c1.restaurar(e1);
        
        System.out.println(m1);
        
    }
    
}
