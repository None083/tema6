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
public class Museo {
    
    private String nombre;
    private String direccion;
    private List<Sala> listaSalas;
    private List<Empleado> listaEmpleados;

    public Museo(String nombre, String direccion) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.listaSalas = new ArrayList<>();
        this.listaEmpleados = new ArrayList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    @Override
    public String toString() {
        return "Museo{" + "nombre=" + nombre + ", direccion=" + direccion + ", listaSalas=" + listaSalas + ", listaEmpleados=" + listaEmpleados + '}';
    }
    
    public void contratar(Empleado e){
        this.listaEmpleados.add(e);
    }
    
    public void despedir(Empleado e){
        this.listaEmpleados.remove(e);
    }
    
    public void aniadirSala(Sala s){
        this.listaSalas.add(s);
    }
    
    public void quitarSala(Sala s){
        this.listaSalas.remove(s);
    }
    
}
