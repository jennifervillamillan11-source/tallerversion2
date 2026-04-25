package com.example.view;

import com.example.model.Docente;

public class DocenteView {
    public void mostrarDocente(Docente docente) {
        System.out.println("--- Docente ---");
        System.out.println("ID: " + docente.getIdDocente());
        System.out.println("Nombre: " + docente.getNombre());
        System.out.println("Especialidad: " + docente.getEspecialidad());
    }
}
