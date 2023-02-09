/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package recursividad;

import java.util.ArrayList;

/**
 *
 * @author noelia
 */
public class DecimalBinario {

    /**
     * d10 --> binario2
     * 10 --> 10/2=5 %0 5/2=2 %1 2/2=1 %0 
     * (el ultimo resultado añadiendo el resto de los otros, del final al principio)
     * 1010
     */
    public static void main(String[] args) {
        
        deciBinarioIterativo(10);
        
    }
    
    public static void deciBinarioIterativo(int n){
        
        ArrayList<Integer> numeros = new ArrayList<>();
        
        while(n>=2){
        	numeros.add(n%2);
        	n /= 2;
       	 
    	}
        numeros.add(n%2);
        for (int i = numeros.size() - 1; i>=0; i--){
        	System.out.print(numeros.get(i));
    	}
        
    }
    
}
