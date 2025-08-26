/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.none.semana02.ejercicio10;

/**
 *
 * @author snowden
 */
public class Main {
    public static void main(String[] args) {
        CalculadoraEspacio calculadora = new CalculadoraMRUA();
        Movil movil = new Movil(100, 20, 5, calculadora); 

        System.out.println("Espacio recorrido: " + movil.calcularEspacioRecorrido() + " m");
    }
}