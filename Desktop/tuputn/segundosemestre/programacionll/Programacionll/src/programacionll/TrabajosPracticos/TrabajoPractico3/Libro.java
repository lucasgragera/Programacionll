/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programacionll.TrabajosPracticos.TrabajoPractico3;

/**
 *
 * @author lucasgragera
 */
public class Libro {
    private String titulo;
    private String autor;
    private int añoPublicacion = 1995;
    
    public void mostrarInfo(){
        System.out.println(titulo+" "+autor+" "+añoPublicacion);
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getAñoPublicacion() {
        return añoPublicacion;
    }

    public void setAñoPublicacion(int añoPublicacion) {
        if (añoPublicacion > 0)
        this.añoPublicacion = añoPublicacion;
    }
    
    
}
