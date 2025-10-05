/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programacionll.TrabajosPracticos.TrabajoPractico7.CasoPractico5;

/**
 *
 * @author lucasgragera
 */
public class Efectivo implements Pagable{
    @Override
    public void pagar(double monto) {
        System.out.println("Pago de $" + monto + " realizado en efectivo.");
        System.out.println("  > Requiere conteo físico y cambio.");
    }
    
    @Override
    public String obtenerTipo() {
        return "Efectivo";
    }
}
