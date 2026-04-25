package com.example.controller;

import com.example.model.Grupo;
import com.example.view.GrupoView;

public class GrupoController {
    private final Grupo grupo;
    private final GrupoView view;

    public GrupoController(Grupo grupo, GrupoView view) {
        this.grupo = grupo;
        this.view = view;
    }

    public void setIdMateria(int idMateria) {
        grupo.setIdMateria(idMateria);
    }

    public void setIdDocente(int idDocente) {
        grupo.setIdDocente(idDocente);
    }

    public void setAula(String aula) {
        grupo.setAula(aula);
    }

    public void setHorario(String horario) {
        grupo.setHorario(horario);
    }

    public Grupo getGrupo() {
        return grupo;
    }

    public void mostrar() {
        view.mostrarGrupo(grupo);
    }
}
