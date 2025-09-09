/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programacionll.TrabajosPracticos.TrabajoPractico5.EjerciciosdeRelaciones1a1.PasaporteFotoTitular;

/**
 *
 * @author lucasgragera
 */
public class Main {
    public static void main(String[] args) {
        // Crear el titular primero
        Titular titular1 = new Titular("Juan Perez", "12345678");
                

        // Crear el pasaporte, que internamente crea una Foto y se asocia al Titular
        Pasaporte pasaporte1 = new Pasaporte("P12345678", "09-09-2025", "foto-jp.jpg", "JPEG", titular1);

        System.out.println("Información del Pasaporte:");
        System.out.println("Número: " + pasaporte1.getNumero());
        System.out.println("Fecha de emisión: " + pasaporte1.getFechaEmision());
        System.out.println("Información de la Foto:");
        System.out.println("Archivo: " + pasaporte1.getFoto().getImagen());
        
        System.out.println("\nInformación del Titular (desde Pasaporte):");
        System.out.println("Nombre: " + pasaporte1.getTitular().getNombre());
        System.out.println("DNI: " + pasaporte1.getTitular().getDni());
        
        System.out.println("\nInformación del Pasaporte (desde Titular):");
        System.out.println("Número del pasaporte del titular: " + titular1.getPasaporte().getNumero());
    }
}
