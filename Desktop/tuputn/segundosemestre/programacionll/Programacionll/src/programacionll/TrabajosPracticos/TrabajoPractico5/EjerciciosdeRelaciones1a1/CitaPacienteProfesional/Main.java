/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programacionll.TrabajosPracticos.TrabajoPractico5.EjerciciosdeRelaciones1a1.CitaPacienteProfesional;

/**
 *
 * @author lucasgragera
 */
public class Main {
    public static void main(String[] args) {
        // Crear las instancias de Paciente y Profesional primero
        Paciente paciente1 = new Paciente("Maria Torres", "OSDE");
        Profesional profesional1 = new Profesional("Dr. Luis Garcia", "Cardiología");

        // Crear la CitaMédica, pasando las instancias de Paciente y Profesional
        CitaMedica cita1 = new CitaMedica("2025-01-15", "10:00", paciente1, profesional1);

        System.out.println("Información de la Cita Médica:");
        System.out.println("Fecha: " + cita1.getFecha());
        System.out.println("Hora: " + cita1.getHora());

        System.out.println("\nInformación del Paciente (desde la Cita):");
        System.out.println("Nombre: " + cita1.getPaciente().getNombre());
        System.out.println("Obra Social: " + cita1.getPaciente().getObraSocial());

        System.out.println("\nInformación del Profesional (desde la Cita):");
        System.out.println("Nombre: " + cita1.getProfesional().getNombre());
        System.out.println("Especialidad: " + cita1.getProfesional().getEspecialidad());
    }
}
