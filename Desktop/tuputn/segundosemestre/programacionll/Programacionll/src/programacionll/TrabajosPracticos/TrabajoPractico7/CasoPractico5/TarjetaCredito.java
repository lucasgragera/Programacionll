/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programacionll.TrabajosPracticos.TrabajoPractico7.CasoPractico5;

/**
 *
 * @author lucasgragera
 */
public class TarjetaCredito implements Pagable{
    private String numeroTarjeta;

    public TarjetaCredito(String numeroTarjeta) {
        this.numeroTarjeta = numeroTarjeta;
    }

    @Override
    public void pagar(double monto) {
        System.out.println("Procesando $" + monto + " con Tarjeta de Crédito.");
        System.out.println("  > Tarjeta terminada en: " + numeroTarjeta.substring(numeroTarjeta.length() - 4));
        // Lógica real: conectar con pasarela de pago, verificar saldo, etc.
    }
    
    @Override
    public String obtenerTipo() {
        return "Tarjeta de Crédito";
    }
}
