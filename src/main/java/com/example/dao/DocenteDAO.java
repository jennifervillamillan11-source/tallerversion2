package com.example.dao;

import com.example.model.Docente;
import java.sql.*;
import java.util.*;

public class DocenteDAO {
    private Connection conn;
    public DocenteDAO(Connection conn){ this.conn = conn; }

    public void insertar(Docente d) throws SQLException {
        String sql = "INSERT INTO docente(nombre, especialidad) VALUES (?,?)";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1, d.getNombre());
        ps.setString(2, d.getEspecialidad());
        ps.executeUpdate();
    }

    public List<Docente> listar() throws SQLException {
        List<Docente> lista = new ArrayList<>();
        ResultSet rs = conn.createStatement().executeQuery("SELECT * FROM docente");
        while(rs.next()){
            lista.add(new Docente(
                rs.getInt("id_docente"),
                rs.getString("nombre"),
                rs.getString("especialidad")
            ));
        }
        return lista;
    }
}
