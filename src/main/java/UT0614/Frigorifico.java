/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UT0614;

/**
 *
 * @author noelia
 */
public class Frigorifico extends Electrodomestico implements Silencioso {
    
    private double capacidadLitros;

    public Frigorifico(double capacidadLitros, double consumo, String modelo) {
        super(consumo, modelo);
        this.capacidadLitros = capacidadLitros;
    }

    public double getCapacidadLitros() {
        return capacidadLitros;
    }

    public void setCapacidadLitros(double capacidadLitros) {
        this.capacidadLitros = capacidadLitros;
    }

    @Override
    public String toString() {
        return "Frigorifico{" + "capacidadLitros=" + capacidadLitros + '}';
    }

    @Override
    public void silencio() {
        System.out.println("El modelo de frigorifico " + super.getModelo() + " emite 50db");
    }
    
    
    
}
