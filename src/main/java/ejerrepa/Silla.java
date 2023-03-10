/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerrepa;

import java.util.Objects;

/**
 *
 * @author noelia
 *
 * se necesita equals, comparable (compareto), hashcode
 *
 */
public class Silla implements Comparable<Silla> {

     String nombre;
     int peso;

    public Silla(String nombre, int peso) {
        this.nombre = nombre;
        this.peso = peso;
    }

    public Silla() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + Objects.hashCode(this.nombre);
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
        final Silla other = (Silla) obj;
        return Objects.equals(this.nombre, other.nombre);
    }

    @Override
    public String toString() {
        return "Silla{" + "nombre=" + nombre + ", peso=" + peso + '}';
    }

    @Override
    public int compareTo(Silla o) {
        return this.nombre.compareToIgnoreCase(o.nombre);

    }

}
