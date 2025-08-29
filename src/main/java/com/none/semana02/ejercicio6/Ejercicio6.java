/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.none.semana02.ejercicio6;

/**
 *
 * @author Edward Núñez
 */
public class Ejercicio6 {

    public static void main(String[] args) {
        ConversionLongitud longitud = new ConversionLongitud(2); 
        System.out.println(longitud.getMetros() + " metros en pies: " + longitud.convertirAPies());
        System.out.println(longitud.getMetros() + " metros en pulgadas: " + longitud.convertirAPulgadas());
    }
}
