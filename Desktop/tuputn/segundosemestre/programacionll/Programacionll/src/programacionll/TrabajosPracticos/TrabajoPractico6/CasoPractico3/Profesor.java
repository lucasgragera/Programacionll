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
public class Profesor {
    private String id;
    private String nombre;
    private String especialidad;
    private List<Curso> cursos; 

    public Profesor(String id, String nombre, String especialidad) {
        this.id = id;
        this.nombre = nombre;
        this.especialidad = especialidad;
        this.cursos = new ArrayList<>();
    }

    public String getId() { return id; }
    public String getNombre() { return nombre; }
    public String getEspecialidad() { return especialidad; }
    public List<Curso> getCursos() { return cursos; }

    public void agregarCurso(Curso c) {
        if (!this.cursos.contains(c)) {
            this.cursos.add(c);
            
            // Sincronización: Notifica al curso para que asigne ESTE profesor
            if (c.getProfesor() != this) {
                c.setProfesor(this);
            }
        }
    }
    public void eliminarCurso(Curso c) {
        if (this.cursos.remove(c)) {
            // Sincronización: Notifica al curso para que remueva al profesor (establecer en null)
            if (c.getProfesor() == this) {
                c.setProfesor(null); // Esto rompe la asociación del lado del curso
            }
        }
    }
    
    public void listarCursos() {
        if (cursos.isEmpty()) {
            System.out.println("  -> No dicta cursos actualmente.");
            return;
        }
        System.out.println("  -> Cursos dictados:");
        for (Curso c : cursos) {
            System.out.println("     • [" + c.getCodigo() + "] " + c.getNombre());
        }
    }
    
    public void mostrarInfo() {
        System.out.println("ID: " + id + " | Nombre: " + nombre + 
                           " | Especialidad: " + especialidad + 
                           " | Cursos: " + cursos.size());
    }
}
