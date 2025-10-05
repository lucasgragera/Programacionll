/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programacionll.TrabajosPracticos.TrabajoPractico7.CasoPractico3;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author lucasgragera
 */
public class GestionEmpleados {
    public static void main(String[] args) {
        
        // Tarea: Crear lista de empleados
        List<Empleado> listaEmpleados = new ArrayList<>();
        
        // Upcasting: Almacenar subclases en referencias de la superclase
        listaEmpleados.add(new EmpleadoPlanta("Ana López", 101, 3000.0, 600.0));
        listaEmpleados.add(new EmpleadoTemporal("Juan Pérez", 205, 25.0, 160));
        listaEmpleados.add(new EmpleadoPlanta("Luis Garcia", 102, 3500.0, 800.0));
        listaEmpleados.add(new EmpleadoTemporal("Marta Ruiz", 210, 30.0, 100));

        System.out.println("Cálculo de Sueldos (Polimorfismo por Sobrescritura)");

        // Tarea: Invocar calcularSueldo() polimórficamente
        for (Empleado emp : listaEmpleados) {
            emp.mostrarInfo();
            // La JVM llama al calcularSueldo() específico de EmpleadoPlanta o EmpleadoTemporal
            System.out.println(String.format(", Sueldo: $%.2f", emp.calcularSueldo()));
        }

        System.out.println("\nClasificación de Empleados (instanceof)");
        
        // Tarea: Usar instanceof para clasificar
        int plantaCount = 0;
        int temporalCount = 0;

        for (Empleado emp : listaEmpleados) {
            if (emp instanceof EmpleadoPlanta) {
                plantaCount++;
                System.out.println(emp.nombre + " es un Empleado de Planta.");
            } else if (emp instanceof EmpleadoTemporal) {
                temporalCount++;
                System.out.println(emp.nombre + " es un Empleado Temporal.");
            }
        }
        
        System.out.println("\nResumen: Planta (" + plantaCount + "), Temporal (" + temporalCount + ")");
    }
}
