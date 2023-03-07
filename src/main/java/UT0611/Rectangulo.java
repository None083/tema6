/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UT0611;

/**
 *
 * @author FX506
 */
public class Rectangulo extends Figura {

    public Rectangulo(int base, int altura) {
        super(base, altura);
    }

    public Rectangulo() {
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
