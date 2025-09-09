/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programacionll.TrabajosPracticos.TrabajoPractico5.EjerciciosdeRelaciones1a1.VehiculoMotorConductor;

/**
 *
 * @author lucasgragera
 */
public class Main {
    public static void main(String[] args) {
        // Crear las partes primero
        Motor motor1 = new Motor("Gasolina", "MS12345");
        Conductor conductor1 = new Conductor("Lucas", "B-987654");

        // Crear el Vehículo, pasando las instancias de Motor y Conductor
        Vehiculo vehiculo1 = new Vehiculo("XYZ-123", "Sedán", motor1, conductor1);

        System.out.println("Información del Vehículo:");
        System.out.println("Modelo: " + vehiculo1.getModelo());
        System.out.println("Patente: " + vehiculo1.getPatente());

        System.out.println("\nInformación del Motor (desde Vehículo):");
        System.out.println("Tipo: " + vehiculo1.getMotor().getTipo());
        System.out.println("Número de Serie: " + vehiculo1.getMotor().getNumeroSerie());

        System.out.println("\nInformación del Conductor (desde Vehículo):");
        System.out.println("Nombre: " + vehiculo1.getConductor().getNombre());
        
        System.out.println("\nInformación del Vehículo (desde Conductor):");
        System.out.println("Modelo del vehículo del conductor: " + conductor1.getVehiculo().getModelo());
    }
}
