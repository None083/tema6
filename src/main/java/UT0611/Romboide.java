/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UT0611;

/**
 *
 * @author FX506
 */
public class Romboide extends Figura {

    public Romboide(int base, int altura) {
        super(base, altura);
    }

    public Romboide() {
    }

    @Override
    public int calcularArea() {
        return getBase() * getAltura();
    }

    @Override
    public String toString() {
        return "Rectangulo{" + "Base: " + super.getBase() + "Altura: " + super.getAltura() + '}';
    }
    
}
