package org.example.Controlador;

import org.example.Modelo.Elemento;
import org.example.Modelo.ModeloTablaElemento;
import org.example.Vista.VentanaElementos;

import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.net.MalformedURLException;
import java.sql.SQLException;

public class Controlador extends MouseAdapter {

    private VentanaElementos view;
    private ModeloTablaElemento modelo;
    public Controlador(VentanaElementos view) {
        this.view = view;
        modelo = new ModeloTablaElemento();
        this.view.getTblElemento().setModel(modelo);
        this.view.getBtnCargar().addMouseListener(this);
        this.view.getBtnAgregar().addMouseListener(this);
        this.view.getTblElemento().addMouseListener(this);
        this.view.getBtnEliminar().addMouseListener(this);
        this.view.getBtnActualizar().addMouseListener(this);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if(e.getSource() == this.view.getBtnCargar()){
            modelo.cargarDatos();
            this.view.getTblElemento().setModel(modelo);
            this.view.getTblElemento().updateUI();
        }

        if(e.getSource() == this.view.getBtnActualizar()){
            int index = this.view.getTblElemento().getSelectedRow();
            Elemento tmp = modelo.getElementoAtIndex(index);
            int id = tmp.getId();
            String datoActualizado = JOptionPane.showInputDialog(view, "Introduce el dato a actualizar"
                    + this.view.getTblElemento().getColumnName(view.getTblElemento().getSelectedColumn()) + "del registro"
                    + id, "Actualizar", JOptionPane.INFORMATION_MESSAGE);

            int colIndex = this.view.getTblElemento().getSelectedColumn();

            try{
                if(modelo.actualizarCelda(datoActualizado, id, colIndex)){
                    System.out.println("Se actualizo");
                    modelo.cargarDatos();
                    this.view.getTblElemento().setModel((modelo));
                    this.view.getTblElemento().updateUI();

                }else {
                    System.out.println("Fallo actualizar el dato");
                }
            }catch (SQLException ex){
                throw new RuntimeException(ex);

            }

        }

        if (e.getSource() == this.view.getBtnEliminar()){
            int index = this.view.getTblElemento().getSelectedRow();
                Elemento tmp = modelo.getElementoAtIndex(index);
                int resultado = JOptionPane.showConfirmDialog(view, "Esta seguro de eliminar el registro" +
                        (tmp.getId()) + "?", "Confirmacion", JOptionPane.YES_NO_OPTION);
                if (resultado == JOptionPane.YES_NO_OPTION){
                    try{
                        if(modelo.borrarFila(tmp.getId())){
                            JOptionPane.showMessageDialog(view, "Se borro correctamente", "Aviso",
                                    JOptionPane.INFORMATION_MESSAGE);
                            modelo.cargarDatos();
                            this.view.getTblElemento().setModel(modelo);
                            this.view.getTblElemento().updateUI();

                        }else {
                            JOptionPane.showMessageDialog(view, "No se pudo borrar el elemento", "Error",
                                    JOptionPane.ERROR_MESSAGE);
                        }
                    }catch (SQLException ex){
                        throw new RuntimeException(ex);
                    }
                }
        }

        if(e.getSource() == this.view.getBtnAgregar()){
            Elemento elemento = new Elemento();
            elemento.setId(0);
            elemento.setGrupo(this.view.getTxtGrupo().getText());
            elemento.setNombre(this.view.getTxtNombre().getText());
            elemento.setBloque(this.view.getTxtBloque().getText());
            elemento.setTipo(this.view.getTxtTipo().getText());
            elemento.setURL(this.view.getTxtUrl().getText());
            if(modelo.agregarElemento(elemento)){
                JOptionPane.showMessageDialog(view,
                        "Se agrego correctamente", "Aviso",JOptionPane.INFORMATION_MESSAGE);
                modelo.cargarDatos();
                this.view.getTblElemento().setModel(modelo);
                this.view.getTblElemento().updateUI();

            }else {
                JOptionPane.showMessageDialog(view,
                        "No se pudo agregar a la base de datos. Por favor revise su conexión",
                        "Error al insertar", JOptionPane.ERROR_MESSAGE);
            }
            this.view.limpiar();
        }

        if(e.getSource() == view.getTblElemento()){

            try{
                int index = this.view.getTblElemento().getSelectedRow();
                Elemento tmp = modelo.getElementoAtIndex(index);
                this.view.getImagenElemento().setIcon(tmp.getImagen());
            }catch (MalformedURLException mfue){
                throw  new RuntimeException(mfue);

            }
            this.view.getImagenElemento().setText("");

        }

        if(e.getSource() == this.view.getBtnEliminar()){
            int index = this.view.getTblElemento().getSelectedRow();
            Elemento tmp = modelo.getElementoAtIndex(index);
            int resultado = JOptionPane.showConfirmDialog(view, "Quiere borrar el reguistro" + (tmp.getId())
                    + "?","Confirmación", JOptionPane.YES_NO_OPTION);
            if(resultado == JOptionPane.YES_NO_OPTION){
                try{
                    if (modelo.borrarFila(tmp.getId())){
                        JOptionPane.showMessageDialog(view, "Se borro correctamente", "Aviso",
                                JOptionPane.INFORMATION_MESSAGE);
                        modelo.cargarDatos();
                        this.view.getTblElemento().setModel(modelo);
                        this.view.getTblElemento().updateUI();

                    }else{
                        JOptionPane.showMessageDialog(view, "No se puudo borrar, revise su conexción",
                                "Error",JOptionPane.ERROR_MESSAGE);
                    }
                }catch (SQLException err){
                    throw new RuntimeException(err);
                }
            }
        }
    }
}
