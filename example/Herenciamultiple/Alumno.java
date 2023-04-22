package org.example.Herenciamultiple;

public class Alumno extends Persona{
    private int numeroCuenta;
    private String carrera;
    private double primedio;

    public Alumno() {
    }

    public Alumno(int numeroCuenta, String carrera, double primedio) {
        this.numeroCuenta = numeroCuenta;
        this.carrera = carrera;
        this.primedio = primedio;
    }

    public Alumno(String nombre, int edad, int numeroCuenta, String carrera, double primedio) {
        super(nombre, edad);
        this.numeroCuenta = numeroCuenta;
        this.carrera = carrera;
        this.primedio = primedio;
    }

    public Alumno(String nombre, int edad) {
        super(nombre, edad);
    }

    @Override
    public String toString() {
        return "Alumno{" +
                "numeroCuenta=" + numeroCuenta +
                ", carrera='" + carrera + '\'' +
                ", primedio=" + primedio +
                '}';
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public double getPrimedio() {
        return primedio;
    }

    public void setPrimedio(double primedio) {
        this.primedio = primedio;
    }

}
