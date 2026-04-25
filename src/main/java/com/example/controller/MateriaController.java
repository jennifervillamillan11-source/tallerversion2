package com.example.controller;

import com.example.model.Materia;
import com.example.service.MateriaService;
import com.example.view.MateriaView;

public class MateriaController {
    private final Materia materia;
    private final MateriaView view;
    private MateriaService service;
    
    public MateriaController(MateriaService service) {
        this.service = service;
        this.materia = null;
        this.view = null;
    }

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

    public void guardar(String nombre, int creditos){
        try{
            service.guardar(new Materia(0,nombre,creditos));
            System.out.println("✔ Materia guardada");
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }

    public void listar(){
        try{
            service.listar().forEach(System.out::println);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
