package org.example.Modelo;

import org.example.Persistencia.ElementoDAO;


import javax.swing.event.TableModelListener;
import javax.swing.table.TableModel;
import java.sql.SQLException;
import java.util.ArrayList;

public class ModeloTablaElemento implements TableModel {
    public static final int COLUMS = 6;
    private ArrayList<Elemento> datos;
    private ElementoDAO Edao;

    public ModeloTablaElemento() {
        Edao = new ElementoDAO();
        datos = new ArrayList<>();
    }

    public ModeloTablaElemento(ArrayList<Elemento> datos) {
        this.datos = datos;
        Edao = new ElementoDAO();
    }

    @Override
    public int getRowCount() {
        return datos.size();
    }

    @Override
    public int getColumnCount() {
        return COLUMS;
    }

    @Override
    public String getColumnName(int columnIndex) {
        switch (columnIndex){
            case 0:
                return "Id";
            case 1:
                return "Grupo";
            case 2:
                return "Nombre";
            case 3:
                return "Bloque";
            case 4:
                return "Tipo";
            case 5:
                return "URL";

        }
        return null;
    }

    @Override
    public Class<?> getColumnClass(int columnIndex) {
        switch (columnIndex){
            case 0:
                return Integer.class;
            case 1:
                return String.class;
            case 2:
                return String.class;
            case 3:
                return Integer.class;
            case 4:
                return String.class;
            case 5:
                return String.class;
        }
        return null;
    }

    @Override
    public boolean isCellEditable(int rowIndex, int columnIndex) {
        return true;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        Elemento tmp = datos.get(rowIndex);
        switch (columnIndex){
            case 0:
                return tmp.getId();
            case 1:
                return tmp.getGrupo();
            case 2:
                return tmp.getNombre();
            case 3:
                return tmp.getBloque();
            case 4:
                return tmp.getTipo();
            case 5:
                return tmp.getURL();
        }
        return null;
    }

    @Override
    public void setValueAt(Object o, int rowIndex, int columnIndex) {
        switch (columnIndex){
            case 0:
                //datos.get(rowIndex).setId();
                break;
            case 1:
                datos.get(rowIndex).setGrupo((String)o);
            case 2:
                datos.get(rowIndex).setNombre((String)o);
            case 3:
                datos.get(rowIndex).setBloque((String)o);
            case 4:
                datos.get(rowIndex).setTipo((String)o);
            case 5:
                datos.get(rowIndex).setURL((String)o);
                break;
            default:
                System.out.println("No se modifica nada");
        }
    }

    @Override
    public void addTableModelListener(TableModelListener l) {

    }

    @Override
    public void removeTableModelListener(TableModelListener l) {

    }
    public void cargarDatos(){
        try{
            ArrayList<Elemento> tirar = Edao.obtenerTodo();
            System.out.println(tirar);
            datos = Edao.obtenerTodo();
        }catch (SQLException sqle){
            System.out.println(sqle.getMessage());
        }
    }

    public boolean agregarElemento(Elemento elemento){
        boolean resultado = false;
        try{
            if(Edao.insertar(elemento)){
                datos.add(elemento);
                resultado = true;
            } else{

                resultado = false;
            }

        }catch (SQLException sqle){
            System.out.println(sqle.getMessage());
        }
            return resultado;
        }
        public boolean borrarFila(int index) throws SQLException{
            if (Edao.delete(index)){
                return  true;
            } else {
                return false;
            }
        }

        public boolean actualizarCelda(String datoActualizado, int id, int colIndex) throws SQLException{
            if(Edao.cambiarPorCeldas(datoActualizado, id, colIndex)){
                return true;
            } else {
                return false;
            }
        }
        public Elemento getElementoAtIndex(int idx){
            return datos.get(idx);

    }

}