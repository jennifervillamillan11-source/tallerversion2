package com.example.controller;

import com.example.model.InscripcionCurso;
import com.example.view.InscripcionCursoView;

public class InscripcionCursoController {
    private final InscripcionCurso inscripcion;
    private final InscripcionCursoView view;

    public InscripcionCursoController(InscripcionCurso inscripcion, InscripcionCursoView view) {
        this.inscripcion = inscripcion;
        this.view = view;
    }

    public void setIdEstudiante(int idEstudiante) {
        inscripcion.setIdEstudiante(idEstudiante);
    }

    public void setIdGrupo(int idGrupo) {
        inscripcion.setIdGrupo(idGrupo);
    }

    public void setNotaFinal(float notaFinal) {
        inscripcion.setNotaFinal(notaFinal);
    }

    public void setEstado(String estado) {
        inscripcion.setEstado(estado);
    }

    public InscripcionCurso getInscripcion() {
        return inscripcion;
    }

    public void mostrar() {
        view.mostrarInscripcion(inscripcion);
    }
}
