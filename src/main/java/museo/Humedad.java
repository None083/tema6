/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package museo;

/**
 *
 * @author noelia
 */
public final class Humedad extends Sensor {
    
    int maxHum;
    int minHum;

    public Humedad(int maxHum, int minHum, String id) {
        super(id);
        this.maxHum = maxHum;
        this.minHum = minHum;
    }

    public int getMaxHum() {
        return maxHum;
    }

    public void setMaxHum(int maxHum) {
        this.maxHum = maxHum;
    }

    public int getMinHum() {
        return minHum;
    }

    public void setMinHum(int minHum) {
        this.minHum = minHum;
    }

    @Override
    public String toString() {
        return "Humedad{" + "maxHum=" + maxHum + ", minHum=" + minHum + '}';
    }


    @Override
    public void alarma() {
        
    }
    
    
    
}
