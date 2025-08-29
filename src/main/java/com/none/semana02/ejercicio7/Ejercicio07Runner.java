/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.none.semana02.ejercicio7;

/**
 *
 * @author snowden
 */
public class Ejercicio07Runner {

    public static void main(String[] args) {
        Producto p1 = new Producto("Laptop", 2000.0, 2800.0);
        System.out.println("Producto: " + p1.getNombre());
        System.out.println("Ganancia: " + p1.calcularGanancia());
    }
}
