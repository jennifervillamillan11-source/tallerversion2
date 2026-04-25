package com.example.dao;

import com.example.model.InscripcionCurso;
import java.sql.*;
import java.util.*;

public class InscripcionCursoDAO {
    private Connection conn;
    public InscripcionCursoDAO(Connection conn){ this.conn = conn; }

    public void insertar(InscripcionCurso i) throws SQLException {
        String sql = "INSERT INTO inscripcion_curso(id_estudiante, id_grupo, nota_final, estado) VALUES (?,?,?,?)";
        PreparedStatement ps = conn.prepareStatement(sql);
        ps.setInt(1, i.getIdEstudiante());
        ps.setInt(2, i.getIdGrupo());
        ps.setFloat(3, i.getNotaFinal());
        ps.setString(4, i.getEstado());
        ps.executeUpdate();
    }

    public List<InscripcionCurso> listar() throws SQLException {
        List<InscripcionCurso> lista = new ArrayList<>();
        ResultSet rs = conn.createStatement().executeQuery("SELECT * FROM inscripcion_curso");
        while(rs.next()){
            lista.add(new InscripcionCurso(
                rs.getInt("id_inscripcion"),
                rs.getInt("id_estudiante"),
                rs.getInt("id_grupo"),
                rs.getFloat("nota_final"),
                rs.getString("estado")
            ));
        }
        return lista;
    }
}