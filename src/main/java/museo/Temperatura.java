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
        return "Temperatura{" + "maxTemp=" + maxTemp + ", minTemp=" + minTemp + "\n" + super.toString() + '}';
    }

    @Override
    public void alarma(int temperatura) {
        if (temperatura < this.minTemp || temperatura > this.maxTemp){
            System.out.println("Alarma: la temperatura no es adecuada");
        }
    }

}
