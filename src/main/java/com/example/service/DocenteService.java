package com.example.service;

import com.example.dao.DocenteDAO;
import com.example.model.Docente;
import java.util.*;

public class DocenteService {
    private DocenteDAO dao;
    public DocenteService(DocenteDAO dao){ this.dao = dao; }

    public void guardar(Docente d) throws Exception {
        if(d.getNombre().isEmpty()) throw new Exception("Nombre obligatorio");
        dao.insertar(d);
    }

    public List<Docente> listar() throws Exception {
        return dao.listar();
    }
}