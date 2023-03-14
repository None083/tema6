/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UT0614;

/**
 *
 * @author FX506
 */
public class Microondas extends Electrodomestico implements Silencioso {
    
    private int potenciaMax;

    public Microondas(int potenciaMax, double consumo, String modelo) {
        super(consumo, modelo);
        this.potenciaMax = potenciaMax;
    }


    public int getPotenciaMax() {
        return potenciaMax;
    }

    public void setPotenciaMax(int potenciaMax) {
        this.potenciaMax = potenciaMax;
    }

    @Override
    public String toString() {
        return "Microondas{" + "potenciaMax=" + potenciaMax + '}';
    }
    

    @Override
    public void silencio() {
        System.out.println("El modelo de microondas " + super.getModelo() + " de consumo " + super.getConsumo() + " emite 40db");
    }
    
    
    
}
