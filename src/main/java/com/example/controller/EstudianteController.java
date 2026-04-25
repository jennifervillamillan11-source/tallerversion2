package com.example.controller;

import com.example.model.Estudiante;
import com.example.view.EstudianteView;

public class EstudianteController {
    private final Estudiante estudiante;
    private final EstudianteView view;

    public EstudianteController(Estudiante estudiante, EstudianteView view) {
        this.estudiante = estudiante;
        this.view = view;
    }

    public void setNombre(String nombre) {
        estudiante.setNombre(nombre);
    }

    public void setApellido(String apellido) {
        estudiante.setApellido(apellido);
    }

    public void setEmail(String email) {
        estudiante.setEmail(email);
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public void mostrar() {
        view.mostrarEstudiante(estudiante);
    }
}
