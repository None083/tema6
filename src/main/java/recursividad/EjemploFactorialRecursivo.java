/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package recursividad;

import java.util.Scanner;

/**
 *
 * @author noelia
 */
public class EjemploFactorialRecursivo {

    public static void main(String[] args) {

        //System.out.println(factorial(5));
        //System.out.println(factorialRecursivo(5));
        
        
        int numero = leerNumero();
        while (numero > -1) {
            mostrarFactorial(numero);
            numero = leerNumero();
        }
        
        System.out.println("\nFin del programa");

    }

    public static int factorial(int numero) {
        if (numero < 0) {
            numero = numero * -1;
        }
        if (numero <= 0) {
            return 1;
        }
        int factorial = 1;
        while (numero > 1) {
            factorial = factorial * numero;
            numero--;
        }
        return factorial;
    }

    public static int factorialRecursivo(int numero) {
        if (numero <= 1) {
            return 1;
        }
        return numero * factorialRecursivo(numero - 1);
    }

    private static void mostrarFactorial(int num) {
        System.out.printf("%n%d! = ", num);
        int fact = 1;
        if (num != 0) {
            for (int i = num; i > 0; i--) {
                fact *= i;
                System.out.print(i);
                if (i > 1) {
                    System.out.print(" * ");
                } else {
                    System.out.print(" = ");
                }
            }
        }
        System.out.println(fact + "\n");
    }

    private static int leerNumero() {
        int num;
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número (negativo para terminar): ");
        num = sc.nextInt();
        return num;
    }

}
