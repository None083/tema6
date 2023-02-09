/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package recursividad;

/**
 *
 * @author noelia
 *
 *
 *
 */
public class SucesionFibonacci {

    public static void main(String[] args) {

        System.out.println(fibonacciIterativo(5));
        System.out.println("--");
        System.out.println(fibonacciRecursivo(7));

    }

    public static int fibonacciIterativo(int n) {
        int numero = Math.abs(n);

        int resultado = 0;
        int n1 = 0;
        int n2 = 1;

        for (int i = 0; i < numero; i++) {
            resultado = n1 + n2;
            n2 = n1;
            n1 = resultado;
        }

        return resultado;
    }

    public static int fibonacciRecursivo(int n) { //suponemos n positivo o 0
        if (n < 2) {
            return n;
        } else {
            return fibonacciRecursivo(n - 1) + fibonacciRecursivo(n - 2);
        }
    }

}
