/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programacionll.TrabajosPracticos.TrabajoPractico7.CasoPractico3;

/**
 *
 * @author lucasgragera
 */
public class EmpleadoPlanta extends Empleado {
    private double sueldoBase;
    private double bonoAnual;

    public EmpleadoPlanta(String nombre, int id, double sueldoBase, double bonoAnual) {
        super(nombre, id);
        this.sueldoBase = sueldoBase;
        this.bonoAnual = bonoAnual;
    }

    @Override
    public double calcularSueldo() {
        return sueldoBase + (bonoAnual / 12.0);
    }
}
