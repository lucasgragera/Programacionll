/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programacionll.TrabajosPracticos.TrabajoPractico7.CasoPractico4;

/**
 *
 * @author lucasgragera
 */
public class Animal {
    protected String nombre;
    protected String especie;

    public Animal(String nombre, String especie) {
        this.nombre = nombre;
        this.especie = especie;
    }

    // Método que será sobrescrito por las subclases
    public void hacerSonido() {
        System.out.println("El " + especie + " emite un sonido genérico.");
    }

    public void describirAnimal() {
        System.out.print(nombre + " (" + especie + ")");
    }
}
