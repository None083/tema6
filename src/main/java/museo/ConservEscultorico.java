/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package museo;

/**
 *
 * @author FX506
 */
public class ConservEscultorico extends Conservador {

    public ConservEscultorico(String nif, String nombre) {
        super(nif, nombre);
    }

    @Override
    public void restaurar(Obra o) {
        if(o instanceof Escultura){
            System.out.println("El conservador " + super.getNombre() + 
                    ", comienza la restauración de la escultura " + o.getId());
        } else{
            System.out.println("Este restaurador solo puede trabajar con esculturas");
        }
    }
    
    
    
}
