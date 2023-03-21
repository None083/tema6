/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package museo;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author noelia
 */
public abstract class Sala {
    
    private Temperatura sensorTemp;
    private Humedad sensorHum;
    private List<Obra> listaObras;

    public Sala(Temperatura sensorTemp, Humedad sensorHum) {
        this.sensorTemp = sensorTemp;
        this.sensorHum = sensorHum;
        this.listaObras = new ArrayList<>();
    }

    public Temperatura getSensorTemp() {
        return sensorTemp;
    }

    public void setSensorTemp(Temperatura sensorTemp) {
        this.sensorTemp = sensorTemp;
    }

    public Humedad getSensorHum() {
        return sensorHum;
    }

    public void setSensorHum(Humedad sensorHum) {
        this.sensorHum = sensorHum;
    }

    @Override
    public String toString() {
        return "Sala{" + "sensorTemp=" + sensorTemp + ", sensorHum=" + sensorHum + ", listaObras=" + listaObras +'}';
    }
    
    public void aniadirObra(Obra o){
        listaObras.add(o);
    }
    
}
