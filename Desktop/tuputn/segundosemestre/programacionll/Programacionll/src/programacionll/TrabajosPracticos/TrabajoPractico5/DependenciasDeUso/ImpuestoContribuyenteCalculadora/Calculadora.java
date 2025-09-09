/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programacionll.TrabajosPracticos.TrabajoPractico5.DependenciasDeUso.ImpuestoContribuyenteCalculadora;

/**
 *
 * @author lucasgragera
 */
public class Calculadora {
    public void calcular(Impuesto impuesto) {
        double monto = impuesto.getMonto();
        System.out.println("Calculando impuesto...");
        System.out.println("Monto original: $" + monto);
        System.out.println("Monto a pagar por " + impuesto.getContribuyente().getNombre());
    }
}
