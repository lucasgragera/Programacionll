/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programacionll.TrabajosPracticos.TrabajoPractico7.CasoPractico2;

/**
 *
 * @author lucasgragera
 */
public class Rectangulo extends Figura {
    private double ancho;
    private double alto;

    public Rectangulo(double ancho, double alto) {
        super("Rectángulo"); // Llama al constructor de Figura
        this.ancho = ancho;
        this.alto = alto;
    }

    // Implementación obligatoria del método abstracto.
    @Override
    public double calcularArea() {
        return ancho * alto;
    }
}
