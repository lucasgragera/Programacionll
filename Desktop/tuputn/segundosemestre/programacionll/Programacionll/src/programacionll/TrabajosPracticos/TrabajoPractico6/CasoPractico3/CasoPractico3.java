/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programacionll.TrabajosPracticos.TrabajoPractico6.CasoPractico3;

/**
 *
 * @author lucasgragera
 */
public class CasoPractico3 {
    public static void main(String[] args) {
        
        Universidad miUniversidad = new Universidad("Universidad Nacional Central");
        
        System.out.println("--- INICIO DE TAREAS: GESTIÓN DE UNIVERSIDAD ---");

        // 1. Crear al menos 3 profesores y 5 cursos.
        Profesor p1 = new Profesor("P001", "Dra. Alicia Castro", "Física Cuántica");
        Profesor p2 = new Profesor("P002", "Ing. Roberto Sanz", "Desarrollo de Software");
        Profesor p3 = new Profesor("P003", "Lic. Elena Gómez", "Historia Antigua");
        
        Curso c1 = new Curso("FIS101", "Introducción a la Física");
        Curso c2 = new Curso("FIS450", "Mecánica Cuántica Avanzada");
        Curso c3 = new Curso("CS201", "Estructura de Datos");
        Curso c4 = new Curso("CS305", "Bases de Datos SQL");
        Curso c5 = new Curso("HIS100", "Civilizaciones Clásicas");
        
        // 2. Agregar profesores y cursos a la universidad.
        System.out.println("\n[TAREA 2] Agregando Profesores y Cursos:");
        miUniversidad.agregarProfesor(p1);
        miUniversidad.agregarProfesor(p2);
        miUniversidad.agregarProfesor(p3);
        miUniversidad.agregarCurso(c1);
        miUniversidad.agregarCurso(c2);
        miUniversidad.agregarCurso(c3);
        miUniversidad.agregarCurso(c4);
        miUniversidad.agregarCurso(c5);
        
        // 3. Asignar profesores a cursos usando asignarProfesorACurso(...).
        System.out.println("\n[TAREA 3] Asignación inicial de profesores a cursos (Sincronización)");
        miUniversidad.asignarProfesorACurso("FIS101", "P001"); // p1
        miUniversidad.asignarProfesorACurso("FIS450", "P001"); // p1
        miUniversidad.asignarProfesorACurso("CS201", "P002"); // p2
        miUniversidad.asignarProfesorACurso("HIS100", "P003"); // p3
        
        // 4. Listar cursos con su profesor y profesores con sus cursos.
        miUniversidad.listarCursos();
        System.out.println("\n[TAREA 4] Profesores con sus listas de cursos (Verificación bidireccional):");
        p1.mostrarInfo(); p1.listarCursos();
        p2.mostrarInfo(); p2.listarCursos();
        p3.mostrarInfo(); p3.listarCursos();
        
        // 5. Cambiar el profesor de un curso y verificar que ambos lados quedan sincronizados.
        System.out.println("\n[TAREA 5] Cambio de profesor para FIS101 (p1 -> p2). Se verifica desasignación/re-asignación:");
        miUniversidad.asignarProfesorACurso("FIS101", "P002"); // Cambia de p1 a p2
        
        System.out.println("\n Verificación post-cambio (FIS101) ");
        miUniversidad.buscarCursoPorCodigo("FIS101").mostrarInfo();
        System.out.println("\nLista de P1 (Debe perder FIS101):");
        p1.mostrarInfo(); p1.listarCursos();
        System.out.println("\nLista de P2 (Debe ganar FIS101):");
        p2.mostrarInfo(); p2.listarCursos();

        // 6. Remover un curso y confirmar que ya no aparece en la lista del profesor.
        System.out.println("\n[TAREA 6] Eliminando curso CS305 (Sin profesor asignado) y FIS450 (Asignado a P001):");
        miUniversidad.eliminarCurso("CS305");
        miUniversidad.eliminarCurso("FIS450");
        
        System.out.println("\n Verificación post-eliminación (FIS450) ");
        // P1 dictaba FIS450. Ahora solo debe dictar un curso (Mecánica Cuántica Avanzada fue eliminado)
        p1.mostrarInfo(); p1.listarCursos();
        miUniversidad.listarCursos();

        // 7. Remover un profesor y dejar profesor = null en los cursos que dictaba.
        System.out.println("\n[TAREA 7] Eliminando Profesor P002 (Dicta FIS101 y CS201):");
        miUniversidad.eliminarProfesor("P002");
        
        System.out.println("\n Verificación post-eliminación de P002 ");
        miUniversidad.listarProfesores(); // P002 ya no debe estar
        miUniversidad.listarCursos(); // FIS101 y CS201 deben aparecer como 'Sin asignar'

        // 8. Mostrar un reporte: cantidad de cursos por profesor.
        miUniversidad.mostrarReporteCursosPorProfesor();
        
        System.out.println("\n FIN DE TAREAS ");
    }
}
