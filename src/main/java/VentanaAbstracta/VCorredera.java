/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package VentanaAbstracta;

/**
 *
 * @author noelia
 */
public class VCorredera extends Ventana{

    private int longitudApertura;

    public VCorredera(int longitudApertura, boolean estado) {
        super(estado);
        this.longitudApertura = longitudApertura;
    }
    
    public VCorredera(){
        
    }

    public int getLongitidApertura() {
        return longitudApertura;
    }

    public void setLongitidApertura(int longitidApertura) {
        this.longitudApertura = longitidApertura;
    }
    
    @Override
    public void abrir(int numero) {
        this.setEstado(true);
        this.longitudApertura = numero;
    }

    @Override
    public void cerrar(int numero) {
    }

    @Override
    public String toString() {
        return "VCorredera{" + "longitidApertura=" + longitudApertura + '}';
    }
    
    
    
}
