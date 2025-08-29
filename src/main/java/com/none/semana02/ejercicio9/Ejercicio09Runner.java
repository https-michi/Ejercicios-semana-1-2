/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.none.semana02.ejercicio9;

/**
 *
 * @author snowden
 */
public class Ejercicio09Runner {

    public static void main(String[] args) {

        GasIdeal gas = new GasIdeal(300.0, 2.0, 10.0);
        System.out.println("\nPresión del gas ideal: " + gas.calcularPresion() + " atm");
    }
}
