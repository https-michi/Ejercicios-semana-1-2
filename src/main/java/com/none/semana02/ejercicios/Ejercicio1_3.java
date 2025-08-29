/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.none.semana02.ejercicios;
import com.none.semana02.ejercicios.Cilindro;
import com.none.semana02.ejercicios.Numero;
import com.none.semana02.ejercicios.Triangulo;
import java.util.Scanner;
/**
 *
 * @author COREI5 8VA
 */
public class Ejercicio1_3 {
    public static void main (String[] args){
         Scanner sc = new Scanner(System.in);

        // -------------------------------------------------------------------------------------------
        // Ejercicios Propuestos:
       
        // 1. Triángulo
        System.out.print("Ingrese la base del triángulo: ");
        double base = sc.nextDouble();
        System.out.print("Ingrese la altura del triángulo: ");
        double altura = sc.nextDouble();

        Triangulo t1 = new Triangulo(base, altura);
        System.out.println("Área del triángulo: " + t1.areaTriangulo());

        // 2. Número
        System.out.print("\nIngrese un número: ");
        int num = sc.nextInt();

        Numero numero = new Numero(num);
        System.out.println(numero.getNumeroReal() + " elevado al cuadrado es: " + numero.cuadradoNumero() + " m2");
        System.out.println(numero.getNumeroReal() + " elevado al cubo es: " + numero.cuboNumero() + " m3");

        // 3. Cilindro
        System.out.print("\nIngrese el radio del cilindro: ");
        double radio = sc.nextDouble();
        System.out.print("Ingrese la altura del cilindro: ");
        double alturaCilindro = sc.nextDouble();

        Cilindro cilindro = new Cilindro(radio, alturaCilindro);
        System.out.println("El volumen del cilindro es: " + cilindro.volumenCilindro() + " m3");

        sc.close(); // cerrar el scanner
        
    }
}
