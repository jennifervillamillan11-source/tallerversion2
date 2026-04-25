package com.example.service;

import com.example.dao.InscripcionCursoDAO;
import com.example.model.InscripcionCurso;
import java.util.*;

public class InscripcionCursoService {
    private InscripcionCursoDAO dao;
    public InscripcionCursoService(InscripcionCursoDAO dao){ this.dao = dao; }

    public void guardar(InscripcionCurso i) throws Exception {
        if(i.getEstado().isEmpty()) throw new Exception("Estado obligatorio");
        dao.insertar(i);
    }

    public List<InscripcionCurso> listar() throws Exception {
        return dao.listar();
    }
}
