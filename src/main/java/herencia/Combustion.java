/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package herencia;

/**
 *
 * @author noelia
 */
public class Combustion extends Vehiculo{
    
    private int capacidadLitros;
    private TipoCombustible tipo;

    public Combustion(int capacidadLitros, TipoCombustible tipo, Long bastidor, String matricula, String marca, String modelo, String color, double tarifa, boolean disponible) {
        super(bastidor, matricula, marca, modelo, color, tarifa, disponible);
        this.capacidadLitros = capacidadLitros;
        this.tipo = tipo;
    }

    

    public Combustion() {
    }

    public int getCapacidadLitros() {
        return capacidadLitros;
    }

    public void setCapacidadLitros(int capacidadLitros) {
        this.capacidadLitros = capacidadLitros;
    }

    public TipoCombustible getTipo() {
        return tipo;
    }

    public void setTipo(TipoCombustible tipo) {
        this.tipo = tipo;
    }
    
    public void repostar(){
        System.out.println("El vehiculo " + this.getMatricula() + " está repostando");
    }

    @Override
    public String toString() {
        return "Combustion{" + "capacidadLitros=" + capacidadLitros + ", tipo=" + tipo + '}';
    }
    
    
    
}
