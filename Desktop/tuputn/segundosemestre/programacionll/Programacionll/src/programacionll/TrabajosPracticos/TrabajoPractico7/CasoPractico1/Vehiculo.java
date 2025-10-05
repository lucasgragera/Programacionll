/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programacionll.TrabajosPracticos.TrabajoPractico7.CasoPractico1;

/**
 *
 * @author lucasgragera
 */
public class Vehiculo {
    private String marca;
    private String modelo;

    // Constructor de la clase base
    public Vehiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    // Método que será sobrescrito (demostración de polimorfismo)
    public void mostrarInfo() {
        System.out.println("Información del Vehículo");
        System.out.println("Marca: " + marca);
        System.out.println("Modelo: " + modelo);
    }
}
