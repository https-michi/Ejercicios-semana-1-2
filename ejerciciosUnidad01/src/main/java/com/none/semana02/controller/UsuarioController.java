/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.none.semana02.controller;

import java.util.ArrayList;
import com.none.semana02.model.Usuario;

/**
 *
 * @author COREI5 8VA
 */
public class UsuarioController {

    private ArrayList<Usuario> usuarioList = new ArrayList<>();

    //Agregar usuario
    public void agregarUsuario(Usuario u) {
        try {
            usuarioList.add(u);
            System.out.println("Usuario agregado: " + u.getNombre());
        } catch (Exception e) {
            System.out.println("Error al agregar usuario: " + e.getMessage());
        }
    }

    //Listar usuarios
    public void listarUsuarios() {
        try {
            if (usuarioList.isEmpty()) {
                System.out.println("No hay usuarios registrados");
            } else {
                System.out.println("Lista de usuarios:");
                for (int i = 0; i < usuarioList.size(); i++) {
                    Usuario u = usuarioList.get(i);

                    System.out.println(
                            "Uusario: "
                            + "ID= " + u.getId()
                            + ", Nombre= " + u.getNombre()
                            + ", Email= " + u.getEmail()
                    );
                }
            }
        } catch (Exception e) {
            System.out.println("Error al listar usuarios: " + e.getMessage());
        }
    }

    //Actualizar email
    public void actualizarEmail(int id, String nuevoEmail) {
        try {
            boolean encontrado = false;
            for (Usuario u : usuarioList) {
                if (u.getId() == id) {
                    u.setEmail(nuevoEmail);
                    System.out.println("Email actualizado para el usuario con ID " + id);
                    encontrado = true;
                    break;
                }
            }
            if (!encontrado) {
                System.out.println("Usuario con ID " + id + " no encontrado.");
            }
        } catch (Exception e) {
            System.out.println("Error al actualizar email: " + e.getMessage());
        }
    }

    // Eliminar usuario
    public void eliminarUsuario(int id) {
        try {
            boolean eliminado = false;
            for (int i = 0; i < usuarioList.size(); i++) {
                if (usuarioList.get(i).getId() == id) {
                    usuarioList.remove(i);
                    System.out.println("Usuario con ID " + id + " eliminado.");
                    eliminado = true;
                    break;
                }
            }
            if (!eliminado) {
                System.out.println("Usuario con ID " + id + " no encontrado.");
            }
        } catch (Exception e) {
            System.out.println("Error al eliminar usuario: " + e.getMessage());
        }
    }

}
