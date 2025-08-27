/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.none.semana02.ejercicios;

/**
 *
 * @author COREI5 8VA
 */
public class Numero {
    
    private double numeroReal;

    public Numero(double numeroReal) {
        this.numeroReal = numeroReal;
    }

    public double getNumeroReal() {
        return numeroReal;
    }

    public void setNumeroReal(double numeroReal) {
        this.numeroReal = numeroReal;
    }

    
    public double cuadradoNumero(){
        return Math.pow(numeroReal, 2);
    }
    
    public double cuboNumero(){
        return Math.pow(numeroReal, 3);
    }
    
}
