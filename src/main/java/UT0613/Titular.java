/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UT0613;

import java.time.LocalDate;

/**
 *
 * @author noelia
 */
public final class Titular extends Profesor {
    
    private LocalDate fecJuvilacion;

    public Titular(LocalDate fecJuvilacion, String especialidad, String nombre, String apellido, String nif, String direccion) {
        super(especialidad, nombre, apellido, nif, direccion);
        this.fecJuvilacion = fecJuvilacion;
    }

    public LocalDate getFecJuvilacion() {
        return fecJuvilacion;
    }

    public void setFecJuvilacion(LocalDate fecJuvilacion) {
        this.fecJuvilacion = fecJuvilacion;
    }

    @Override
    public String toString() {
        return "Titular{" + "fecJuvilacion=" + fecJuvilacion + '}';
    }

    @Override
    public void indentificate() {
        
    }
    
    
    
}
