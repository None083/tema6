/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UT0603;

/**
 *
 * @author noelia
 */
public class Jardinere extends Persona{
    
    private int antiguedad;

    public Jardinere(int antiguedad) {
        this.antiguedad = antiguedad;
    }

    public Jardinere() {
    }

    public int getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Jardinere{");
        sb.append("antiguedad=").append(antiguedad);
        sb.append('}');
        return sb.toString();
    }
    
    
    
}
