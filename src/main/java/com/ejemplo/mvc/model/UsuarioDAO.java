package com.ejemplo.mvc.model;

import java.util.*;

public class UsuarioDAO {
    private static final Map<String, Usuario> usuarios = new HashMap<>();

    static {
        usuarios.put("admin", new Usuario(
            "admin", "Admin123!", "Administrador General", "ADMIN"));
        usuarios.put("maria", new Usuario(
            "maria", "Maria2026!", "Maria Fernanda Rojas", "USER"));
    }

    public Usuario buscarPorUsername(String username) {
        return usuarios.get(username);
    }
}