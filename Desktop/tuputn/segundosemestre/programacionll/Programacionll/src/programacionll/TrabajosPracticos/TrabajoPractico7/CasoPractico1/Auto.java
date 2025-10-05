/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programacionll.TrabajosPracticos.TrabajoPractico7.CasoPractico1;

/**
 *
 * @author lucasgragera
 */
public class Auto extends Vehiculo{
    private int cantidadPuertas;

    // Constructor de la subclase. Llama al constructor de la superclase con super().
    public Auto(String marca, String modelo, int cantidadPuertas) {
        super(marca, modelo);
        this.cantidadPuertas = cantidadPuertas;
    }

    // Sobrescritura (Overriding) del método de la clase base
    // Esto es polimorfismo por herencia
    @Override
    public void mostrarInfo() {
        // Llama a la implementación del padre para reutilizar el código
        super.mostrarInfo(); 
        System.out.println("Puertas: " + cantidadPuertas);
        System.out.println("---------------------------------");
    }

    // Método main para la Tarea de instancia y demostración
    public static void main(String[] args) {
        // Tarea: Instanciar un auto
        Auto miAuto = new Auto("Toyota", "Corolla", 4);

        // Mostrar su información completa (se llama a la versión sobrescrita del método)
        System.out.println("Demostración de Herencia y Polimorfismo (Sobrescritura):");
        miAuto.mostrarInfo();
        
        // --- Demostración adicional de Polimorfismo por Upcasting ---
        // Se puede usar una referencia de la clase base para apuntar a la subclase
        Vehiculo vehiculoPolimorfico = new Auto("Ford", "Focus", 5);
        
        // Aunque la referencia es Vehiculo, se llama al método sobrescrito de Auto.
        System.out.println("\nDemostración de Upcasting (Polimorfismo en acción):");
        vehiculoPolimorfico.mostrarInfo();
    }
}
