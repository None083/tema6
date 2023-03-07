/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UT0612;

import java.util.HashSet;
import java.util.Set;
import org.apache.commons.lang3.RandomStringUtils;

/**
 *
 * @author FX506
 */
public abstract class Cuenta {

    protected String numeroCuenta;
    protected double saldo;
    protected Persona cliente;
    private static Set<String> lista = new HashSet<>();

    public Cuenta(Persona cliente) {
        this.cliente = cliente;
        this.saldo = 0;
        this.numeroCuenta = generarNumeroCuenta();
    }

    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public Persona getCliente() {
        return cliente;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void setCliente(Persona cliente) {
        this.cliente = cliente;
    }
    
    public abstract void actualizarSaldo();
    
    public abstract void retirar(double cantidad);

    private String generarNumeroCuenta() {
        String numero;
        boolean noRepite;
        do {
            numero = RandomStringUtils.randomNumeric(20);
            if (lista.contains(numero)) {
                noRepite = false;
            } else {
                noRepite = true;
                lista.add(numero);
            }
        } while (noRepite = false);
        return numero;
    }

    @Override
    public String toString() {
        return "Cuenta{" + "numeroCuenta=" + numeroCuenta + ", saldo=" + saldo + ", cliente=" + cliente + '}';
    }
    
    

}
