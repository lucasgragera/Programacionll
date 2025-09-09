/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programacionll.TrabajosPracticos.TrabajoPractico5.EjerciciosdeRelaciones1a1.PasaporteFotoTitular;

/**
 *
 * @author lucasgragera
 */
public class Titular {
    private String nombre;
    private String dni;
    private Pasaporte pasaporte; 

    // Constructor that accepts arguments for nombre and dni
    public Titular(String nombre, String dni) {
        this.nombre = nombre;
        this.dni = dni;
    }
    
    // You can keep the default constructor if needed, but it's not required for this specific case.
    public Titular() {
    }

    // Rest of the methods (setPasaporte, getters) go here...
    public void setPasaporte(Pasaporte pasaporte) {
        this.pasaporte = pasaporte;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDni() {
        return dni;
    }

    public Pasaporte getPasaporte() {
        return pasaporte;
    }
}
