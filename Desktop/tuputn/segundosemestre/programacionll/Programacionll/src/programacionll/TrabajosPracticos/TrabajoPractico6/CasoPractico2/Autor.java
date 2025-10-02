/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programacionll.TrabajosPracticos.TrabajoPractico6.CasoPractico2;

/**
 *
 * @author lucasgragera
 */
public class Autor {
    private String id;
    private String nombre;
    private String nacionalidad;

   
    public Autor(String id, String nombre, String nacionalidad) {
        this.id = id;
        this.nombre = nombre;
        this.nacionalidad = nacionalidad;
    }

    // Getters
    public String getId() { return id; }
    public String getNombre() { return nombre; }
    public String getNacionalidad() { return nacionalidad; }

   
    public void mostrarInfo() {
        System.out.println(" |-> Autor ID: " + id + ", Nombre: " + nombre + ", Nacionalidad: " + nacionalidad);
    }
}
