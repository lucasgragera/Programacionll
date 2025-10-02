/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programacionll.TrabajosPracticos.TrabajoPractico6.CasoPractico3;

/**
 *
 * @author lucasgragera
 */
public class Curso {
    private String codigo;
    private String nombre;
    private Profesor profesor; 

    public Curso(String codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.profesor = null;
    }
    
    public String getCodigo() { return codigo; }
    public String getNombre() { return nombre; }
    public Profesor getProfesor() { return profesor; }
    
    public void setProfesor(Profesor nuevoProfesor) {
        // Si el profesor es el mismo, no hacemos nada.
    if (this.profesor == nuevoProfesor) {
        return;
    }

    // 1. Quitar la relación del lado del profesor PREVIO
    if (this.profesor != null) {
        // Se quita el curso directamente de la lista del profesor anterior
        this.profesor.getCursos().remove(this);
        System.out.println("    [Sync] Curso " + codigo + " desasignado de la lista de " + this.profesor.getNombre());
    }

    // 2. Establecer el nuevo profesor en el lado del Curso
    this.profesor = nuevoProfesor;

    // 3. Establecer la relación del lado del profesor NUEVO (si no es null)
    if (nuevoProfesor != null) {
        // Se agrega el curso directamente a la lista del nuevo profesor
        // Usamos contains para evitar duplicados si el curso ya estuviera en la lista
        if (!nuevoProfesor.getCursos().contains(this)) {
            nuevoProfesor.getCursos().add(this);
            System.out.println("    [Sync] Curso " + codigo + " agregado a la lista de " + nuevoProfesor.getNombre());
        }
    }
    }
        
        public void mostrarInfo() {
        String nombreProfesor = (profesor != null) ? profesor.getNombre() : "Sin asignar";
        System.out.println("Código: " + codigo + " | Nombre: " + nombre + 
                           " | Profesor: " + nombreProfesor);
    }
}
