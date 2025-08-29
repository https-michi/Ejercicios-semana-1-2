/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.none.semana02.ejercicio10;

/**
 *
 * @author snowden
 */
public class Movil {
    private double velocidadInicial;
    private double tiempo;
    private double aceleracion;
    private CalculadoraEspacio calculadora;

    public Movil(double velocidadInicial, double tiempo, double aceleracion, CalculadoraEspacio calculadora) {
        this.velocidadInicial = velocidadInicial;
        this.tiempo = tiempo;
        this.aceleracion = aceleracion;
        this.calculadora = calculadora;
    }

    public double calcularEspacioRecorrido() {
        return calculadora.calcularEspacio(velocidadInicial, tiempo, aceleracion);
    }

    public double getVelocidadInicial() {
        return velocidadInicial;
    }

    public double getTiempo() {
        return tiempo;
    }

    public double getAceleracion() {
        return aceleracion;
    }
}