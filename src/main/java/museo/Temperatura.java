/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package museo;

/**
 *
 * @author noelia
 */
public final class Temperatura extends Sensor {
    
    int maxTemp;
    int minTemp;

    public Temperatura(int maxTemp, int minTemp, String id) {
        super(id);
        this.maxTemp = maxTemp;
        this.minTemp = minTemp;
    }

    public int getMaxTemp() {
        return maxTemp;
    }

    public void setMaxTemp(int maxTemp) {
        this.maxTemp = maxTemp;
    }

    public int getMinTemp() {
        return minTemp;
    }

    public void setMinTemp(int minTemp) {
        this.minTemp = minTemp;
    }

    @Override
    public String toString() {
        return "Temperatura{" + "maxTemp=" + maxTemp + ", minTemp=" + minTemp + '}';
    }
    
    

    @Override
    public void alarma() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}
