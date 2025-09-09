/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programacionll.TrabajosPracticos.TrabajoPractico5.EjerciciosdeRelaciones1a1.CuentaClaveTitular;

/**
 *
 * @author lucasgragera
 */
public class Main {
    public static void main(String[] args) {
        // Crear el titular primero
        Titular titular1 = new Titular("Juan Perez", "20123456");

        // Crear la cuenta, que internamente crea una ClaveSeguridad y se asocia al Titular
        CuentaBancaria cuenta1 = new CuentaBancaria("0000000000000000000000", 1500.50, "A1B2C3D4", "2024-10-20", titular1);

        System.out.println("Información de la Cuenta Bancaria:");
        System.out.println("CBU: " + cuenta1.getCbu());
        System.out.println("Saldo: " + cuenta1.getSaldo());

        System.out.println("\nInformación de la Clave de Seguridad (desde Cuenta):");
        System.out.println("Código: " + cuenta1.getClaveSeguridad().getCodigo());
        System.out.println("Última Modificación: " + cuenta1.getClaveSeguridad().getUltimaModificacion());

        System.out.println("\nInformación del Titular (desde Cuenta):");
        System.out.println("Nombre: " + cuenta1.getTitular().getNombre());

        System.out.println("\nInformación de la Cuenta (desde Titular):");
        System.out.println("CBU del titular: " + titular1.getCuentaBancaria().getCbu());
    }
}
