/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programacionll.TrabajosPracticos.TrabajoPractico5.EjerciciosdeRelaciones1a1.TarjetaClienteBanco;

/**
 *
 * @author lucasgragera
 */
public class Main {
    public static void main(String[] args) {
        // Crear las instancias de Banco y Cliente primero, ya que son independientes
        Banco banco1 = new Banco("Banco del Sol", "20-12345678-9");
        Cliente cliente1 = new Cliente("Ana Garcia", "25896321");

        // Crear la TarjetaDeCredito, pasando las instancias de Cliente y Banco
        TarjetaDeCredito tarjeta1 = new TarjetaDeCredito("4567-8901-2345-6789", "12/2028", cliente1, banco1);

        System.out.println("Información de la Tarjeta:");
        System.out.println("Número: " + tarjeta1.getNumero());
        System.out.println("Fecha de Vencimiento: " + tarjeta1.getFechaVencimiento());

        System.out.println("\nInformación del Cliente (desde Tarjeta):");
        System.out.println("Nombre del Cliente: " + tarjeta1.getCliente().getNombre());
        System.out.println("DNI: " + tarjeta1.getCliente().getDni());
        
        System.out.println("\nInformación del Banco (desde Tarjeta):");
        System.out.println("Nombre del Banco: " + tarjeta1.getBanco().getNombre());
        
        System.out.println("\nInformación de la Tarjeta (desde Cliente):");
        System.out.println("Número de Tarjeta del Cliente: " + cliente1.getTarjeta().getNumero());
    }
}
