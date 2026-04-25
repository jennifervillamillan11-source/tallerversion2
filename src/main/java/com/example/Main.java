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
    import com.example.util.Conexion;
    import com.example.dao.*;
    import com.example.service.*;
    import com.example.controller.*;

    import java.sql.Connection;
    import java.util.Scanner;

    public class Main {
        public static void main(String[] args) {
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

        try {
            Connection conn = Conexion.getConexion();

            // DAO
            MateriaDAO materiaDAO = new MateriaDAO(conn);
            DocenteDAO docenteDAO = new DocenteDAO(conn);
            EstudianteDAO estudianteDAO = new EstudianteDAO(conn);

            // SERVICE
            MateriaService materiaService = new MateriaService(materiaDAO);
            DocenteService docenteService = new DocenteService(docenteDAO);
            EstudianteService estudianteService = new EstudianteService(estudianteDAO);

            // CONTROLLER
            MateriaController materiaController = new MateriaController(materiaService);

            Scanner sc = new Scanner(System.in);
            int op;

            do {
                System.out.println("\n=== MENU ===");
                System.out.println("1. Crear Materia");
                System.out.println("2. Listar Materias");
                System.out.println("0. Salir");
                op = sc.nextInt(); sc.nextLine();

                switch(op){
                    case 1:
                        System.out.print("Nombre: ");
                        String nombre = sc.nextLine();
                        System.out.print("Créditos: ");
                        int cred = sc.nextInt();
                        materiaController.guardar(nombre, cred);
                        break;

                    case 2:
                        materiaController.listar();
                        break;
                }

            } while(op != 0);

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
    }