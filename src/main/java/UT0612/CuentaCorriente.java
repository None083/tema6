/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UT0612;

/**
 *
 * @author FX506
 */
public class CuentaCorriente extends Cuenta {

    private double interes;
    private double saldoMin;

    public CuentaCorriente(double saldoMinimo, Persona cliente) {
        super(cliente);
        this.interes = 1.5;
        this.saldoMin = saldoMinimo;
    }

    @Override
    public void actualizarSaldo() {
        if (super.saldo > 1000) {
            super.saldo = super.saldo + (this.saldoMin * this.interes / 100);
        } else {
            super.saldo = super.saldo + (super.saldo + this.interes / 100);
        }
    }

    @Override
    public void retirar(double cantidad) {
        if (super.saldo - cantidad >= this.saldoMin) {
            super.saldo -= cantidad;
        }
    }

    @Override
    public String toString() {
        return "CuentaCorriente{" + "interes=" + interes + ", saldoMin=" + saldoMin + super.toString() + '}';
    }
    
    

}
