/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.none.semana02.ejercicio8;

/**
 *
 * @author snowden
 */
public class Ejercicio08Runner {
    
    public static void main(String[] args) {

        Trabajador t1 = new Trabajador("Carlos", 25.0, 160);
        System.out.println("\nTrabajador: " + t1.getNombre());
        System.out.println("Salario Bruto: " + t1.calcularSalarioBruto());
        System.out.println("Impuesto (10%): " + t1.calcularImpuesto());
        System.out.println("Salario Neto: " + t1.calcularSalarioNeto());
}
}
