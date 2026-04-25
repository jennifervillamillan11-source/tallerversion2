package com.example.view;

import com.example.model.Grupo;

public class GrupoView {
    public void mostrarGrupo(Grupo grupo) {
        System.out.println("--- Grupo ---");
        System.out.println("ID Grupo: " + grupo.getIdGrupo());
        System.out.println("ID Materia: " + grupo.getIdMateria());
        System.out.println("ID Docente: " + grupo.getIdDocente());
        System.out.println("Aula: " + grupo.getAula());
        System.out.println("Horario: " + grupo.getHorario());
    }
}
