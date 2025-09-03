/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programacionll.TrabajosPracticos.TrabajoPractico4;

/**
 *
 * @author lucasgragera
 */
public class Empleado {
    // Atributos de instancia
    private int id;
    private String nombre;
    private String puesto;
    private double salario;
    
    // Atributo estático (de clase)
    private static int totalEmpleados = 0;
    
    // Constructor con todos los atributos
    public Empleado(int id, String nombre, String puesto, double salario) {
        this.id = id;
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = salario;
        totalEmpleados++; // Incrementa el contador global
    }
    
    // Constructor con nombre y puesto, id y salario por defecto
    public Empleado(String nombre, String puesto) {
        this.id = totalEmpleados + 1; // Asigna un id automático
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = 30000.00; // Salario por defecto
        totalEmpleados++; // Incrementa el contador global
    }
    
    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getPuesto() {
        return puesto;
    }

    public double getSalario() {
        return salario;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }
    
    // Métodos sobrecargados para actualizar el salario
    
    // Aumentar salario por porcentaje
    public void actualizarSalario(double porcentajeAumento) {
        if (porcentajeAumento > 0) {
            this.salario += this.salario * (porcentajeAumento / 100);
        }
    }
    
    // Aumentar salario por cantidad fija
    public void actualizarSalario(int cantidadFija) {
        if (cantidadFija > 0) {
            this.salario += cantidadFija;
        }
    }
    
    // Método estático para obtener el total de empleados
    public static int mostrarTotalEmpleados() {
        return totalEmpleados;
    }
    
    // Método toString() para una representación legible del objeto
    @Override
    public String toString() {
        return "ID: " + this.id + ", Nombre: " + this.nombre + ", Puesto: " + this.puesto + ", Salario: $" + String.format("%.2f", this.salario);
    }
}
