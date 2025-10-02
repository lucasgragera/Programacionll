/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programacionll.TrabajosPracticos.TrabajoPractico6.CasoPractico3;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author lucasgragera
 */
public class Universidad {
    private String nombre;
    private List<Profesor> profesores;
    private List<Curso> cursos;

    // Constructor
    public Universidad(String nombre) {
        this.nombre = nombre;
        this.profesores = new ArrayList<>();
        this.cursos = new ArrayList<>();
    }
    
    public void agregarProfesor(Profesor p) {
        if (buscarProfesorPorId(p.getId()) == null) {
            this.profesores.add(p);
            System.out.println("Profesor agregado: " + p.getNombre());
        } else {
            System.out.println("ERROR: Profesor con ID " + p.getId() + " ya existe.");
        }
    }
    
    public void agregarCurso(Curso c) {
        if (buscarCursoPorCodigo(c.getCodigo()) == null) {
            this.cursos.add(c);
            System.out.println("Curso agregado: " + c.getNombre());
        } else {
            System.out.println("ERROR: Curso con código " + c.getCodigo() + " ya existe.");
        }
    }
    
    public void asignarProfesorACurso(String codigoCurso, String idProfesor) {
        Curso curso = buscarCursoPorCodigo(codigoCurso);
        Profesor profesor = buscarProfesorPorId(idProfesor);

        if (curso == null) {
            System.out.println("ERROR: Curso con código " + codigoCurso + " no encontrado.");
            return;
        }
        if (profesor == null) {
            System.out.println("ERROR: Profesor con ID " + idProfesor + " no encontrado.");
            return;
        }

        System.out.println("\n➡️ Asignando " + profesor.getNombre() + " a curso " + curso.getCodigo() + "...");
        curso.setProfesor(profesor); // Uso del método seguro
        System.out.println("   Asignación completada.");
    }
    
    public Profesor buscarProfesorPorId(String id) {
        for (Profesor p : profesores) {
            if (p.getId().equals(id)) return p;
        }
        return null;
    }

    public Curso buscarCursoPorCodigo(String codigo) {
        for (Curso c : cursos) {
            if (c.getCodigo().equals(codigo)) return c;
        }
        return null;
    }

    public void listarProfesores() {
        System.out.println("\n LISTADO DE PROFESORES ");
        profesores.forEach(Profesor::mostrarInfo);
    }

    public void listarCursos() {
        System.out.println("\n LISTADO DE CURSOS ");
        cursos.forEach(Curso::mostrarInfo);
    }

    public boolean eliminarCurso(String codigo) {
        Curso curso = buscarCursoPorCodigo(codigo);
        if (curso != null) {
            // 1. Romper la relación bidireccional primero
            if (curso.getProfesor() != null) {
                // Notificar al profesor para que remueva el curso de su lista.
                curso.getProfesor().getCursos().remove(curso); 
                // No es necesario llamar a curso.setProfesor(null) si el curso se va a eliminar
            }
            // 2. Eliminar el curso de la lista de la Universidad
            this.cursos.remove(curso);
            return true;
        }
        return false;
    }
    
    public boolean eliminarProfesor(String id) {
        Profesor profesor = buscarProfesorPorId(id);
        if (profesor != null) {
            // 1. Romper la relación bidireccional en todos sus cursos
            List<Curso> cursosDictados = new ArrayList<>(profesor.getCursos()); // Copia para evitar ConcurrentModification
            for (Curso curso : cursosDictados) {
                curso.setProfesor(null); // Esto sincroniza, quita el curso de la lista del profesor (ya que se usa la copia) y pone null en el curso.
            }
            // 2. Eliminar el profesor de la lista de la Universidad
            this.profesores.remove(profesor);
            return true;
        }
        return false;
    }
    
    public void mostrarReporteCursosPorProfesor() {
        System.out.println("\n REPORTE: Cantidad de Cursos por Profesor ");
        for (Profesor p : profesores) {
            System.out.println("• " + p.getNombre() + ": " + p.getCursos().size() + " cursos.");
        }
    }
}
