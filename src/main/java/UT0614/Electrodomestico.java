/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UT0614;

/**
 *
 * @author noelia
 */
public abstract class Electrodomestico {

    private double consumo;
    private String modelo;

    public Electrodomestico(double consumo, String modelo) {
        this.consumo = consumo;
        this.modelo = modelo;
    }

    public double getConsumo() {
        return consumo;
    }

    public String getModelo() {
        return modelo;
    }

    public void setConsumo(double consumo) {
        this.consumo = consumo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
    

}
