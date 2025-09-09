/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programacionll.TrabajosPracticos.TrabajoPractico5.EjerciciosdeRelaciones1a1.ComputadoraPlacaPropietario;

/**
 *
 * @author lucasgragera
 */
public class Main {
    public static void main(String[] args) {
        // Crear el propietario primero
        Propietario propietario1 = new Propietario("Carlos Ruiz", "30123456");

        // Crear la computadora, que internamente crea una PlacaMadre y se asocia al Propietario
        Computadora computadora1 = new Computadora("HP", "HP123456789", "HP-Z420", "Intel C602", propietario1);

        System.out.println("Información de la Computadora:");
        System.out.println("Marca: " + computadora1.getMarca());
        System.out.println("Número de Serie: " + computadora1.getNumeroSerie());
        
        System.out.println("\nInformación de la Placa Madre (desde Computadora):");
        System.out.println("Modelo: " + computadora1.getPlacaMadre().getModelo());
        System.out.println("Chipset: " + computadora1.getPlacaMadre().getChipset());
        
        System.out.println("\nInformación del Propietario (desde Computadora):");
        System.out.println("Nombre: " + computadora1.getPropietario().getNombre());
        
        System.out.println("\nInformación de la Computadora (desde Propietario):");
        System.out.println("Marca de la computadora del propietario: " + propietario1.getComputadora().getMarca());
    }
}
