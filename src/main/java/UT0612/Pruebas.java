/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package UT0612;

/**
 *
 * @author FX506
 */
public class Pruebas {

    public static void main(String[] args) {
        
        Persona p1 = new Persona("Noelia", "Pérez", "09888888N");
        Persona p2 = new Persona("Monty", "UwU", "09333333M");
        CuentaCorriente c1 = new CuentaCorriente(1000, p1);
        CuentaAhorro c2 = new CuentaAhorro(1.2, 30, p2);
        
        c1.setSaldo(2000);
        c1.retirar(1500);
        c1.retirar(999);
        c1.actualizarSaldo();
        System.out.println(c1);
        
        c2.setSaldo(2000);
        c2.retirar(1500);
        c2.retirar(1000);
        c2.actualizarSaldo();
        System.out.println(c2);
        
    }
    
}
