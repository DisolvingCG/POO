package org.example;


import org.example.Controlador.Controlador;
import org.example.Vista.VentanaElementos;


public class Main {
    public static void main(String[] args) {

        VentanaElementos view = new VentanaElementos("Elementos");
        Controlador controller = new Controlador(view);
    }
}