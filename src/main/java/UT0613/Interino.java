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

//clase final implica que no puede tener descendencia
public abstract class Interino extends Profesor implements Comparable<Interino> {
    
    private LocalDate fecIni;
    private LocalDate fecFin;

    public Interino(LocalDate fecIni, LocalDate fecFin, String especialidad, String nombre, String apellido, String nif, String direccion) {
        super(especialidad, nombre, apellido, nif, direccion);
        this.fecIni = fecIni;
        this.fecFin = fecFin;
    }

    public LocalDate getFecFin() {
        return fecFin;
    }

    public void setFecFin(LocalDate fecFin) {
        this.fecFin = fecFin;
    }

    public LocalDate getFecIni() {
        return fecIni;
    }

    public void setFecIni(LocalDate fecIni) {
        this.fecIni = fecIni;
    }

    @Override
    public String toString() {
        return super.toString() + "\nInterino{" + "fecIni=" + fecIni + ", fecFin=" + fecFin + '}';
    }
    
    public int CompareTo(Interino o){
        return this.fecIni.compareTo(o.fecIni);
    }
    
}
