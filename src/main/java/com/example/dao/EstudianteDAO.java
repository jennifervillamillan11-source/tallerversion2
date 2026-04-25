package com.example.dao;

import com.example.model.Estudiante;
import java.sql.*;
import java.util.*;

public class EstudianteDAO {
    private Connection conn;
    public EstudianteDAO(Connection conn){ this.conn = conn; }

    public void insertar(Estudiante e) throws SQLException {
        String sql = "INSERT INTO estudiante(nombre, apellido, email) VALUES (?,?,?)";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1, e.getNombre());
        ps.setString(2, e.getApellido());
        ps.setString(3, e.getEmail());
        ps.executeUpdate();
    }

    public List<Estudiante> listar() throws SQLException {
        List<Estudiante> lista = new ArrayList<>();
        ResultSet rs = conn.createStatement().executeQuery("SELECT * FROM estudiante");
        while(rs.next()){
            lista.add(new Estudiante(
                rs.getInt("id_estudiante"),
                rs.getString("nombre"),
                rs.getString("apellido"),
                rs.getString("email")
            ));
        }
        return lista;
    }
}
