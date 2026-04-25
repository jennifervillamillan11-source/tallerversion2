package com.example;

import com.example.controller.DocenteController;
import com.example.controller.EstudianteController;
import com.example.controller.GrupoController;
import com.example.controller.InscripcionCursoController;
import com.example.controller.MateriaController;
import com.example.model.Docente;
import com.example.model.Estudiante;
import com.example.model.Grupo;
import com.example.model.InscripcionCurso;
import com.example.model.Materia;
import com.example.view.DocenteView;
import com.example.view.EstudianteView;
import com.example.view.GrupoView;
import com.example.view.InscripcionCursoView;
import com.example.view.MateriaView;

public class Main {
    public static void main(String[] args) {
        DatabaseConnection.connect();

        Materia materia = new Materia(1, "Programación", 4);
        Docente docente = new Docente(1, "María Pérez", "Ingeniería de Software");
        Estudiante estudiante = new Estudiante(1, "Juan", "García", "juan.garcia@example.com");
        Grupo grupo = new Grupo(1, materia.getIdMateria(), docente.getIdDocente(), "Aula 101", "Lunes 08:00-10:00");
        InscripcionCurso inscripcion = new InscripcionCurso(1, estudiante.getIdEstudiante(), grupo.getIdGrupo(), 8.5f, "Aprobado");

        MateriaController materiaController = new MateriaController(materia, new MateriaView());
        DocenteController docenteController = new DocenteController(docente, new DocenteView());
        EstudianteController estudianteController = new EstudianteController(estudiante, new EstudianteView());
        GrupoController grupoController = new GrupoController(grupo, new GrupoView());
        InscripcionCursoController inscripcionController = new InscripcionCursoController(inscripcion, new InscripcionCursoView());

        materiaController.mostrar();
        System.out.println();
        docenteController.mostrar();
        System.out.println();
        estudianteController.mostrar();
        System.out.println();
        grupoController.mostrar();
        System.out.println();
        inscripcionController.mostrar();
    }
}