/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.none.semana02.ejercicio9;

/**
 *
 * @author snowden
 */
class GasIdeal {
    private double temperatura;   

    private double numeroDeMoles;  

    private double volumen;        

    private final double R = 0.0821; 

    public GasIdeal(double temperatura, double numeroDeMoles, double volumen) {
        this.temperatura = temperatura;
        this.numeroDeMoles = numeroDeMoles;
        this.volumen = volumen;
    }

    public double calcularPresion() {
   
        return (numeroDeMoles * R * temperatura) / volumen;
    }
}