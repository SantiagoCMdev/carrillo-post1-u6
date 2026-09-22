package com.ejemplo.mvc.controller.comando;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

public interface Comando {
    String ejecutar(HttpServletRequest req, HttpServletResponse resp)
        throws ServletException, IOException;
}