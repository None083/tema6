/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerrepa;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 *
 * @author noelia
 * 
 * 1. en el main, metodo static que a partir de una lista de vuelos (recibe como pararametro) devuelve un map
 * para cada ciudad de destino que guarde el numero total de pasajeros que llegan
 * 
 * 2. que la lista de ciudades venga ordenada por personas con comparable ()
 * 
 * 3. que para la lista de vuelos haga un map que guarde para cada codigo de vuelo el conjunto 
 * de pasajeros que lleva ese vuelo (set)
 * 
 */
public class Vuelo implements Comparable<Vuelo>{
    
    private String codigo;
    private String origen;
    private String destino;
    private int duracion;
    private List<Pasajero> lista = new ArrayList<>();

    public Vuelo(String codigo, String origen, String destino, int duracion) {
        this.codigo = codigo;
        this.origen = origen;
        this.destino = destino;
        this.duracion = duracion;
    }

    public Vuelo() {
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getOrigen() {
        return origen;
    }

    public void setOrigen(String origen) {
        this.origen = origen;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public List<Pasajero> getLista() {
        return lista;
    }

    public void setLista(List<Pasajero> lista) {
        this.lista = lista;
    }

    @Override
    public String toString() {
        return "Vuelo{" + "codigo=" + codigo + ", origen=" + origen + ", destino=" + destino + ", duracion=" + duracion + ", lista=" + lista + '}';
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 79 * hash + Objects.hashCode(this.codigo);
        hash = 79 * hash + Objects.hashCode(this.origen);
        hash = 79 * hash + Objects.hashCode(this.destino);
        hash = 79 * hash + this.duracion;
        hash = 79 * hash + Objects.hashCode(this.lista);
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
        final Vuelo other = (Vuelo) obj;
        if (this.duracion != other.duracion) {
            return false;
        }
        if (!Objects.equals(this.codigo, other.codigo)) {
            return false;
        }
        if (!Objects.equals(this.origen, other.origen)) {
            return false;
        }
        if (!Objects.equals(this.destino, other.destino)) {
            return false;
        }
        return Objects.equals(this.lista, other.lista);
    }

    

    @Override
    public int compareTo(Vuelo o) {
        return this.destino.compareToIgnoreCase(o.destino);
    }

}
