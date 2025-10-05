/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programacionll.TrabajosPracticos.TrabajoPractico7.CasoPractico3;

/**
 *
 * @author lucasgragera
 */
public abstract class Empleado {
    protected String nombre;
    protected int id;

    public Empleado(String nombre, int id) {
        this.nombre = nombre;
        this.id = id;
    }

    // Método abstracto: Cada subclase debe implementarlo según su tipo de contrato.
    public abstract double calcularSueldo();

    // Método base para la información
    public void mostrarInfo() {
        System.out.print("ID: " + id + ", Nombre: " + nombre);
    }
}
