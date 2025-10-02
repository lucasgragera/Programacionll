/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package programacionll.TrabajosPracticos.TrabajoPractico6.CasoPractico1;

/**
 *
 * @author lucasgragera
 */
public class Producto {
    
    private String id;
    private String nombre;
    private double precio;
    private int cantidad; // Stock
    private CategoriaProducto categoria;

    public Producto(String id, String nombre, double precio, int cantidad, CategoriaProducto categoria) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.cantidad = cantidad;
        this.categoria = categoria;
    }
    
    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    
    public CategoriaProducto getCategoria() {
        return categoria;
    }
    
    public void mostrarInfo() {
        System.out.println("ID: " + this.id + " | Nombre: " + this.nombre +
                           " | Precio: $" + this.precio + " | Stock: " + this.cantidad +
                           " | Categoría: " + this.categoria.name());
    }
    
    @Override
    public String toString() {
        return "Producto{" +
               "id='" + id + '\'' +
               ", nombre='" + nombre + '\'' +
               ", precio=" + precio +
               ", cantidad=" + cantidad +
               ", categoria=" + categoria.name() + " (" + categoria.getDescripcion() + ")" +
               '}';
    }
}
