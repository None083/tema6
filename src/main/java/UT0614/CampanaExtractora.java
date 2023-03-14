/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UT0614;

/**
 *
 * @author FX506
 */
public class CampanaExtractora extends Electrodomestico {
    
    private int decibelios;

    public CampanaExtractora(int decibelios, double consumo, String modelo) {
        super(consumo, modelo);
        
        if (decibelios > 50){
            this.decibelios = 50;
        } else{
            this.decibelios = decibelios;
        }
        
    }

    public int getDecibelios() {
        return decibelios;
    }

    public void setDecibelios(int decibelios) {
        if (decibelios > 50){
            this.decibelios = 50;
        } else{
            this.decibelios = decibelios;
        }
    }
    
    
    
}
