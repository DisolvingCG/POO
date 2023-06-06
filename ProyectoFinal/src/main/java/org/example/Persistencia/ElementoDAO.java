package org.example.Persistencia;

import org.example.Modelo.Elemento;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class ElementoDAO implements InterfazDAO{
    public ElementoDAO() {
    }

    @Override
    public boolean insertar(Object obj) throws SQLException {
        String sqlInsert = "INSERT INTO Elementos(Grupo, Nombre, Bloque, Tipo, Url) VALUES(?, ?, ?, ?, ?)";
        int rowCount = 0;
        PreparedStatement pstm = Conexion.getInstance("Elementos.db").getConnection().prepareStatement(sqlInsert);
        pstm.setString(1, ((Elemento)obj).getGrupo());
        pstm.setString(2, ((Elemento)obj).getNombre());
        pstm.setString(3, ((Elemento)obj).getBloque());
        pstm.setString(4, ((Elemento)obj).getTipo());
        pstm.setString(5, ((Elemento)obj).getURL());
        rowCount = pstm.executeUpdate();
        return rowCount > 0;
    }

    @Override
    public boolean update(Object obj) throws SQLException {
        String sqlUpdate = "UPDATE Elementos SET Grupo = ? Nombre = ? Bloque = ? Tipo = ? URL = ? WHERE id = ?;";
        int rowCount = 0;
        PreparedStatement pstm = Conexion.getInstance("Elementos.db").getConnection().prepareStatement(sqlUpdate);
        pstm.setString(1, ((Elemento)obj).getGrupo());
        pstm.setString(2, ((Elemento)obj).getNombre());
        pstm.setString(3, ((Elemento)obj).getBloque());
        pstm.setString(4, ((Elemento)obj).getTipo());
        pstm.setInt(6, ((Elemento)obj).getId());
        rowCount = pstm.executeUpdate();
        return rowCount > 0;
    }

    @Override
    public boolean delete(int id) throws SQLException {
        String sqlDelete = "DELETE FROM Elementos WHERE id = ?;";
        int rowCount = 0;
        PreparedStatement pstm = Conexion.getInstance("Elementos.db").getConnection().prepareStatement(sqlDelete);
        pstm.setInt(1, id);
        rowCount = pstm.executeUpdate();

        return rowCount > 0;
    }

    @Override
    public ArrayList obtenerTodo() throws SQLException {
        String sql = "SELECT * FROM Elementos;";
        ArrayList<Elemento> restultado = new ArrayList<>();
        Statement stn = Conexion.getInstance("Elementos.db").getConnection().createStatement();
        ResultSet rst = stn.executeQuery(sql);
        while (rst.next()){
            restultado.add(new Elemento(rst.getInt(1),rst.getString(2), rst.getString(3),
                    rst.getString(4),rst.getString(5),rst.getString(6)));

        }

        return  restultado;
    }

    @Override
    public Object buscarPorId(String id) throws SQLException {
        String sql = "SELECT * FROM Elementos WHERE id = ? ;";
        Elemento elemento = null;
        PreparedStatement pstm = Conexion.getInstance("Elementos.db").getConnection().prepareStatement(sql);
        pstm.setInt(1, Integer.parseInt(id));
        ResultSet rst = pstm.executeQuery();
        if(rst.next()){
            elemento = new Elemento(rst.getInt(1), rst.getString(2), rst.getString(3),
                    rst.getString(4),rst.getString(5),rst.getString(6));


            return elemento;
        }
            return null;
    }
    public boolean cambiarPorCeldas(String datoActualizado, int id, int colIndex) throws SQLException{
        String sqlUpdate;
        PreparedStatement pstm;
        int rowCount;

        switch (colIndex){
            case 1:
                sqlUpdate= "UPDATE Elementos SET Grupo = ? WHERE Id =" + id + ";";
                rowCount = 0;
                pstm = Conexion.getInstance("Elementos.db").getConnection().prepareStatement(sqlUpdate);
                pstm.setString(1, (datoActualizado));
                rowCount = pstm.executeUpdate();


            case 2:
                sqlUpdate= "UPDATE Elementos SET Nombre = ? WHERE Id =" + id + ";";
                rowCount = 0;
                pstm = Conexion.getInstance("Elementos.db").getConnection().prepareStatement(sqlUpdate);
                pstm.setString(1, (datoActualizado));
                rowCount = pstm.executeUpdate();

                return rowCount > 0;

            case 3:
                sqlUpdate= "UPDATE Elementos SET Bloque = ? WHERE Id =" + id + ";";
                rowCount = 0;
                pstm = Conexion.getInstance("Elementos.db").getConnection().prepareStatement(sqlUpdate);
                pstm.setString(1, (datoActualizado));
                rowCount = pstm.executeUpdate();

                return  rowCount > 0;

            case 4:
                sqlUpdate= "UPDATE Elementos SET Tipo = ? WHERE Id =" + id + ";";
                rowCount = 0;
                pstm = Conexion.getInstance("Elementos.db").getConnection().prepareStatement(sqlUpdate);
                pstm.setString(1, (datoActualizado));
                rowCount = pstm.executeUpdate();

                return  rowCount > 0;

            case 5:
                sqlUpdate= "UPDATE Elementos SET Url = ? WHERE Id =" + id + ";";
                rowCount = 0;
                pstm = Conexion.getInstance("Elementos.db").getConnection().prepareStatement(sqlUpdate);
                pstm.setString(1, (datoActualizado));
                rowCount = pstm.executeUpdate();

                return  rowCount > 0;
        }

        return false;
    }


}