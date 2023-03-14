/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UT0616;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import org.apache.commons.lang3.RandomStringUtils;

/**
 *
 * @author FX506
 */
public class Robot implements Comparable<Robot>{
    
    private int numeroSerie;
    private int porcentajeVida;

    public Robot(int numeroSerie) {
        Random aleatorio = new Random();
        this.numeroSerie = numeroSerie;
        this.porcentajeVida = aleatorio.nextInt(100)+1;
    }

    public int getNumeroSerie() {
        return numeroSerie;
    }

    public void setNumeroSerie(int numeroSerie) {
        this.numeroSerie = numeroSerie;
    }

    public int getPorcentajeVida() {
        return porcentajeVida;
    }

    public void setPorcentajeVida(int porcentajeVida) {
        this.porcentajeVida = porcentajeVida;
    }

    @Override
    public String toString() {
        return "Robot{" + "numeroSerie=" + numeroSerie + ", porcentajeVida=" + porcentajeVida + '}';
    }

    @Override
    public int compareTo(Robot o) {
        return Integer.compare(this.porcentajeVida, o.porcentajeVida);
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 17 * hash + this.numeroSerie;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Robot other = (Robot) obj;
        return this.numeroSerie == other.numeroSerie;
    }

    

}
