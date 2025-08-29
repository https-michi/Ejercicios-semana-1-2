/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.none.semana02.ejercicio5;

/**
 *
 * @author Edward Núñez
 */
public class ConversionTemperatura {
    //atributo
    private double tempGrados;
    
    //constructor
    public ConversionTemperatura(double tempGrados){
        this.tempGrados = tempGrados;
    }
    //getter y setter
    public double getGradosCelsius() {
        return tempGrados;
    }

    public void setGradosCelsius(double gradosCelsius) {
        this.tempGrados = gradosCelsius;
    }

    //metodo para conversión
    public double convertirAFahrenheit() {
        return (tempGrados * 9/5) + 32;
    }

    
}
