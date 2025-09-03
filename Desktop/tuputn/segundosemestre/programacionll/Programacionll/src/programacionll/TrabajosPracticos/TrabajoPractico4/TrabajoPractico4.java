/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programacionll.TrabajosPracticos.TrabajoPractico4;

/**
 *
 * @author lucasgragera
 */
public class TrabajoPractico4 {
    public static void main(String[] args) {
        
        System.out.println("--- Creando empleados ---");
        
        // Instanciar objetos con el primer constructor
        Empleado emp1 = new Empleado(101, "Juan Perez", "Gerente", 65000.00);
        System.out.println("Empleado 1 creado: " + emp1);
        
        // Instanciar objetos con el segundo constructor
        Empleado emp2 = new Empleado("Maria Lopez", "Desarrollador");
        System.out.println("Empleado 2 creado: " + emp2);

        System.out.println("\n Métodos sobrecargados ---");
        
        // Aumentar el salario del primer empleado por porcentaje
        System.out.println("Salario de " + emp1.getNombre() + " antes del aumento: $" + String.format("%.2f", emp1.getSalario()));
        emp1.actualizarSalario(10.0); // Aumento del 10%
        System.out.println("Salario de " + emp1.getNombre() + " después de aumento del 10%: " + emp1);

        // Aumentar el salario del segundo empleado por cantidad fija
        System.out.println("\nSalario de " + emp2.getNombre() + " antes del aumento: $" + String.format("%.2f", emp2.getSalario()));
        emp2.actualizarSalario(5000); // Aumento de $5000
        System.out.println("Salario de " + emp2.getNombre() + " después de aumento de $5000: " + emp2);

        System.out.println("\n Verificando el contador estático");
        System.out.println("Total de empleados creados: " + Empleado.mostrarTotalEmpleados());
    }
}
