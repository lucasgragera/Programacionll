/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programacionll.TrabajosPracticos.TrabajoPractico5.EjerciciosdeRelaciones1a1.VehiculoMotorConductor;

/**
 *
 * @author lucasgragera
 */
public class Vehiculo {
    private String patente;
    private String modelo;
    private Motor motor; // Relación de agregación
    private Conductor conductor; // Asociación bidireccional

    public Vehiculo(String patente, String modelo, Motor motor, Conductor conductor) {
        this.patente = patente;
        this.modelo = modelo;
        this.motor = motor;
        this.conductor = conductor;

        // Establecer la relación inversa en el conductor
        conductor.setVehiculo(this);
    }

    // Getters
    public String getPatente() {
        return patente;
    }

    public String getModelo() {
        return modelo;
    }

    public Motor getMotor() {
        return motor;
    }

    public Conductor getConductor() {
        return conductor;
    }
}
