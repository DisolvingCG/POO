package org.example;

public class Comida {
    private String nombre;
    private boolean procesado;

    public Comida() {
    }

    public Comida(String nombre, boolean procesado) {
        this.nombre = nombre;
        this.procesado = procesado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isProcesado() {
        return procesado;
    }

    public void setProcesado(boolean procesado) {
        this.procesado = procesado;
    }

    @Override
    public String toString() {
        return "Comida{" +
                "nombre='" + nombre + '\'' +
                ", procesado=" + procesado +
                '}';
    }
}
