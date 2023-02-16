/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UT0608;

import java.util.Random;

/**
 *
 * @author noelia
 */
public class Dado extends Azar {

    public Dado() {
        super(6);
    }
    
    public Dado(int posibilidades){
        super(posibilidades);
    }

    @Override
    public int lanzar() {
        return new Random().nextInt(1, this.getPosibilidades() + 1);
    }
    
    public void metodoDado(){//ejemplo para probar si aparecen los metodos con objeto azar
        System.out.println("Dado");
    }
    
}
