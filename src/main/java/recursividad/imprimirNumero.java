/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package recursividad;

/**
 *
 * @author noelia
 */
public class imprimirNumero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        imprimirNumeroRecursivo(5);
    }

    public static void imprimirNumeroRecursivo(int numero) {
        if (numero >= 0) {
            imprimirNumeroRecursivo(numero - 1);
        }
        System.out.println(numero);
    }

}
