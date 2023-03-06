package main;

public class Pelota {
    private String marca;
    private String color;
    private double radio;
    private double peso;
    private boolean inflada;

    // Constructor
    public Pelota(String marca, String color, double radio, double peso, boolean inflada) {
        this.marca = marca;
        this.color = color;
        this.radio = radio;
        this.peso = peso;
        this.inflada = inflada;
    }

    // Métodos de acceso
    public String getMarca() {
        return marca;
    }

    public String getColor() {
        return color;
    }

    public double getRadio() {
        return radio;
    }

    public double getPeso() {
        return peso;
    }

    public boolean isInflada() {
        return inflada;
    }

    // Método toString
    @Override
    public String toString() {
        return "Pelota [marca=" + marca + ", color=" + color + ", radio=" + radio + ", peso=" + peso + ", inflada=" + inflada + "]";
    }

    // Métodos de uso general
    public void inflar() {
        inflada = true;
        System.out.println("La pelota ha sido inflada.");
    }

    public void desinflar() {
        inflada = false;
        System.out.println("La pelota ha sido desinflada.");
    }

    public void rebotar() {
        if (inflada) {
            System.out.println("La pelota está rebotando.");
        } else {
            System.out.println("La pelota no está inflada, no puede rebotar.");
        }
    }
}
