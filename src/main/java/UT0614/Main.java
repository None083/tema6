/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package UT0614;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author FX506
 */
public class Main {

    public static void main(String[] args) {
        
        List<Silencioso> listaSilencio = new ArrayList<>();
        
        Frigorifico f1 = new Frigorifico(20, 30, "fr01");
        Microondas m2 = new Microondas(30, 21, "mi02");
        CampanaExtractora c3 = new CampanaExtractora(34, 44, "ce03");
        
        listaSilencio.add(f1);
        listaSilencio.add(m2);
        //listaSilencio.add(c3); no se puede añadir porque la clase CampanaExtractora 
        //no tiene implementada la interfaz Silencioso
        
        
        
    }
    
}
