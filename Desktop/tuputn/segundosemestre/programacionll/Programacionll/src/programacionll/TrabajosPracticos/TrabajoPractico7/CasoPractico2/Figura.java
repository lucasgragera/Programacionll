/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programacionll.TrabajosPracticos.TrabajoPractico7.CasoPractico2;

/**
 *
 * @author lucasgragera
 */
public abstract class Figura {
    protected String nombre;

    public Figura(String nombre) {
        this.nombre = nombre;
    }

    // Método abstracto: Obliga a todas las subclases a proporcionar su propia implementación.
    public abstract double calcularArea();

    public void mostrarNombre() {
        System.out.print(nombre + ": ");
    }
}
