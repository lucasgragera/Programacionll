/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programacionll.TrabajosPracticos.TrabajoPractico5.EjerciciosdeRelaciones1a1.LibroAutorEditorial;

/**
 *
 * @author lucasgragera
 */
public class Main {
    public static void main(String[] args) {
        // Crear las instancias de Autor y Editorial primero
        Autor autor1 = new Autor("Gabriel Garcia Marquez", "Colombiana");
        Editorial editorial1 = new Editorial("Editorial Sudamericana", "Calle Falsa 123");

        // Crear el Libro, pasando las instancias de Autor y Editorial
        Libro libro1 = new Libro("Cien años de soledad", "978-0307455298", autor1, editorial1);

        System.out.println("Información del Libro:");
        System.out.println("Título: " + libro1.getTitulo());
        System.out.println("ISBN: " + libro1.getIsbn());

        System.out.println("\nInformación del Autor:");
        System.out.println("Nombre: " + libro1.getAutor().getNombre());
        System.out.println("Nacionalidad: " + libro1.getAutor().getNacionalidad());

        System.out.println("\nInformación de la Editorial:");
        System.out.println("Nombre: " + libro1.getEditorial().getNombre());
        System.out.println("Dirección: " + libro1.getEditorial().getDireccion());
    }
}
