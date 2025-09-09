/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programacionll.TrabajosPracticos.TrabajoPractico5.DependenciasDeUso.ImpuestoContribuyenteCalculadora;

/**
 *
 * @author lucasgragera
 */
public class Main {
    public static void main(String[] args) {
        // Crear el Contribuyente
        Contribuyente contribuyente1 = new Contribuyente("Juan Pablo", "20-12345678-9");

        // Crear el Impuesto, asociándolo al Contribuyente
        Impuesto impuesto1 = new Impuesto(500.75, contribuyente1);

        // Crear la Calculadora
        Calculadora miCalculadora = new Calculadora();

        // Usar la Calculadora para calcular el Impuesto (Dependencia de Uso)
        System.out.println("--- Iniciando cálculo de impuesto ---");
        miCalculadora.calcular(impuesto1);
    }

}
