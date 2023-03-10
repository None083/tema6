/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejerrepa;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author noelia
 */
public class MainSilla {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Silla s1 = new Silla("Mecedora", 3);
        Silla s2 = new Silla("Gaming", 5);
        Silla s3 = new Silla("Taburete", 2);
        
        Map<Silla, Integer> map = new TreeMap<>();
        
        map.put(s1, 3);
        map.put(s2, 5);
        map.put(s3, 2);
        
        for (Map.Entry<Silla, Integer> entry : map.entrySet()) {
            Silla key = entry.getKey();
            Integer val = entry.getValue();
            
            System.out.println("Key: " + key + "\t Value: " + val);
            
        }
        
        List<Silla> listaSilla = new ArrayList<>();
        listaSilla.add(s1);
        listaSilla.add(s2);
        listaSilla.add(s3);
        
        System.out.println("Lista de sillas según orden de inserción");
        listaSilla.forEach(s->System.out.println("Nombre: " + s.getNombre()));
        
        System.out.println("Lista de sillas según orden natural");
        Collections.sort(listaSilla);
        listaSilla.forEach(s->System.out.println("Nombre: " + s.getNombre()));
        
        System.out.println("Lista de sillas según orden peso");
        CriterioPeso criPe = new CriterioPeso();
        //La variable criterio es de tipo CriterioPeso, Object y Comparator
        Collections.sort(listaSilla, new Comparator<Silla>() {
            @Override
            public int compare(Silla o1, Silla o2) {
                return Integer.compare(o1.peso, o2.peso);
            }
        });
        
        Comparator<Silla> criterio1 =  (si1,si2)->Integer.compare(si1.peso, si2.peso);
        Collections.sort(listaSilla, (si1,si2)->Integer.compare(si1.peso, si2.peso));
        listaSilla.forEach(System.out::println);
        
    }
    
}
