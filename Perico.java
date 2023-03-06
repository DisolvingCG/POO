package main;

import java.awt.*;

public class Perico {
    private String Plumas;
    private double tamaño;
    private int edad;
    private String especie;
    private String nombre;


    public Perico() {
    }

    public Perico(String plumas, double tamaño, int edad, String especie, String nombre) {
        Plumas = plumas;
        this.tamaño = tamaño;
        this.edad = edad;
        this.especie = especie;
        this.nombre = nombre;
    }

    public String getPlumas() {
        return Plumas;
    }

    public void setPlumas(String plumas) {
        Plumas = plumas;
    }

    public double getTamaño() {
        return tamaño;
    }

    public void setTamaño(byte tamaño) {
        this.tamaño = tamaño;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Perico{" +
                "Plumas=" + Plumas +
                ", tamaño=" + tamaño +
                ", edad=" + edad +
                ", especie='" + especie + '\'' +
                ", nombre='" + nombre + '\'' +
                '}';
    }

    public boolean volar(){
        System.out.println("El perico se asusto y se fue volando");
        boolean resultado = Math.random() > 5.1;

        return resultado;
    }
    public boolean cantar(){
        System.out.println("El perico esta cantando");
        boolean resultado2 = Math.random() < 7;

        return resultado2;
    }

    
}
