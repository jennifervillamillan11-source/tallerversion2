package com.example.service;

import com.example.dao.MateriaDAO;
import com.example.model.Materia;
import java.util.*;

public class MateriaService {
    private MateriaDAO dao;
    public MateriaService(MateriaDAO dao){ this.dao = dao; }

    public void guardar(Materia m) throws Exception {
        if(m.getNombreMateria()==null || m.getNombreMateria().isEmpty())
            throw new Exception("Nombre obligatorio");
        dao.insertar(m);
    }

    public List<Materia> listar() throws Exception {
        return dao.listar();
    }
}