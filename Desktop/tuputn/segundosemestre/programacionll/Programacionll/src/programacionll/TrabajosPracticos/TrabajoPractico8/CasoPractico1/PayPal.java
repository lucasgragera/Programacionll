/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programacionll.TrabajosPracticos.TrabajoPractico8.CasoPractico1;

/**
 *
 * @author lucasgragera
 */
public class PayPal implements Pago {
    @Override
    public boolean procesarPago(double cantidad) {
        System.out.println("Procesando pago con PayPal por $" + cantidad);
        // Lógica real de pago...
        return true; // Simulación exitosa
    }
}
