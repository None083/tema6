/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package museo;

/**
 *
 * @author noelia
 */
public abstract class Obra {
    
    private String id;
    private String autor;
    
    
    public Obra(String id, String autor) {
        this.id = id;
        this.autor = autor;
    }
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    @Override
    public String toString() {
        return "Obra{" + "id=" + id + ", autor=" + autor + '}';
    }

    
    
    
    
}
