/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.none.semana02.ejercicio5;;

/**
 *
 * @author Edward Núñez
 */
public class Ejercicio5 {

    public static void main(String[] args) {
        ConversionTemperatura temp = new ConversionTemperatura(25);
        System.out.println(temp.getGradosCelsius() + " °C en Fahrenheit es: " 
                           + temp.convertirAFahrenheit() + " °F");
    }
}
