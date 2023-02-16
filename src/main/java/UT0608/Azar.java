/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UT0608;

/**
 *
 * @author noelia
 */
public abstract class Azar {

    protected int posibilidades;

    public Azar(int posibilidades) {
        this.posibilidades = Math.abs(posibilidades);
    }

    public abstract int lanzar();
    
    public int getPosibilidades() {
        return posibilidades;
    }
    
    
    
}
