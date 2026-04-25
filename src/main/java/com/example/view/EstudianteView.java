package com.example.view;

import com.example.model.Estudiante;

public class EstudianteView {
    public void mostrarEstudiante(Estudiante estudiante) {
        System.out.println("--- Estudiante ---");
        System.out.println("ID: " + estudiante.getIdEstudiante());
        System.out.println("Nombre: " + estudiante.getNombre());
        System.out.println("Apellido: " + estudiante.getApellido());
        System.out.println("Email: " + estudiante.getEmail());
    }
}
