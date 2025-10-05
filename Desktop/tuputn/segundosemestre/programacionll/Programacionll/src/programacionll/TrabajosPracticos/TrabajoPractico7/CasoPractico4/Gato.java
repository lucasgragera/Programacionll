/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programacionll.TrabajosPracticos.TrabajoPractico7.CasoPractico4;

/**
 *
 * @author lucasgragera
 */
public class Gato extends Animal{
    public Gato(String nombre) {
        super(nombre, "Gato");
    }

    @Override
    public void hacerSonido() {
        System.out.println("Miau miau."); // Implementación específica
    }
}
