/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.none.semana02.controller;

import java.util.ArrayList;
import com.none.semana02.model.Producto;

public class ProductoController {

    private ArrayList<Producto> productos = new ArrayList<>();

    // Agregar producto
    public void agregarProducto(Producto p) {
        try {
            productos.add(p);
            System.out.println("Producto agregado: " + p.getNombre());
        } catch (Exception e) {
            System.out.println("Error al agregar producto: " + e.getMessage());
        }
    }

    //Listar productos
    public void listarProductos() {
        
        try {
            if (productos.isEmpty()) {
                System.out.println("No hay productos en la lista.");
            } else {
                System.out.println("Lista de productos:");
                for (int i= 0; i<productos.size(); i++ ) {
                    Producto p= productos.get(i); //se toma el producto de la lista
                    System.out.println(
                            "Producto: "
                            + "ID= " + p.getId()
                            + ", Nombre= " + p.getNombre()
                            + ", Precio= " + p.getPrecio()
                            + ", Stock= " + p.getStock()
                    );
                }
            }
        } catch (Exception e) {
            System.out.println("Error al listar productos: " + e.getMessage());
        }
    }

    //Buscar producto por ID
    public Producto buscarProductoPorId(int id) {
        try {
            for (Producto p : productos) {
                if (p.getId() == id) {
                    return p;
                }
            }
            System.out.println("Producto con id " + id + " no encontrado.");
        } catch (Exception e) {
            System.out.println("Error al buscar producto: " + e.getMessage());
        }
        return null;
    }
}
