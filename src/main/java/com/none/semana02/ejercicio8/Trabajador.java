package com.none.semana02.ejercicio8;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author snowden
 */
class Trabajador {
    private String nombre;
    private double precioHora;
    private int horasTrabajadas;

    public Trabajador(String nombre, double precioHora, int horasTrabajadas) {
        this.nombre = nombre;
        this.precioHora = precioHora;
        this.horasTrabajadas = horasTrabajadas;
    }

    public String getNombre() {
        return nombre;
    }

    public double calcularSalarioBruto() {
        return precioHora * horasTrabajadas;
    }

    public double calcularImpuesto() {
        return calcularSalarioBruto() * 0.10;
    }

    public double calcularSalarioNeto() {
        return calcularSalarioBruto() - calcularImpuesto();
    }
}
