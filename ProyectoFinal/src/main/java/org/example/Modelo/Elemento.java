package org.example.Modelo;

import javax.swing.*;
import java.net.MalformedURLException;
import java.net.URL;

public class Elemento {
    private int Id;
    private String Grupo;
    private String Nombre;
    private String  Bloque;
    private String Tipo;
    private String URL;

    public Elemento() {
    }

    public Elemento(String grupo, String nombre, String bloque, String tipo, String URL) {
        this.Grupo = grupo;
        this.Nombre = nombre;
        this.Bloque = bloque;
        this.Tipo = tipo;
        this.URL = URL;
    }

    public Elemento(int id, String Grupo, String Nombre, String Bloque, String Tipo, String URL) {
        this.Id = id;
        this.Grupo = Grupo;
        this.Nombre = Nombre;
        this.Bloque = Bloque;
        this.Tipo = Tipo;
        this.URL = URL;
    }
    public int getId() {
        return Id;
    }

    public void setId(int id) {
        this.Id = id;
    }

    public String getGrupo() {
        return Grupo;
    }

    public void setGrupo(String grupo) {
        Grupo = grupo;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getBloque() {
        return Bloque;
    }

    public void setBloque(String bloque) {
        Bloque = bloque;
    }

    public String getTipo() {
        return Tipo;
    }

    public void setTipo(String tipo) {
        Tipo = tipo;
    }

    public String getURL() {
        return URL;
    }

    public void setURL(String URL) {
        this.URL = URL;
    }

    @Override
    public String toString() {
        return "Elemento{" +
                "id=" + Id +
                ", Grupo='" + Grupo + '\'' +
                ", Nombre='" + Nombre + '\'' +
                ", Bloque='" + Bloque + '\'' +
                ", Tipo='" + Tipo + '\'' +
                ", URL='" + URL + '\'' +
                '}';
    }

    public ImageIcon getImagen() throws MalformedURLException{
        URL urlimagen = new URL(this.URL);
        return  new ImageIcon(urlimagen);
    }
}