/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package UT0608;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author noelia
 */
public class EjemploAzar {

    public static void main(String[] args) {
        
        List<Azar> objetosAzar = new ArrayList<>();
        objetosAzar.add(new Moneda()); //conversion implicita
        objetosAzar.add(new Dado()); //conversión implicita
        
        for (Azar a : objetosAzar) {
            System.out.println("Lanzamiento " + a.lanzar());
            // variable a eres un Dado?
            if (a instanceof Dado){
                ((Dado) a).metodoDado(); // conversión explícita
            }
            
        }
        
    }
    
}
