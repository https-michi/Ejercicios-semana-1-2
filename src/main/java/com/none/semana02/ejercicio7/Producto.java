/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.none.semana02.ejercicio7;

/**
 *
 * @author snowden
 */
class Producto {
    private String nombre;
    private double precioDeCosto;
    private double precioDeVenta;

    public Producto(String nombre, double precioDeCosto, double precioDeVenta) {
        this.nombre = nombre;
        this.precioDeCosto = precioDeCosto;
        this.precioDeVenta = precioDeVenta;
    }

    public String getNombre() {
        return nombre;
    }

    public double calcularGanancia() {
        return precioDeVenta - precioDeCosto;
    }
}
