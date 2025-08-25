/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programacionll.TrabajosPracticos.TrabajoPractico3;

/**
 *
 * @author lucasgragera
 */
public class NaveEspacial {
    private String nombre;
    private double combustible;
    private static final double COMBUSTIBLE_MAXIMO = 100.0; 
    
    public void despegar() {
        System.out.println("La nave " + nombre + " está despegando!");
    }
    public void avanzar(double distancia) {
        double consumo = distancia * 0.1; // Se asume un consumo de 0.1 unidades por cada unidad de distancia
        if(combustible >= consumo){
            combustible -= consumo;
            System.out.println("La nave " + nombre + " avanza " + distancia + " unidades. Combustible restante: " + String.format("%.2f", combustible));
        } else {
            System.out.println("Advertencia No hay suficiente combustible para avanzar " + distancia + " unidades. Se necesitan " + String.format("%.2f", consumo) + " y solo tienes " + String.format("%.2f", combustible) + ".");
        }
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCombustible(double combustible) {
        this.combustible = combustible;
    }
    public void recargarCombustible(double cantidad) {
        if(combustible + cantidad <= COMBUSTIBLE_MAXIMO) {
            combustible += cantidad;
            System.out.println("La nave " + nombre + " ha recargado " + cantidad + " unidades. Combustible total: " + String.format("%.2f", combustible));
        } else {
            System.out.println("Error No se puede recargar " + cantidad + " unidades. Supera el límite de combustible.");
        }
    }
    public void mostrarEstado() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Combustible: " + String.format("%.2f", combustible) + " de " + COMBUSTIBLE_MAXIMO);
    }
}
