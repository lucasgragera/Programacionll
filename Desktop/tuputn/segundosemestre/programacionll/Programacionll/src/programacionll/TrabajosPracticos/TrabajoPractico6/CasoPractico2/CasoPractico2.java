/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programacionll.TrabajosPracticos.TrabajoPractico6.CasoPractico2;

/**
 *
 * @author lucasgragera
 */
public class CasoPractico2 {
    public static void main(String[] args) {
        
        // --- TAREA 1: Creamos una biblioteca. ---
        Biblioteca bibliotecaCentral = new Biblioteca("Biblioteca Central UNAM");
        System.out.println("[TAREA 1] Biblioteca creada: " + bibliotecaCentral.getNombre());

        // --- TAREA 2: Crear al menos tres autores ---
        System.out.println("\n[TAREA 2] Creación de autores:");
        Autor a1 = new Autor("AU001", "Gabriel García Márquez", "Colombiana");
        Autor a2 = new Autor("AU002", "Jane Austen", "Británica");
        Autor a3 = new Autor("AU003", "Jorge Luis Borges", "Argentina");
        
        a1.mostrarInfo();
        a2.mostrarInfo();
        a3.mostrarInfo();

        // --- TAREA 3: Agregar 5 libros asociados a alguno de los Autores a la biblioteca. ---
        System.out.println("\n[TAREA 3] Agregando 5 libros:");
        bibliotecaCentral.agregarLibro("978-6074158752", "Cien años de soledad", 1967, a1);
        bibliotecaCentral.agregarLibro("978-9871786520", "Ficciones", 1944, a3);
        bibliotecaCentral.agregarLibro("978-8420485664", "Orgullo y prejuicio", 1813, a2);
        bibliotecaCentral.agregarLibro("978-6074158753", "El amor en los tiempos del cólera", 1985, a1); // Mismo autor (a1)
        bibliotecaCentral.agregarLibro("978-9871786521", "El Aleph", 1944, a3); // Mismo autor (a3), Mismo año

        // --- TAREA 4: Listar todos los libros con su información y la del autor. ---
        bibliotecaCentral.listarLibros();
        
        // --- TAREA 5: Buscar un libro por su ISBN y mostrar su información. ---
        String isbnBusqueda = "978-9871786520";
        System.out.println("\n[TAREA 5] Búsqueda de libro por ISBN (" + isbnBusqueda + "):");
        Libro libroBuscado = bibliotecaCentral.buscarLibroPorIsbn(isbnBusqueda);
        if (libroBuscado != null) {
            System.out.print("Encontrado: ");
            libroBuscado.mostrarInfo();
        } else {
            System.out.println("Libro con ISBN " + isbnBusqueda + " no encontrado.");
        }

        // --- TAREA 6: Filtrar y mostrar los libros publicados en un año específico. ---
        bibliotecaCentral.filtrarLibrosPorAnio(1944);
        
        // --- TAREA 7: Eliminar un libro por su ISBN y listar los libros restantes. ---
        String isbnEliminar = "978-8420485664"; // Orgullo y prejuicio
        System.out.println("\n[TAREA 7] Eliminación de libro (" + isbnEliminar + ") y listado restante:");
        if (bibliotecaCentral.eliminarLibro(isbnEliminar)) {
            System.out.println("Libro con ISBN " + isbnEliminar + " eliminado con éxito.");
        } else {
            System.out.println("ERROR: No se pudo eliminar el libro (ISBN no encontrado).");
        }
        bibliotecaCentral.listarLibros();

        // --- TAREA 8: Mostrar la cantidad total de libros en la biblioteca. ---
        System.out.println("\n[TAREA 8] Cantidad total de libros en la biblioteca: " 
                            + bibliotecaCentral.obtenerCantidadLibros() + " libros.");

        // --- TAREA 9: Listar todos los autores de los libros disponibles en la biblioteca. ---
        bibliotecaCentral.mostrarAutoresDisponibles();
        
        System.out.println("\n FIN DE TAREAS ");
    }
}
