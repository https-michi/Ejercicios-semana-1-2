/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.none.semana02.ejercicio6;

/**
 *
 * @author Edward Núñez
 */
public class ConversionLongitud {
     //atributo
    private double metros;

    //constructor
    public ConversionLongitud(double metros) {
        this.metros = metros;
    }

    //getter y setter
    public double getMetros() {
        return metros;
    }

    public void setMetros(double metros) {
        this.metros = metros;
    }

    //METODOS CONVERSION
    public double convertirAPies() {
        return metros * 3.28084;
    }

    public double convertirAPulgadas() {
        return metros * 39.3701; //
    }

    
}
