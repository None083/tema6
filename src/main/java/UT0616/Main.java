/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package UT0616;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author FX506
 */
public class Main {

    public static void main(String[] args) {
        
        List<Robot> listaRobots = new ArrayList();
        for (int i = 0; i < 20; i++) {
            listaRobots.add(new Robot(i));
        }
        
        Collections.sort(listaRobots);
        
        for (Robot l : listaRobots) {
            System.out.println(l);
        }
        
        System.out.println("-----------");
        
        for (Robot l : listaRobots) {
            if(l.getPorcentajeVida() >= 50){
                System.out.println(l);
            }
        }
        
        
        System.out.println("-----------");
        for (int i = listaRobots.size()-1; i > listaRobots.size()-4; i--) {
            System.out.println(listaRobots.get(i));
        }
        
        System.out.println("------------");
        
        Comparator<Robot> criterioNumeroSerie = (p1,p2)-> Integer.compare(p1.getNumeroSerie(), p2.getNumeroSerie());
        Collections.sort(listaRobots, criterioNumeroSerie);
        
        for (Robot l : listaRobots) {
            System.out.println(l);
        }
        
        System.out.println(Collections.binarySearch(listaRobots, new Robot(8), criterioNumeroSerie));
        
        
    }
    
}
