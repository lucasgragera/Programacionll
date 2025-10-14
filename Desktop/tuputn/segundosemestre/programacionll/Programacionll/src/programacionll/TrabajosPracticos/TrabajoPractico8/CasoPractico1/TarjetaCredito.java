/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programacionll.TrabajosPracticos.TrabajoPractico8.CasoPractico1;

/**
 *
 * @author lucasgragera
 */
public class TarjetaCredito implements PagoConDescuento{
    private double tasaDescuento = 0.05; // 5% de descuento

    @Override
    public boolean procesarPago(double cantidad) {
        System.out.println("Procesando pago con Tarjeta de Crédito por $" + cantidad);
        // Lógica real de pago...
        return true; // Simulación exitosa
    }

    @Override
    public double aplicarDescuento(double cantidad) {
        double cantidadFinal = cantidad * (1 - tasaDescuento);
        System.out.println("Descuento de " + (tasaDescuento * 100) + "% aplicado. Total: $" + cantidadFinal);
        return cantidadFinal;
    }
}
