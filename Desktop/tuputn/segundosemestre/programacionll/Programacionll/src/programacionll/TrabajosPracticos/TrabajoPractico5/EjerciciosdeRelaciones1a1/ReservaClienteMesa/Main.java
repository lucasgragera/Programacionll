/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programacionll.TrabajosPracticos.TrabajoPractico5.EjerciciosdeRelaciones1a1.ReservaClienteMesa;

/**
 *
 * @author lucasgragera
 */
public class Main {
    public static void main(String[] args) {
        // Crear las instancias de Cliente y Mesa primero
        Cliente cliente1 = new Cliente("Pedro Ramirez", "11-9876-5432");
        Mesa mesa1 = new Mesa(5, 4);

        // Crear la Reserva, pasando las instancias de Cliente y Mesa
        Reserva reserva1 = new Reserva("2024-10-20", "20:30", cliente1, mesa1);

        System.out.println("Información de la Reserva:");
        System.out.println("Fecha: " + reserva1.getFecha());
        System.out.println("Hora: " + reserva1.getHora());

        System.out.println("\nInformación del Cliente (desde Reserva):");
        System.out.println("Nombre: " + reserva1.getCliente().getNombre());
        System.out.println("Teléfono: " + reserva1.getCliente().getTelefono());

        System.out.println("\nInformación de la Mesa (desde Reserva):");
        System.out.println("Número de Mesa: " + reserva1.getMesa().getNumero());
        System.out.println("Capacidad: " + reserva1.getMesa().getCapacidad());
    }
}
