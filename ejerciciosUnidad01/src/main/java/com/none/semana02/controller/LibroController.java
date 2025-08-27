/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.none.semana02.controller;

import java.util.ArrayList;
import com.none.semana02.model.Libro;
/**
 *
 * @author COREI5 8VA
 */
public class LibroController {
    
     private ArrayList<Libro> libros = new ArrayList<>();

    // Agregar libro
    public void agregarLibro(Libro l) {
        try {
            libros.add(l);
            System.out.println("Libro agregado: " + l.getTitulo());
        } catch (Exception e) {
            System.out.println("Error al agregar libro: " + e.getMessage());
        }
    }

    // Listar libros
    public void listarLibros() {
        try {
            if (libros.isEmpty()) {
                System.out.println("No hay libros en la biblioteca.");
            } else {
                System.out.println("Lista de libros:");
                for (Libro l : libros) {
                    System.out.println(
                        "ISBN=" + l.getIsbn() +
                        ", Título=" + l.getTitulo() +
                        ", Autor=" + l.getAutor() +
                        ", Disponible=" + (l.isDisponible() ? "Sí" : "No")
                    );
                }
            }
        } catch (Exception e) {
            System.out.println("Error al listar libros: " + e.getMessage());
        }
    }

    // Prestar libro
    public void prestarLibro(String isbn) {
        try {
            boolean encontrado = false;
            for (Libro l : libros) {
                if (l.getIsbn().equals(isbn)) {
                    encontrado = true;
                    if (l.isDisponible()) {
                        l.setDisponible(false);
                        System.out.println("Libro prestado: " + l.getTitulo());
                    } else {
                        System.out.println("El libro ya está prestado.");
                    }
                    break;
                }
            }
            if (!encontrado) {
                System.out.println("Libro con ISBN " + isbn + " no encontrado.");
            }
        } catch (Exception e) {
            System.out.println("Error al prestar libro: " + e.getMessage());
        }
    }

    // Devolver libro
    public void devolverLibro(String isbn) {
        try {
            boolean encontrado = false;
            for (Libro l : libros) {
                if (l.getIsbn().equals(isbn)) {
                    encontrado = true;
                    if (!l.isDisponible()) {
                        l.setDisponible(true);
                        System.out.println("Libro devuelto: " + l.getTitulo());
                    } else {
                        System.out.println("El libro ya estaba disponible.");
                    }
                    break;
                }
            }
            if (!encontrado) {
                System.out.println("Libro con ISBN " + isbn + " no encontrado.");
            }
        } catch (Exception e) {
            System.out.println("Error al devolver libro: " + e.getMessage());
        }
    }
    
}
