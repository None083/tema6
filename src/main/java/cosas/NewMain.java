/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cosas;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author noelia
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        
    }
    
    public static ArrayList<Robot> getListaRobots(int num){
        var listaRobots = new ArrayList<Robot>();
        Random random = new Random();
        if (num<=0){
            throw new IllegalArgumentException("El numero de robots a crear no es válido");
        }
        
        for (int i = 0; i < num; i++) {
            //listaRobots.add(new Robot(random.nextInt(0,5000), i), random.nextInt(0,101));
        }
        
        return listaRobots;
    }
    
}
