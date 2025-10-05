/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programacionll.TrabajosPracticos.TrabajoPractico7.CasoPractico4;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author lucasgragera
 */
public class DemostracionAnimales {
    public static void main(String[] args) {
        
        // Tarea: Crear lista de animales (referencia de tipo Animal)
        List<Animal> granja = new ArrayList<>();
        
        // Upcasting: Almacenar instancias de subclases
        granja.add(new Perro("Fido"));
        granja.add(new Gato("Mishi"));
        granja.add(new Vaca("Lola"));
        granja.add(new Perro("Bobby"));

        System.out.println("El Polimorfismo en la Granja");

        // Tarea: Mostrar sus sonidos con polimorfismo
        for (Animal animal : granja) {
            animal.describirAnimal();
            System.out.print(" dice: ");
            
            // Polimorfismo (Enlace Dinámico): 
            // La JVM llama al método hacerSonido() de la clase REAL (Perro, Gato, Vaca)
            animal.hacerSonido();
        }
    }
}
