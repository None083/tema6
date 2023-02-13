/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package VentanaAbstracta;

/**
 *
 * @author noelia
 * 
 * 1.ya no se puede hacer nuew ventana, ahora es nee abatible o new corredera
 * 
 * 2.todas las clases hijas debe implementar los metodos abstact
 * 
 */
public abstract class Ventana {
    
    private boolean estado;

    public Ventana() {
    }

    public Ventana(boolean estado) {
        this.estado = estado;
    }
    
    public abstract void abrir(int numero);
    
    public abstract void cerrar(int numero);

    public boolean getEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
    
    

    @Override
    public String toString() {
        return "Ventana{" + "estado=" + estado + '}';
    }
    
    
    
}
