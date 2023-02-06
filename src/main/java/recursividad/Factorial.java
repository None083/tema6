/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package recursividad;

/**
 *
 * @author noelia
 */
public class Factorial {

    public static void main(String[] args) {
        
        System.out.println(factorialIterativo(5));
        System.out.println(factorialRecursivo(5));
        
    }
    
    public static int factorialIterativo(int n){
        int resultado = 1;
        int numero = Math.abs(n);
        for (int i = 1; i <= numero; i++) {
            resultado*=i;
        }
        return resultado;
    }
    
    public static int factorialRecursivo(int n){
        int numero = Math.abs(n);
        if(numero == 0 || numero == 1){ // casos base
            return 1;
        } else{
            return numero*factorialRecursivo(numero-1);
        }
        
    }
    
}
