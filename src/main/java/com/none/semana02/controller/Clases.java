/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.none.semana02.controller;


import com.none.semana02.model.Libro;
import com.none.semana02.model.Producto;
import com.none.semana02.model.Usuario;

/**
 *
 * @author COREI5 8VA
 */
public class Clases {
    public static void main(String[] args) {
         //1. 
        ProductoController pc = new ProductoController();
       

        try {
            // Crear productos
            Producto p1 = new Producto(1, "Laptop", 2500.50, 5);
            Producto p2 = new Producto(2, "Mouse", 50.75, 20);
            Producto p3 = new Producto(3, "Teclado", 120.00, 10);

            // Agregar productos al controlador
            pc.agregarProducto(p1);
            pc.agregarProducto(p2);
            pc.agregarProducto(p3);

            // Listar productos
            pc.listarProductos();

            // Buscar un producto existente
            Producto encontrado = pc.buscarProductoPorId(2);
            if (encontrado != null) {
                System.out.println("Producto encontrado: " + encontrado.getNombre() + " con ID: " + encontrado.getId());
            }

            // Buscar un producto inexistente
            pc.buscarProductoPorId(99);

        } 
        catch (Exception e) {
            System.out.println("Error general en el programa: " + e.getMessage());
        }

        // 2.
        UsuarioController controller = new UsuarioController();

        // Crear usuarios
        Usuario u1 = new Usuario(1, "Lorena", "lorena@mail.com");
        Usuario u2 = new Usuario(2, "José", "jose@mail.com");
        Usuario u3 = new Usuario(3, "Ana", "ana@mail.com");

        // Agregar usuarios
        controller.agregarUsuario(u1);
        controller.agregarUsuario(u2);
        controller.agregarUsuario(u3);

        // Listar usuarios
        controller.listarUsuarios();

        // Actualizar email
        controller.actualizarEmail(2, "jose_nuevo@mail.com");
        controller.listarUsuarios();

        // Eliminar usuario
        controller.eliminarUsuario(1);
        controller.listarUsuarios();

        //3.
        LibroController lc = new LibroController();

        // Crear libros
        Libro l1 = new Libro("ISBN001", "Cien Años de Soledad", "Gabriel García Márquez", true);
        Libro l2 = new Libro("ISBN002", "1984", "George Orwell", true);
        Libro l3 = new Libro("ISBN003", "El Principito", "Antoine de Saint-Exupéry", true);

        // Agregar libros
        lc.agregarLibro(l1);
        lc.agregarLibro(l2);
        lc.agregarLibro(l3);

        // Listar libros
        lc.listarLibros();

        // Prestar un libro
        lc.prestarLibro("ISBN002");
        lc.listarLibros();

        // Devolver un libro
        lc.devolverLibro("ISBN002");
        lc.listarLibros();

        // Intentar prestar un libro inexistente
        lc.prestarLibro("ISBN999");
 
    }

}
