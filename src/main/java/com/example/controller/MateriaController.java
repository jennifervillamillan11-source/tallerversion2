package com.example.controller;

import com.example.model.Materia;
import com.example.view.MateriaView;

public class MateriaController {
    private final Materia materia;
    private final MateriaView view;

    public MateriaController(Materia materia, MateriaView view) {
        this.materia = materia;
        this.view = view;
    }

    public void setNombreMateria(String nombreMateria) {
        materia.setNombreMateria(nombreMateria);
    }

    public void setCreditos(int creditos) {
        materia.setCreditos(creditos);
    }

    public Materia getMateria() {
        return materia;
    }

    public void mostrar() {
        view.mostrarMateria(materia);
    }
}
