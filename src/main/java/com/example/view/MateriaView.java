package com.example.view;

import com.example.model.Materia;

public class MateriaView {
    public void mostrarMateria(Materia materia) {
        System.out.println("--- Materia ---");
        System.out.println("ID: " + materia.getIdMateria());
        System.out.println("Nombre: " + materia.getNombreMateria());
        System.out.println("Créditos: " + materia.getCreditos());
    }
}
