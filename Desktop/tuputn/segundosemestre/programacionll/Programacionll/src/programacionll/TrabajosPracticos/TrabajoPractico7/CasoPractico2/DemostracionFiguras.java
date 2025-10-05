/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programacionll.TrabajosPracticos.TrabajoPractico7.CasoPractico2;

/**
 *
 * @author lucasgragera
 */
public class DemostracionFiguras {
    public static void main(String[] args) {
        
        // Tarea: Crear un array de figuras
        // El tipo de referencia es Figura (clase base abstracta)
        Figura[] figuras = new Figura[3];
        
        // Almacenar instancias de subclases en el array de la superclase (Upcasting)
        figuras[0] = new Rectangulo(10, 5); // Área = 50.0
        figuras[1] = new Circulo(7);        // Área = ~153.94
        figuras[2] = new Rectangulo(3, 8);  // Área = 24.0

        System.out.println("Cálculo de Áreas usando Polimorfismo");
        
        // Tarea: Mostrar el área de cada una usando polimorfismo.
        for (Figura figura : figuras) {
            // El mismo "mensaje" (calcularArea()) es enviado a todos los objetos.
            // Java invoca automáticamente el método sobrescrito de la clase REAL del objeto.
            figura.mostrarNombre();
            System.out.println(String.format("%.2f", figura.calcularArea()));
        }
    }
}
