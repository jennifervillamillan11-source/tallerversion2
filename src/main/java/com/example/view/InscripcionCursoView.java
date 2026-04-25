package com.example.view;

import com.example.model.InscripcionCurso;

public class InscripcionCursoView {
    public void mostrarInscripcion(InscripcionCurso inscripcion) {
        System.out.println("--- Inscripción de Curso ---");
        System.out.println("ID Inscripción: " + inscripcion.getIdInscripcion());
        System.out.println("ID Estudiante: " + inscripcion.getIdEstudiante());
        System.out.println("ID Grupo: " + inscripcion.getIdGrupo());
        System.out.println("Nota Final: " + inscripcion.getNotaFinal());
        System.out.println("Estado: " + inscripcion.getEstado());
    }
}
