package com.example.dao;

import com.example.model.Materia;
import java.sql.*;
import java.util.*;

public class MateriaDAO {
    private Connection conn;
    public MateriaDAO(Connection conn){ this.conn = conn; }

    public void insertar(Materia m) throws SQLException {
        String sql = "INSERT INTO materia(nombre_materia, creditos) VALUES (?,?)";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setString(1, m.getNombreMateria());
        ps.setInt(2, m.getCreditos());
        ps.executeUpdate();
    }

    public List<Materia> listar() throws SQLException {
        List<Materia> lista = new ArrayList<>();
        ResultSet rs = conn.createStatement().executeQuery("SELECT * FROM materia");
        while(rs.next()){
            lista.add(new Materia(
                rs.getInt("id_materia"),
                rs.getString("nombre_materia"),
                rs.getInt("creditos")
            ));
        }
        return lista;
    }
}
