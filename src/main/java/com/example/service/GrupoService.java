package com.example.service;

import com.example.dao.GrupoDAO;
import com.example.model.Grupo;
import java.util.*;

public class GrupoService {
    private GrupoDAO dao;
    public GrupoService(GrupoDAO dao){ this.dao = dao; }

    public void guardar(Grupo g) throws Exception {
        if(g.getAula().isEmpty()) throw new Exception("Aula obligatoria");
        dao.insertar(g);
    }

    public List<Grupo> listar() throws Exception {
        return dao.listar();
    }
}