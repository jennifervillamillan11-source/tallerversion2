package com.example.service;

import com.example.dao.EstudianteDAO;
import com.example.model.Estudiante;
import java.util.*;

public class EstudianteService {
    private EstudianteDAO dao;
    public EstudianteService(EstudianteDAO dao){ this.dao = dao; }

    public void guardar(Estudiante e) throws Exception {
        if(e.getEmail().isEmpty()) throw new Exception("Email obligatorio");
        dao.insertar(e);
    }

    public List<Estudiante> listar() throws Exception {
        return dao.listar();
    }
}