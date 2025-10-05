/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programacionll.TrabajosPracticos.TrabajoPractico7.CasoPractico2;

/**
 *
 * @author lucasgragera
 */
public class Circulo extends Figura {
    private double radio;

    public Circulo(double radio) {
        super("Círculo"); // Llama al constructor de Figura
        this.radio = radio;
    }

    // Implementación obligatoria del método abstracto.
    @Override
    public double calcularArea() {
        return Math.PI * radio * radio;
    }
}
