/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programacionll.TrabajosPracticos.TrabajoPractico6.CasoPractico2;

/**
 *
 * @author lucasgragera
 */
public class Libro {
    private String isbn;
    private String titulo;
    private int anioPublicacion;
    private Autor autor;

    
    public Libro(String isbn, String titulo, int anioPublicacion, Autor autor) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.anioPublicacion = anioPublicacion;
        this.autor = autor;
    }

    public String getIsbn() { return isbn; }
    public String getTitulo() { return titulo; }
    public int getAnioPublicacion() { return anioPublicacion; }
    public Autor getAutor() { return autor; }
    
    public void mostrarInfo() {
        System.out.print("ISBN: " + isbn + " | Título: " + titulo + " | Año: " + anioPublicacion);
        // Llama al método del objeto Autor
        autor.mostrarInfo(); 
    }
    
    @Override
    public String toString() {
        return "Libro{" +
               "isbn='" + isbn + '\'' +
               ", titulo='" + titulo + '\'' +
               ", anio=" + anioPublicacion +
               ", autor=" + autor.getNombre() + 
               '}';
    }
}
