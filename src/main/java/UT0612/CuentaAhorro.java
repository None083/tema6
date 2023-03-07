/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package UT0612;

/**
 *
 * @author FX506
 */
public class CuentaAhorro extends Cuenta {
    
    public double interes;
    public double comisionAnual;

    public CuentaAhorro(double interesVariable, double comisionAnual, Persona cliente) {
        super(cliente);
        this.interes = interesVariable;
        this.comisionAnual = comisionAnual;
    }

    public double getInteres() {
        return interes;
    }

    public void setInteres(double interes) {
        this.interes = interes;
    }

    public double getComisionAnual() {
        return comisionAnual;
    }

    public void setComisionAnual(double comisionAnual) {
        this.comisionAnual = comisionAnual;
    }


    @Override
    public void actualizarSaldo() {
        super.saldo = (super.saldo + (super.saldo * interes / 100)) - comisionAnual;
    }

    @Override
    public void retirar(double cantidad) {
        if (super.saldo >= cantidad){
            super.saldo -= cantidad;
        }
    }

    @Override
    public String toString() {
        return "CuentaAhorro{" + "interesVariable=" + interes + ", comisionAnual=" + comisionAnual + super.toString() + '}';
    }
    
    
    
}
