/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programacionll.TrabajosPracticos.TrabajoPractico6.CasoPractico2;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author lucasgragera
 */
public class Biblioteca {
    private String nombre;
    private List<Libro> libros; // Colección de libros

    // Constructor
    public Biblioteca(String nombre) {
        this.nombre = nombre;
        // Inicialización de la colección (Composición)
        this.libros = new ArrayList<>(); 
    }
    
    // Getter
    public String getNombre() { return nombre; }
    
    public void agregarLibro(String isbn, String titulo, int anioPublicacion, Autor autor) {
        if (buscarLibroPorIsbn(isbn) == null) {
            Libro nuevoLibro = new Libro(isbn, titulo, anioPublicacion, autor);
            this.libros.add(nuevoLibro);
            System.out.println("Libro agregado: " + titulo);
        } else {
            System.out.println("ERROR: El ISBN " + isbn + " ya existe en la biblioteca.");
        }
    }
    
    public void listarLibros() {
        if (libros.isEmpty()) {
            System.out.println("La biblioteca está vacía.");
            return;
        }
        System.out.println("\n LISTADO DE LIBROS DE LA BIBLIOTECA " + nombre);
        for (Libro libro : libros) {
            libro.mostrarInfo();
        }
    }
    
    public Libro buscarLibroPorIsbn(String isbn) {
        for (Libro libro : libros) {
            if (libro.getIsbn().equals(isbn)) {
                return libro;
            }
        }
        return null;
    }
    
    public boolean eliminarLibro(String isbn) {
        Libro libroAEliminar = buscarLibroPorIsbn(isbn);
        if (libroAEliminar != null) {
            this.libros.remove(libroAEliminar);
            return true;
        }
        return false;
    }
    
    public int obtenerCantidadLibros() {
        return this.libros.size();
    }
    
    public List<Libro> filtrarLibrosPorAnio(int anio) {
        List<Libro> filtrados = new ArrayList<>();
        System.out.println("\n LIBROS PUBLICADOS EN EL AÑO " + anio);
        for (Libro libro : libros) {
            if (libro.getAnioPublicacion() == anio) {
                filtrados.add(libro);
                System.out.println(libro); 
            }
        }
        if (filtrados.isEmpty()) {
            System.out.println("No se encontraron libros publicados en " + anio + ".");
        }
        return filtrados;
    }
    
    public void mostrarAutoresDisponibles() {
        // Usamos una lista temporal para guardar los IDs y evitar duplicados
        List<String> idsAutoresVistos = new ArrayList<>();
        
        System.out.println("\n AUTORES DE LIBROS DISPONIBLES ");
        for (Libro libro : libros) {
            Autor autor = libro.getAutor();
            if (!idsAutoresVistos.contains(autor.getId())) {
                System.out.print("✍️ ");
                autor.mostrarInfo(); 
                idsAutoresVistos.add(autor.getId());
            }
        }
        if (idsAutoresVistos.isEmpty()) {
            System.out.println("No hay autores disponibles.");
        }
    }
}
