package org.example;

import javax.swing.*;
import javax.swing.event.ListDataListener;
import java.util.ArrayList;

public class NombreModeloCombo implements ComboBoxModel {
    ArrayList<String> datos;
    String selected;

    public NombreModeloCombo() {
        datos = new ArrayList<>();

    }

    public NombreModeloCombo(ArrayList<String> datos, String slected) {
        this.datos = datos;
        this.selected = slected;
    }

    @Override
    public void setSelectedItem(Object o) {
        this.selected = (String) o;
    }

    @Override
    public Object getSelectedItem() {
        return selected;
    }

    @Override
    public int getSize() {
        return datos.size();
    }

    @Override
    public Object getElementAt(int i) {
        return datos.get(i);
    }

    @Override
    public void addListDataListener(ListDataListener listDataListener) {

    }
    public void agregarNombre(String nom){
        datos.add(nom);
    }

    @Override
    public void removeListDataListener(ListDataListener listDataListener) {

    }
}
