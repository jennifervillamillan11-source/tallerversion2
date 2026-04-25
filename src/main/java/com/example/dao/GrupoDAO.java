package com.example.dao;

import com.example.model.Grupo;
import java.sql.*;
import java.util.*;

public class GrupoDAO {
    private Connection conn;
    public GrupoDAO(Connection conn){ this.conn = conn; }

    public void insertar(Grupo g) throws SQLException {
        String sql = "INSERT INTO grupo(id_materia, id_docente, aula, horario) VALUES (?,?,?,?)";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setInt(1, g.getIdMateria());
        ps.setInt(2, g.getIdDocente());
        ps.setString(3, g.getAula());
        ps.setString(4, g.getHorario());
        ps.executeUpdate();
    }

    public List<Grupo> listar() throws SQLException {
        List<Grupo> lista = new ArrayList<>();
        ResultSet rs = conn.createStatement().executeQuery("SELECT * FROM grupo");
        while(rs.next()){
            lista.add(new Grupo(
                rs.getInt("id_grupo"),
                rs.getInt("id_materia"),
                rs.getInt("id_docente"),
                rs.getString("aula"),
                rs.getString("horario")
            ));
        }
        return lista;
    }
}
