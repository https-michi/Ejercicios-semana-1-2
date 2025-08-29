package com.none.semana02.ejercicio4;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Edward Núñez
 */
public class TrianguloRectangulo {
    //atributos
    private double cateto1;
    private double cateto2;
    
    //constructor
    public TrianguloRectangulo(double cateto1, double cateto2) {
        this.cateto1 = cateto1;
        this.cateto2 = cateto2;
    }
    
    // getters y setters
        
        public double getCateto1() {
        return cateto1;
    }

    public void setCateto1(double cateto1) {
        this.cateto1 = cateto1;
    }

    public double getCateto2() {
        return cateto2;
    }

    public void setCateto2(double cateto2) {
        this.cateto2 = cateto2;
    }
     // METODOS
    public double calcularArea() {
        return (cateto1 * cateto2) / 2;
    }

    public double calcularHipotenusa() {
        return Math.sqrt(Math.pow(cateto1, 2) + Math.pow(cateto2, 2));
    }

    public double calcularPerimetro() {
        return cateto1 + cateto2 + calcularHipotenusa();
    }

    public void mostrarDatos() {
        System.out.println("Cateto 1: " + cateto1);
        System.out.println("Cateto 2: " + cateto2);
        System.out.println("Hipotenusa: " + calcularHipotenusa());
        System.out.println("Area: " + calcularArea());
        System.out.println("Perimetro: " + calcularPerimetro());
    }
    
}
