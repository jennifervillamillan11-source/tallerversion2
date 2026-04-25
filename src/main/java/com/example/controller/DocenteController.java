package com.example.controller;

import com.example.model.Docente;
import com.example.view.DocenteView;

public class DocenteController {
    private final Docente docente;
    private final DocenteView view;

    public DocenteController(Docente docente, DocenteView view) {
        this.docente = docente;
        this.view = view;
    }

    public void setNombre(String nombre) {
        docente.setNombre(nombre);
    }

    public void setEspecialidad(String especialidad) {
        docente.setEspecialidad(especialidad);
    }

    public Docente getDocente() {
        return docente;
    }

    public void mostrar() {
        view.mostrarDocente(docente);
    }
}
