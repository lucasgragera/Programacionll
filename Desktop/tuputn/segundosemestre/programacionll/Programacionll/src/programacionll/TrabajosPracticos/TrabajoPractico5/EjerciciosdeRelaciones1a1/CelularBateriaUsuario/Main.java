/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programacionll.TrabajosPracticos.TrabajoPractico5.EjerciciosdeRelaciones1a1.CelularBateriaUsuario;

/**
 *
 * @author lucasgragera
 */
public class Main {
    public static void main(String[] args) {
        // Crear las partes primero, lo que refleja la agregación
        Bateria bateria1 = new Bateria("Li-ion", 5000);
        Usuario usuario1 = new Usuario("Maria Lopez", "98765432");

        // Crear el celular, pasando las instancias de Bateria y Usuario
        Celular celular1 = new Celular("860000000000000", "Samsung", "Galaxy S23", bateria1, usuario1);

        System.out.println("Información del Celular:");
        System.out.println("Marca: " + celular1.getMarca());
        System.out.println("Modelo: " + celular1.getModelo());
        
        System.out.println("\nInformación de la Batería (desde Celular):");
        System.out.println("Modelo: " + celular1.getBateria().getModelo());
        System.out.println("Capacidad: " + celular1.getBateria().getCapacidad() + " mAh");
        
        System.out.println("\nInformación del Usuario (desde Celular):");
        System.out.println("Nombre: " + celular1.getUsuario().getNombre());
        
        System.out.println("\nInformación del Celular (desde Usuario):");
        System.out.println("IMEI del celular del usuario: " + usuario1.getCelular().getImei());
    }
}
