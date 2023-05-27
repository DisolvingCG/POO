package org.example;

import org.example.Controlador.ControladorLibro;
import org.example.Vista.VentanaLibro;

public class Main {
    public static void main(String[] args) {
        VentanaLibro view = new VentanaLibro("MVC y JDBC");
        ControladorLibro controler = new ControladorLibro(view);
    }
}