/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programacionll.TrabajosPracticos.TrabajoPractico7.CasoPractico5;

/**
 *
 * @author lucasgragera
 */
public class SistemaPagos {
    public void procesarPago(Pagable medio, double monto) {
        System.out.println("\n--- Procesando Pago con " + medio.obtenerTipo() + " ---");
        // Polimorfismo: La llamada a pagar() ejecuta el código específico del objeto real.
        medio.pagar(monto);
        System.out.println("¡Pago exitoso!");
    }

    public static void main(String[] args) {
        SistemaPagos sistema = new SistemaPagos();

        // Tarea: Crear distintas formas de pago
        Pagable tarjeta = new TarjetaCredito("4567-8901-2345-6789");
        Pagable transferencia = new Transferencia("0123456789");
        Pagable efectivo = new Efectivo();
        
        // Tarea: Procesarlas con una sola función (procesarPago)
        sistema.procesarPago(tarjeta, 1500.50);
        sistema.procesarPago(transferencia, 500.00);
        sistema.procesarPago(efectivo, 25.99);
    }
}
