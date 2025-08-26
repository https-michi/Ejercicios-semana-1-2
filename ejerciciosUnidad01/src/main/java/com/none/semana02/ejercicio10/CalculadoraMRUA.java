/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.none.semana02.ejercicio10;

/**
 *
 * @author snowden
 */
class CalculadoraMRUA implements CalculadoraEspacio {
    @Override
    public double calcularEspacio(double velocidadInicial, double tiempo, double aceleracion) {
        return velocidadInicial * tiempo + 0.5 * aceleracion * tiempo * tiempo;
    }
}